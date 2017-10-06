/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Assignments.Assignment2;

import java.util.Scanner;

/**
 * Created by RupGautam on 30/09/2017.
 */


public class LoShuMagicSquare {

	public LoShuMagicSquare(String input1, String input2, String input3) {
		input1 = input1;
		input2 = input2;
		input3 = input3;

	}

	public static void main(String[] args) {
		/**
		 *
		 */
		int[][] array = new int[3][3];
		String s = new String ( );
		String input1, input2, input3;

		Scanner kb = new Scanner ( System.in );
		boolean magic = false;
		int sum1 = 0, sum2 = 0, sum3 = 0;

		// Getting first row of numbers
		System.out.println ( "Row 1, Number separated by space: " );
		s = kb.nextLine ( );
		// stripping the space between numbers
		for (int i = 0; i < 3; i++) {
			// Filling out the first row with three numbers
			//TODO:
			// Try using token to print each numbers
			array[i][0] = Integer.parseInt ( s.substring ( i * 2, (i * 2) + 1 ) );
			sum1 += array[i][0];
		}

		System.out.println ( "Row 2, Number separated by space" );
		s = kb.nextLine ( );
		// stripping the space between numbers
		for (int j = 0; j < 3; j++) {
			// Filling out the second row with three numbers
			array[j][1] = Integer.parseInt ( s.substring ( j * 2, (j * 2) + 1 ) );
			sum2 += array[j][1];

		}

		System.out.println ( "Row 3, Number separated by space" );
		s = kb.nextLine ( );
		// stripping the space between numbers
		for (int k = 0; k < 3; k++) {
			// Filling out the third row with three numbers
			array[k][2] = Integer.parseInt ( s.substring ( k * 2, (k * 2) + 1 ) );
			sum3 += array[k][2];
		}

		if (sum1 == 15 && sum2 == 15 && sum3 == 15) {
			System.out.println ( "True Magic Square, BITCH!" );
		}

//		for (int i = 0; i < 10; i++) {
//			array[2][2] = i;
//			for (int j = 0; j < 10; j++) {
//				array[1][2] = j;
//				for (int k = 0; k < 10; k++) {
//					array[0][2] = k;
//					if (array[0][0] + array[1][0] + array[2][0] == 15
//							&& array[0][1] + array[1][1] + array[2][1] == 15
//							&& array[0][2] + array[1][2] + array[2][2] == 15 &&
//							array[0][0] + array[0][1] + array[0][2] == 15
//							&& array[1][0] + array[1][1] + array[1][2] == 15
//							&& array[2][0] + array[2][1] + array[2][2] == 15 &&
//							array[0][0] + array[1][1] + array[2][2] == 15
//							&& array[0][2] + array[1][1] + array[2][0] == 15) {
//					}
//					magic = true;
//					System.out.println("Magic Square!");
//
//					if (magic == false) {
//						System.out.println("Yikes! No Magic Square!");
//					}
//				}
//			}
//		}
	}

}



