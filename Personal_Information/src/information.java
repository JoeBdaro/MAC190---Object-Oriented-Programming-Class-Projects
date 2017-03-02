import java.util.Scanner;

public class information {

		public static void main (String [] args) {
			String firstName;
			String lastName;
			String month;
			int day;
			int year;
			

			System.out.println ("Please enter your first name: ");
			Scanner keyboard = new Scanner(System.in);
			firstName = keyboard.nextLine();
			
			System.out.println ("Please enter your last name name: ");
			lastName = keyboard.nextLine();
			
			System.out.println ("Please enter your month (letters), followed by date (integer) and year(integer): ");
			month = keyboard.nextLine();
			day = keyboard.nextInt();
			year = keyboard.nextInt();
		
			System.out.println("hello: " + firstName + ", " +lastName + " . You were born on: " + month + " /" + day + " /" + year);
			keyboard.close();
		}
	 
	}