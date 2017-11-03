package Class_Assignments.Assignment1;
/**
 * Created by RupGautam on 12/09/2017.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Driver {

	Scanner kb = new Scanner ( System.in );
	private char[] answerKeys = {'C', 'A', 'B', 'B', 'D', 'B', 'C', 'B', 'D', 'D', 'C', 'D', 'A', 'B',
			'A', 'D', 'D', 'C', 'A', 'B',};
	private char[] questions = new char[20];
	private int totalCorrect = 0;
	private int totalIncorrect = 0;
	private int questionMissed = 0;


	/**
	 * Returns users answers void
	 */
	public void questions(char[] answer) {
		questions = answer;
	}

	/**
	 * If users answers > 15, return true, if not false
	 */
	public boolean isPassed() {
    return totalCorrect > 14;
	}

	/**
	 * Return the correct Total answers as array
	 */
	public int correct() {
		for (int i = 0; i < questions.length; i++) {
			if (answerKeys[i] == questions[i]) {
				totalCorrect++;
			}
		}
		return totalCorrect;
	}

	/**
	 * Return the total incorrect
	 */
	public int incorrect() {
		for (int i = 0; i < questions.length; i++) {
			if (answerKeys[i] != questions[i] && questions[i] != '!') {
				totalIncorrect++;
			}
		}
		return totalIncorrect;
	}

	/**
	 * Return total missed as array
	 */
	public int[] missed() {
		for (int i = 0; i < questions.length; i++) {
			if (questions[i] == '!') {
				questionMissed++;
			}
		}
		int[] totalMissed = new int[questionMissed];
		for (int i = 0, j = 0; i < questions.length; i++) {
			if (questions[i] == '!') {
				totalMissed[j++] = i + 1;
			}
		}
		System.out.println ( "Missed questions: " + Arrays.toString ( totalMissed ) );

		return totalMissed;
	}

}

