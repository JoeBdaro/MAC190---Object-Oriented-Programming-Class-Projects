import java.util.Scanner;

public class combinedLength {


	public static void main (String [] args){

		String stringOne;
		int lengthOne;
		String stringTwo;
		int lengthTwo;
		String Combined;
		int lengthCombined;

		System.out.println ("Please enter a string for StringOne: ");
		Scanner keyboard = new Scanner (System.in);
		stringOne = keyboard.nextLine();
		lengthOne = stringOne.length();
		System.out.println (stringOne + " Has a string length of: " + lengthOne);

		System.out.println ("Please enter a string for StringTwo: ");
		stringTwo = keyboard.nextLine();
		lengthTwo = stringTwo.length();
		System.out.println (stringTwo + " Has a string length of: " + lengthTwo );


		Combined = stringOne.concat(" " + stringTwo);
		lengthCombined = Combined.length();

		System.out.println(Combined + " is the length of the combined strings is: " + lengthCombined);
		keyboard.close();


	}
}
