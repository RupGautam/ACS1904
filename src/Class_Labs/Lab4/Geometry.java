/*
 * Copyright (c) 2017.
*/

package Class_Labs.Lab4;
/**
 * Created by RupGautam on 29/09/2017.
 */


import java.util.Scanner;

/**
 * This program demonstrates static methods
 */
public class Geometry {

	/**
	 * @param args Main method
	 */

	public static void main(String[] args) {
		int choice; // The user's choice
		double value = 0; // The method's return value
		char letter; // The user's Y or N decision
		double radius; // The radius of the circle
		double length; // The length of the rectangle
		double width; // The width of the rectangle
		double height; // The height of the triangle
		double base; // The base of the triangle

		double side1; // The first side of the triangle
		double side2; // The second side of the triangle
		double side3; // The third side of the triangle
// Create a scanner object to read from the keyboard
		Scanner keyboard = new Scanner ( System.in );
// The do loop allows the menu to be displayed first
		do {
// TASK #1 Call the printMenu method
			/**
			 * Print the menu and present with choices
			 */
			printMenu ( );
			choice = keyboard.nextInt ( );
			switch (choice) {
				case 1:
					System.out.print ( "Enter the radius of " + "the circle: " );
					radius = keyboard.nextDouble ( );
// TASK #3 Call the circleArea method and
// store the result in the value variable
					value = circleArea ( radius );
					System.out.println ( "The area of the " + "circle is " + value );
					break;
				case 2:
					System.out.print ( "Enter the length of " + "the rectangle: " );
					length = keyboard.nextDouble ( );
					System.out.print ( "Enter the width of " + "the rectangle: " );
					width = keyboard.nextDouble ( );
					value = rectangleArea ( length, width );
// TASK #3 Call the rectangleArea method and
// store the result in the value variable
					System.out.println ( "The area of the " + "rectangle is " + value );
					break;
				case 3:
					System.out.print ( "Enter the height of " + "the triangle: " );
					height = keyboard.nextDouble ( );
					System.out.print ( "Enter the base of " + "the triangle: " );
					base = keyboard.nextDouble ( );
					value = triangleArea ( height, base );
// TASK #3 Call the triangleArea method and
// store the result in the value variable
					System.out.println ( "The area of the " + "triangle is " + value );
					break;
				case 4:
					System.out.print ( "Enter the radius of " + "the circle: " );
					radius = keyboard.nextDouble ( );
					value = circleCircumference ( radius );

// TASK #3 Call the circumference method and
// store the result in the value variable

					System.out.println ( "The circumference " + "of the circle is " + value );
					break;
				case 5:
					System.out.print ( "Enter the length of " + "the rectangle: " );
					length = keyboard.nextDouble ( );
					System.out.print ( "Enter the width of " + "the rectangle: " );
					width = keyboard.nextDouble ( );
					value = rectanglePerimeter ( length, width );
					System.out.println ( "The perimeter of " + "the rectangle is " + value );
					break;

				case 6:
					System.out.print ( "Enter the length of " + "side 1 of the " + "triangle: " );
					side1 = keyboard.nextDouble ( );
					System.out.print ( "Enter the length of " + "side 2 of the " + "triangle: " );
					side2 = keyboard.nextDouble ( );
					System.out.print ( "Enter the length of " + "side 3 of the " + "triangle: " );
					side3 = keyboard.nextDouble ( );
					value = trianglePerimeter ( side1, side2, side3 );
					System.out.println ( "The perimeter of " + "the triangle is " + value );
					break;
				default:
					System.out.println ( "You did not enter " + "a valid choice." );
			}
			keyboard.nextLine ( ); // Consume the new line
			System.out.println ( "Do you want to exit " + "the program (Y/N)?: " );
			String answer = keyboard.nextLine ( );
			letter = answer.charAt ( 0 );
		} while (letter != 'Y' && letter != 'y');
	}

	/**
	 * Prints menu for users to choose from
	 */
	public static void printMenu() {
		System.out.println ( "This is a geometry calculate" );
		System.out.println ( "Choose what you would like to calculate" );
		System.out.println ( "\n1. Find the area of a circle." +
				"\n2. Find the area of a rectangle." +
				"\n3. Find the area of a triangle." +
				"\n4. Find the circumference of a circle." +
				"\n5. Find the perimeter of a rectangle." +
				"\n6. Find the perimeter of a triangle" +
				"\n\n Enter the number of your choice: " );

	}

	/**
	 * @param radius takes double as radius
	 * @return Returns the area of Circle
	 */
	public static double circleArea(double radius) {
		double area = Math.PI * Math.pow ( radius, 2 );

		return area;
	}

	/**
	 * @param length takes length as double
	 * @param width takes width as double
	 * @return Returns area as double
	 */

	public static double rectangleArea(double length, double width) {
		double area = length * width;

		return area;
	}

	/**
	 * Return the area of triangle
	 *
	 * @param base takes double as base
	 * @param height takes double as height
	 * @return Returns areas as double
	 */
	public static double triangleArea(double base, double height) {
		double area = 0.5 * base * height;

		return area;
	}

	/**
	 * Return circumference of a circle
	 *
	 * @param radius takes double as radius
	 * @return Returns area as double
	 */
	public static double circleCircumference(double radius) {
		double area = 2 * Math.PI * radius;

		return area;
	}

	/**
	 * Return the perimeter of rectangle
	 *
	 * @param length takes double as length
	 * @param width takes double as width
	 * @return Returns area
	 */
	public static double rectanglePerimeter(double length, double width) {
		double area = 2 * (length + width);

		return area;
	}

	/**
	 * Return the perimeter of triangle
	 *
	 * @param side1 takes double as side1
	 * @param side2 takes double as side2
	 * @param side3 takes double as side3
	 * @return Returns area
	 */
	public static double trianglePerimeter(double side1, double side2, double side3) {
		double area = side1 + side2 + side3;

		return area;
	}

// TASK #1 Create the printMenu method here
// TASK #2 Create the value-returning methods here
// TASK #4 Write javadoc comments for each method
}
