import java.util.Scanner;

public class circumference_SurfaceArea {

	public static final double PI = 3.14;
	public static void main (String [] args) {
		double diameter = 0;
		double radius;
		double circumferance;
		double surface;
		
		System.out.println ("Please enter the diameter to receive the Surface and the Circumferance of the circle");
		Scanner keyboard = new Scanner(System.in);
		diameter = keyboard.nextDouble();
		radius = diameter / 2;
		circumferance = 2 * PI * radius;
		surface = PI * (radius * radius);
		System.out.println("The Surface is: " + surface + " and the Circumferance is: " + circumferance);
		keyboard.close();
	}

}
