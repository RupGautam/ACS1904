package Class_Assignments.Assignment1;/**
 * Created by RupGautam on 12/09/2017.
 *
 * Copyright ${COPYRIGHT}.
 */

/**
 * Copyright ${COPYRIGHT}.
 */

import java.util.*;

public class DriverTest {

	public static void main(String[] args) {
		// loop for asking question
		char[] questions = new char[20];

		Driver test = new Driver ( );

		Scanner kb = new Scanner ( System.in );

		for (int i = 0; i < questions.length; i++) {

			System.out.println ( "What is the answer for " + (i + 1) + " ?" );
			System.out.println ( "A. \t B.\t C.\t D. \t! (skip)" );
			questions[i] = kb.nextLine ( ).toUpperCase ( ).charAt ( 0 );

			while (questions[i] != 'A' && questions[i] != 'B' && questions[i] != 'C'
					&& questions[i] != 'D' && questions[i] != '!') {
				System.out.println ( "Invalid input!" );
				questions[i] = kb.nextLine ( ).toUpperCase ( ).charAt ( 0 );
			}
			//creating test obj
			test.questions ( questions );


		}
		System.out.println ( "Total Correct: " + test.correct ( ) );
		System.out.println ( "Total InCorrect: " + test.incorrect ( ) );
		test.missed ( );
		//	System.out.println("Missed questions: "+ test.missed());
		System.out.println ( "Passed " + test.isPassed ( ) );
	}
}

