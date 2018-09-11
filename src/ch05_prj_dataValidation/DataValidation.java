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
			length = getDouble(sc, "Enter length:\t");
			width = getDouble(sc, "Enter width:\t");
			// logic
			area = (length * width);
			perimeter = (2 * width + 2 * length);
			// user output
			System.out.println("Area:\t        " + area + "\n" + "Perimeter:\t" + perimeter);

			choice = getString(sc, "Continue:\t (y/n)\t");
		}
		// Goodbye statement/scanner close
		System.out.println("Goodbye");
		sc.close();

	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error!");
			}
			sc.nextLine();
		}
		return d;
	}

	public static String getString(Scanner sc, String prompt) {
		String d = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
			if (sc.hasNext()) {
				d = sc.next();
				isValid = true;
			}
			if (d.equalsIgnoreCase("y")) {
				isValid = true;
			}
			if (d.equalsIgnoreCase("n")) {
				isValid = true;
			} else {
				System.out.println("Error!");
			}
			sc.nextLine();
		}
		return d;
	}
}