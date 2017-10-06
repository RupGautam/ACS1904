/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Algorithms;

/*
 * Part of Cosmos by OpenGenus Foundation
*/
class binary_search {

	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x) {
				return mid;
			}

			if (arr[mid] > x) {
				return binarySearch ( arr, l, mid - 1, x );
			}

			return binarySearch ( arr, mid + 1, r, x );
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = {1, 2, 3, 5};
		int size = arr.length;
		int find = 3;
		System.out.println ( "Position of " + find + " is " + binarySearch ( arr, 0, size - 1, find ) );
	}
}