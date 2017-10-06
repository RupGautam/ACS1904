/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Algorithms;

// Java implementation of Counting Sort
// Part of Cosmos by OpenGenus Foundation
class CountingSort {

	// Driver method
	public static void main(String args[]) {
		CountingSort ob = new CountingSort ( );
		char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o',
				'r', 'g', 'e', 'e', 'k', 's'
		};

		ob.sort ( arr );

		System.out.print ( "Sorted character array is " );
		for (char anArr : arr) {
			System.out.print ( anArr );
		}
	}

	private void sort(char arr[]) {
		int n = arr.length;

		// The output character array that will have sorted arr
		char output[] = new char[n];

		// Create a count array to store count of inidividul
		// characters and initialize count array as 0
		int count[] = new int[256];
		for (int i = 0; i < 256; ++i) {
			count[i] = 0;
		}

		// store count of each character
		for (char anArr1 : arr) {
			++count[anArr1];
		}

		// Change count[i] so that count[i] now contains actual
		// position of this character in output array
		for (int i = 1; i <= 255; ++i) {
			count[i] += count[i - 1];
		}

		// Build the output character array
		for (char anArr : arr) {
			output[count[anArr] - 1] = anArr;
			--count[anArr];
		}

		// Copy the output array to arr, so that arr now
		// contains sorted characters
		System.arraycopy ( output, 0, arr, 0, n );
	}
}
