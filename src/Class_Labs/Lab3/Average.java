package Class_Labs.Lab3;/**
 * Created by Rup Gautam on 22/09/2017.
 */

import java.util.Scanner;

/**
 * Copyright ${COPYRIGHT}.
 */
public class Average {

	private int[] data;
	private double mean;

	public Average() {
		data = new int[5];
		Scanner kb = new Scanner ( System.in );

		for (int i = 0; i < data.length; i++) {
			System.out.print ( "Enter score for Number " + (i + 1) + " :" );
			data[i] = kb.nextInt ( );

		}
		// Calling selection sort to sort out the data
		selectionSort ( );

		// calling mean calc to get the mean value
		calculateMean ( );
	}

	/**
	 * calculates the mean value from data array
	 */
	private void calculateMean() {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		// finding the mean value
		mean = sum / data.length;
	}

	/**
	 * selection sort
	 */
	private void selectionSort() {
		int maxIndex;
		int maxValue; // temp placeholder

		for (int i = 0; i < data.length - 1; i++) {
			maxIndex = i;
			maxValue = data[i];

			for (int j = i + 1; j < data.length; j++) {
				if (data[j] > maxValue) {
					maxValue = data[j];
					maxIndex = j;
				}
			}
			data[maxIndex] = data[i];
			data[i] = maxValue;

//    int i,j,first,temp;
//    for(i = data.length -1; i >0; i--) {
//      first = 0; // init to subscript of first element
//      for (j = 1; j <= i; j++) { //locate smallest element
//        if (data[j] < data[first])
//          first = j;
//      }
//      temp = data[first]; // swap the smallest to the position i
//      data[first] = data[i];
//      data[i] = temp;
		}
	}

	/**
	 * returns the whole values as string
	 */
	public String toString() {
		String output = "Descending order of test scores: \n";
		for (int i = 0; i < data.length; i++) {
			output += data[i] + "\t";
		}
		output += "\nThe average is:" + mean;
		return output;

	}
}
