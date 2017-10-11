/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Assignments.Assignment2;

import java.util.Scanner;

public class LoShuMagicSquare {

	public static void main(String[] args) {
		int[][] square = new int[3][3];
		Scanner kb = new Scanner ( System.in );

		// Read in the user's magic square.
		System.out.println ( "Please enter your magic square." );
		for (int i = 0; i < 3; i++) {
			System.out.println ( "Enter For Row #" + (i + 1) + " :" );
			for (int j = 0; j < 3; j++) {
				System.out.print ( "Enter Column #" + (j + 1) + " :" );
				square[i][j] = kb.nextInt ( );
				if (square[i][j] < 1 || square[i][j] > 9) {
					System.out.println ( "I am here" );
					System.exit ( 0 );
				}

			}
		}
			if (checkForSums ( square ) && checkForDup ( square ))
				System.out.println ( "It's a Magic Square" );
			else
				System.out.println ( "It's not a Magic Square" );

	}

	/**
	 * Returns true if all 3x3 has valid 1 - 9 numbers (no-repetition of numbers)
	 *
	 * @return Returns true if all statement passes
	 */
	private static boolean checkForDup(int[][] square) {
		// Store all the input in array
		int[] count = new int[9];
		int k = 0;

		// Fill all row init value as 0
		for (int i = 0; i < 9; i++) {
			count[i] = 0;
		}
		//For Row
		for (int i = 0; i < 3; i++) {
			// For Column
			for (int j = 0; j < 3; j++) {
				count[k] = square[i][j];
				k++;

				for (int s = 0; s < k; s++) {
					if (square[i][j] == count[s]) {
						System.out.println ( "here bro here!!!" );
						return false;
					}
				}
			}
		}
		return true;
	}
		// If any number from 1-9 is missing, then return false
/*
		for (int i = 0; i < 9; i++) {

		if (count[i] != 1) {
				System.out.println ( Arrays.toString ( count) );
				System.out.println ("here bro here" );
				return false;
			}
			else {
				System.out.print ( "lol" );
				continue;
			}

		}
		return true;
	}
*/

	/**
	 * Returns true when all 3x3 row/col & 2 diagonals sums up 15.
	 */
	private static boolean checkForSums(int[][] square) {

		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += square[i][j];
			}
			if (sum != 15) {
				return false;
			}
		}

		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += square[j][i];
			}
			if (sum != 15) {
				return false;
			}
		}

		// Checking for forward diagonal
		if ((square[0][0] + square[1][1] + square[2][2]) != 1){
			return false;
		}
		// Checking for backward diagonal
		if ((square[2][0] + square[1][1] + square[0][2]) != 15) {
			return false;
		}

		// If all those statement passed return true
		return true;
	}
}



