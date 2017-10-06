/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Algorithms;

public class BubbleSort {

	static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}


	public static void main(String[] args) {
		int array[] = {4, 2, 3, 1};
		bubbleSort ( array );
		System.out.println ( "Sorted array: " );
		for (int i = 0; i < array.length; i++) {

			if (i != array.length - 1) {
				System.out.print ( array[i] + ", " );
			} else {
				System.out.println ( array[i] );
			}
		}
	}
}
