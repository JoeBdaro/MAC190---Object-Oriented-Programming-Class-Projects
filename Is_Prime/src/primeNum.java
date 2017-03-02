import java.util.Scanner;

public class primeNum {
	static boolean isPrime(int num){
		for (int i = 2; i <= Math.sqrt(num); i++){
			if (num % i==0){
				return false;				}
		}
		return true;
	}
	public static void main(String [] args){

		int myNum;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("enter a number: ");
		myNum = keyboard.nextInt();
		boolean result = isPrime(myNum);

		if (result == false){
			System.out.println( myNum + " is not a prime number ");
		}
		else{
			System.out.println( myNum + " is a prime number");
		}

		keyboard.close();
	}
}


