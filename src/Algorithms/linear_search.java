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
class Search {

	/*
	 * Input: an integer array with size in index 0, the element to be searched
	 * Output: if found, returns the index of the element else -1
	*/
	static int linearSearch(int arr[], int x) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = {2, 3, 1, 4};
		int find = 1;
		System.out.println ( "Position of " + find + " is " + linearSearch ( arr, find ) );
	}
}