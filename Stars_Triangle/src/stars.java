import java.util.Scanner;

public class stars {

	public static void main (String [] args){

		int lines, numberLines, stars;

		System.out.println("Please enter how many lines you want: ");
		Scanner keyboard = new Scanner (System.in);
		numberLines = keyboard.nextInt();

		for(lines = 0; lines < numberLines; lines++){
			for(stars = 0; stars < numberLines - lines; stars++){
				System.out.print("*");
			}
			System.out.println("");
		}
		keyboard.close();
	}
}
