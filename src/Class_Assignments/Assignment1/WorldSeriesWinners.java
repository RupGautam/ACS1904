package Class_Assignments.Assignment1;/**
 * Created by RupGautam on 20/09/2017.
 *
 * Copyright ${COPYRIGHT}.
 */

/**
 * Copyright ${COPYRIGHT}.
 */

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WorldSeriesWinners {

	public static void main(String[] args) throws IOException {
		Scanner kb = new Scanner ( System.in );
		final int sizeOfArray = 104;
		String[] numbersOfLines = new String[sizeOfArray];

		System.out.print ( "Enter team name to view: " );
		String team = kb.nextLine ( );

		File records = new File ( "WorldSeriesWinners.txt" );
		Scanner inputFile = new Scanner ( records );

		/**
		 * Check if file exists, if yes, proceed.
		 */
		int counter = 0;
		int i = 0;
		boolean isFound = false;

		// Create new record file and check if it exists.
		isFound = records.exists ( );
		if (isFound == true) {
			while (inputFile.hasNextLine ( ) && i < 104) {
				numbersOfLines[i] = inputFile.nextLine ( );
				i++;
			}
		} else {
			System.out.println ( "Total numbersOfLines of arrays " +
					Arrays.toString ( numbersOfLines ) );
		}
		inputFile.close ( );
		/**
		 * start counting team wins
		 */
		for (int j = 0; j < numbersOfLines.length; j++) {
			if (numbersOfLines[j].equalsIgnoreCase ( team )) {
				counter++;
			}
		}

		System.out.println ( team + " has won the World Series "
				+ counter + " times" );
		kb.close ( );
	}
}

