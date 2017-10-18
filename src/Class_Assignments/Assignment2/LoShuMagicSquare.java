/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Assignments.Assignment2;

import java.util.Scanner;

public class LoShuMagicSquare {
  public static void main(String[] args) {
    //Create square 2d array to hold the users inputs
    int[][] square = new int[3][3];
    char userSelection;
    Scanner kb = new Scanner(System.in);
    //Starting reading user input
    System.out.println("------------------------");
    System.out.println("----- Magic Square -----");
    System.out.println("------------------------\n");

    do {
      for (int i = 0; i < 3; i++) {
        System.out.println("Row Number " + (i + 1));
        for (int j = 0; j < 3; j++) {
          System.out.print("Enter number " + +(j + 1) + " :");
          // Now store the inputted value into square
          square[i][j] = kb.nextInt();
          if (square[i][j] < 0 || square[i][j] > 9) {
            System.out.println("Invalid number, Please enter 0-9.");
            System.exit(0);
          }
        }
      }
      {
        if (isTrue(square)) {
          System.out.println("You have Magic Square!");
          System.out.print("  -- -- -- --\n");
          System.out.println(" | " + square[0][0] + " | " + square[0][1] + " | " + square[0][2] + " | ");
          System.out.print("  -- -- -- --\n");
          System.out.println(" | " + square[1][0] + " | " + square[1][1] + " | " + square[1][2] + " |");
          System.out.print("  -- -- -- --\n");
          System.out.println(" | " + square[2][0] + " | " + square[2][1] + " | " + square[2][2] + " | ");
          System.out.print("  -- -- -- --\n");
        } else {
          System.out.println("It's not a Magic Square!");
        }
        System.out.println("Do you want to try again");
        System.out.print("Y - Yes | N - No");
        kb.nextLine();
      }
      userSelection = kb.next().charAt(0);
    } while (userSelection == 'y' || userSelection == 'Y');
  }

  /**
   *
   * @param square Square[][] holding the arrays
   * @return Returns true, if and only all the statements returns true.
   */
  public static boolean isTrue(int[][] square) {
    int[] temp = new int[9];
    int sumRows = 0;
    int sumColumns = 0;
    int sumForwardDiagonal = 0;
    int sumBackwardDiagonal = 0;
    boolean result = true;
    int count = 0;

    int s = 0;
    // Checking for dupes
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        temp[s] = square[i][j];
        s++;
        for (int p = 0; p < s; p++) {
          if (temp[p] != square[i][j]) {
            result = true;
            break;
          } else {
            result = false;
          }
        }
      }
    }

    // Checking total sum of the Rows
    for (int i = 0; i < 3; i++) {
      sumRows = 0;
      for (int j = 0; j < 3; j++) {
        sumRows += square[i][j];
      }
      if (sumRows != 15) {
        result = false;
      }
    }
    // Checking total sum of the columns
    for (int i = 0; i < 3; i++) {
      sumColumns = 0;
      for (int j = 0; j < 3; j++) {
        sumColumns += square[j][i];
      }
      if (sumColumns != 15) {
        result = false;
      }
    }
    // Checking for forward diagonal
    if ((square[0][0] + square[1][1] + square[2][2]) != 15) {
      result = false;
    }
    // Checking for backward diagonal
    if ((square[2][0] + square[1][1] + square[0][2]) != 15) {
      result = false;
    }
    return result;
  }

}


