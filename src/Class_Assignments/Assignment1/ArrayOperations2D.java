package Class_Assignments.Assignment1;
/**
 * Created by RupGautam on 20/09/2017.
 */

import java.util.Scanner;

/**
 * Copyright ${COPYRIGHT}.
 */
public class ArrayOperations2D {

	Scanner kb = new Scanner ( System.in );
	private float totalFloat;
	private float averageFloat;
	private int averageInt;
	private float totalArrayFloat;
	private int totalArrayInt;
	private int totalInt;

	/**
	 * Returns the sum of all the elements in a 2D arrays of lists
	 */

	public float getTotal(float[][] array) {
		totalFloat = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				totalFloat += array[row][col];
			}
		}
		return totalFloat;
	}

	/**
	 * Returns the sum of all the elements in 2D arrays but int.
	 */
	public int getTotal(int[][] array) {
		totalInt = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				totalInt += array[row][col];
			}
		}
		return totalInt;
	}


	/**
	 * Returns the sum of one column in a 2D array.
	 */
	public float getColumnTotal(float[][] array, int sb) {
		float total = 0;
		int col = array[0].length;

		if (sb > col) {
			System.out.println ( "Subscript index doesn't exist!!" );
		} else {
			for (int row = 0; row < array.length; row++) {
				total += array[row][sb - 1];
			}
		}
		return total;

	}

	/**
	 * Returns the sum of one column in a 2D array.
	 */
	public int getColumnTotal(int[][] array, int sb) {
		int total = 0;
		int y = array[0].length;

		if (sb > y) {
			System.out.println ( "Subscript index does not exist!!" );
		} else {
			for (int row = 0; row < array.length; row++) {
				total += array[row][sb - 1];
			}
		}
		return total;

	}

	/**
	 * Return average for float[][] array
	 */
	public float getAverage(float[][] array) {
		averageFloat = 0;
		totalArrayFloat = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				totalArrayFloat += array[row][col];
			}
			float temp = array[0].length * array.length;

			averageFloat = totalArrayFloat / temp;
		}
		return averageFloat;

		/**
		 * Return average for int[][] array
		 */
	}

	public int getAverage(int[][] array) {
		averageInt = 0;
		totalArrayInt = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				totalArrayInt += array[row][col];
			}
			int temp = array[0].length * array.length;

			averageInt = totalArrayInt / temp;
		}
		return averageInt;
	}

	/**
	 * returns the highest value in int
	 */
	public int getHighestInRow(int[][] array, int sb) {
		int highest = 0;
		if (sb > array.length) {
			System.out.print ( "You entered" );
			System.exit ( 0 );
		} else {
			highest = array[sb - 1][0];
			int temp = 0;

			for (int index = 0; index < array.length; index++) {
				temp = array[sb - 1][index];
				if (temp > highest) {
					highest = temp;
				}
			}
		}
		return highest;
	}

	/**
	 * Returns the Highest value in float
	 */
	public float getHighestInRow(float[][] array, int i) {

		float highest = array[i - 1][0];
		float temp = 0;

		for (int index = 0; index < array.length; index++) {
			temp = array[i - 1][index];
			if (temp > highest) {
				highest = temp;
			}
		}
		return highest;

	}

}

