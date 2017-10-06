package Class_Assignments.Assignment1;
/**
 * Created by RupGautam on 20/09/2017.
 */

import java.util.Scanner;

/**
 * Copyright ${COPYRIGHT}.
 */
public class ArrayOperations2DDemo {

	public static void main(String[] args) {
		Scanner kb = new Scanner ( System.in );
		int[][] iarray01 = {{2, 1, 9},
				{7, 3, 4}};
		int[][] iarray02 = {{8, 3, 2, 1, 5},
				{8, 9, 1, 1, 2},
				{7, 8, 7, 7, 6}};
		float[][] farray01 = {{3.5f, 4.6f, 1.7f},
				{8.9f, 2.1f, 6.2f}};
		float[][] farray02 = {{1.3f, 2.5f},
				{9.2f, 1.5f},
				{5.2f, 0.7f},
				{6.8f, 9.2f}};

		//Creating an test object
		ArrayOperations2D test = new ArrayOperations2D ( );

		/**
		 * Displaying the total values from the 2D arrays
		 */
		System.out.println ( "The total values in the arrayI 01 is: " + test.getTotal ( iarray01 ) );
		System.out.println ( "The total values in the arrayI 02 is: " + test.getTotal ( iarray02 ) );
		System.out.println ( "The total values in the arrayF 01 is: " + test.getTotal ( farray01 ) );
		System.out.println ( "The total values in the arrayF 02 is: " + test.getTotal ( farray02 ) );
		System.out.println ( " " );

		/**
		 * Displaying the average from the 2D array
		 */
		System.out.println ( "The average total in the arrayI 01 is: " + test.getAverage ( iarray01 ) );
		System.out.println ( "The average total in the arrayI 02 is: " + test.getAverage ( iarray02 ) );
		System.out.println ( "The average total in the arrayF 01 is: " + test.getAverage ( farray01 ) );
		System.out.println ( "The average total in the arrayF 02 is: " + test.getAverage ( farray02 ) );

		/**
		 * Display the highest from the 2D array
		 * using userSelection to select Highest method or Column total
		 * Displaying the column total for each column in 2D array
		 */
		System.out.println ( " " );
		System.out.println ( "What do you want to get?:\t1. Get Highest\t 2 .Get ColumnTotal" );
		int userSelection = kb.nextInt ( );
		/**
		 * Options for user to selection from 1 or 2
		 * 1 being called for getting the highest in row
		 * 2 being called for getting the column total in column
		 */
		if (userSelection == 1) { // if 1 enter the method to get Column total
			System.out.println ( " " );
			System.out.print ( "Please enter array number: " );

			int arrayNumber = kb.nextInt ( );
			System.out.print ( "Please enter column number: " );
			int rowNumber = kb.nextInt ( );

			/**
			 * Switch case to determine the user selection
			 */
			switch (arrayNumber) {
				case 1:
					System.out.println ( "\nThe highest value in row#" + rowNumber +
							" is: " + test.getHighestInRow ( iarray01, rowNumber ) );
					break;
				case 2:
					System.out.println ( "\nThe highest value in row#" + rowNumber +
							" is: " + test.getHighestInRow ( iarray02, rowNumber ) );
					break;
				case 3:
					System.out.println ( "\nThe highest value in row#" + rowNumber +
							" is: " + test.getHighestInRow ( farray01, rowNumber ) );
					break;
				case 4:
					System.out.println ( "\nThe highest value in row#" + rowNumber +
							" is: " + test.getHighestInRow ( farray02, rowNumber ) );
					break;
				default:
					System.out.println ( "Invalid number of arrays!!" );

			}
		} else if (userSelection == 2) {

			System.out.print ( "Please enter array number: " );

			int arrayNumber = kb.nextInt ( );

			System.out.print ( "Please enter column number: " );
			int columnNumber = kb.nextInt ( );

			/**
			 * Switch case to determine the user selection
			 */
			switch (arrayNumber) {
				case 1:
					System.out.println ( "\nThe column Total for Column#" + columnNumber +
							" total is: " + test.getColumnTotal ( iarray01, columnNumber ) );
					break;
				case 2:
					System.out.println ( "\nThe column Total for Column#" + columnNumber +
							" total is: " + test.getColumnTotal ( iarray02, columnNumber ) );
					break;
				case 3:
					System.out.println ( "\nThe column Total for Column#" + columnNumber +
							" total is: " + test.getColumnTotal ( farray01, columnNumber ) );
					break;
				case 4:
					System.out.println ( "\nThe column Total for Column#" + columnNumber +
							" total is: " + test.getColumnTotal ( farray02, columnNumber ) );
					break;
				default:
					System.out.println ( "Invalid number of arrays!!" );

			}

		}

	}

}


