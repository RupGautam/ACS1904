/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Algorithms;

class InsertionSort {

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.print ( arr[i] + " " );
		}
		System.out.println ( );
	}

	// Driver method
	public static void main(String args[]) {
		int arr[] = {8, 2, 111, 3, 15, 61, 17};

		InsertionSort ob = new InsertionSort ( );
		ob.sort ( arr );

		printArray ( arr );
	}

	void sort(int arr[]) {
		for (int i = 1; i < arr.length; ++i) {
			int key = arr[i];  // current element is the key
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {  // Move elements of arr[0..i-1] greater than key,
				arr[j + 1] = arr[j];      // to one position ahead of their current position
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
}
