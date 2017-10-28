/* Developer: Serhiy Bardysh
 * Created Calculator for basic calculations of Area, Perimeter and Volume 
 * where data for all 3 was entered by user.
*/
import java.util.Scanner;

public class ClassroomCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double roomLength = 0.0;
		double roomWidth = 0.0;
		double roomHeight = 0.0; 
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		System.out.println("Enter classroom Lenth: ");
		roomLength = scnr.nextDouble();
		System.out.println("Enter classrom Width: ");
		roomWidth = scnr.nextDouble();
		System.out.println("Enter room Height: ");
		roomHeight = scnr.nextDouble();
		
		System.out.println("Area: " + (roomLength * roomWidth));
		System.out.println("Perimeter: " + ((roomLength + roomWidth) + (roomLength + roomWidth)));
		System.out.println("Volume: " + (roomLength * roomWidth * roomHeight));
		scnr.nextLine();
		
		System.out.println("Would you like to Continue? y/n");
		choice = scnr.nextLine();
		
		}
		System.out.println("The end.");
		scnr.close();
	}
	
}
