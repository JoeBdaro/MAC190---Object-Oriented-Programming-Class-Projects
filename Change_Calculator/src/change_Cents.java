import java.util.Scanner;

public class change_Cents {
	public static void main (String [] args) {

		int numberCents;
		int quarters, dimes, nickles, pennies;
		// INVITE USER TO ENTER THE NUMBER OF CENTS
		System.out.println ("Please enter how many cents (0-99): ");
		//GET THE NUMBER INTO THE VARIABLE NUMBERCENTS
		//FIRST CREATE A SCANNER FOR THE KEYBOARD
		Scanner keyboard = new Scanner(System.in); 
		//READ AN INTEGER INTO THE VARIABLE NUMBERCENTS
		numberCents = keyboard.nextInt();
		// how many quarters first
		quarters = numberCents / 25;
		//how many cents left
		numberCents = numberCents % 25;
		//how many dimes
		dimes = numberCents / 10;
		//how many cents left
		numberCents = numberCents % 10;
		//how many nickles
		nickles = numberCents / 5;
		//how many cents left
		pennies = numberCents % 5;
		System.out.println("There are " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickles, " + pennies + " pennies");
		keyboard.close();

	}
}
