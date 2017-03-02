import java.util.Scanner;

public class calculator {

	public static void main(String [] args){
		
		double BMI, mass, height;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your Mass in Kg");
		mass = keyboard.nextDouble();
		System.out.println("Please enter your height in meters");
		height = keyboard.nextDouble();

		BMI = mass / Math.pow(height, 2);

		if(BMI < 18.5){
			System.out.println("You're underweight");
		}
		else if (BMI < 25){
			System.out.println("You're Normal Weight");
		}
		else if (BMI < 30){
			System.out.println("You're Overweight");
		}
		else System.out.println("You're Obese");

		keyboard.close();
	}
}
