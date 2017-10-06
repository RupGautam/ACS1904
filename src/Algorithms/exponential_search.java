/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Algorithms;// Java program to find an element x in a sorted array using Exponential search.

import java.util.Arrays;

// Part of Cosmos by OpenGenus Foundation
class ExponentialSearch {

	// Returns position of first ocurrence of x in array
	static int exponentialSearch(int arr[], int n, int x) {

		// If x is present at firt location itself
		if (arr[0] == x) {
			return 0;
		}

		// Find range for binary search by
		// repeated doubling
		int i = 1;

		while (i < n && arr[i] <= x) {
			i = i * 2;
		}

		//  Call binary search for the found range.
		return Arrays.binarySearch ( arr, i / 2, Math.min ( i, n ), x );
	}

	// Driver method
	public static void main(String args[]) {
		int arr[] = {4, 91, 66, 89, 54, 2, 3};
		int x = 66;
		int result = exponentialSearch ( arr, arr.length, x );

		if (result < 0) {
			System.out.println ( "Element is not present in array" );
		} else {
			System.out.println ( "Element is present at index " + result );
		}
	}
}