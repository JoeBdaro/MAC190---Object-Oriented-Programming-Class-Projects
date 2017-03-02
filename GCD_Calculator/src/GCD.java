import java.util.Scanner;

public class GCD {

	public static void main (String [] args){

		int first, second;
		int rem;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Please enter an integer for first: ");
		first = keyboard.nextInt();
		System.out.println("Please enter an integer for second: ");
		second = keyboard.nextInt();
		rem = first % second;

		while(rem != 0){
			first = second;
			second = rem;
			rem = first % second;
		}
		System.out.println("The GCD is: " + second);
		keyboard.close();
	}
}
