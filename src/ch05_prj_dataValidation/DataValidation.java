package ch05_prj_dataValidation;

import java.util.Scanner;

public class DataValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the rectangle calculator");
		Scanner sc = new Scanner(System.in);

		// variables
		double length = 0.0;
		double width = 0.0;
		double area = 0.0;
		double perimeter = 0.0;
		String choice = "y";

		// while loop
		while (choice.equalsIgnoreCase("y")) {

			// user input
			length = Console.getDouble("Enter length:\t");
			// logic
			width = Console.getDouble("Enter width:\t");
			area = (length * width);
			perimeter = (2 * width + 2 * length);
			// user output
			System.out.println("Area:\t        " + area + "\n" + "Perimeter:\t" + perimeter);
			// validation
			choice = Console.getString("Continue(y/n)?  ", "y", "n");
		}
		// Goodbye statement/scanner close
		System.out.println("Goodbye");
		sc.close();
	}
}
