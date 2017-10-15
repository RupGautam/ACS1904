/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Assignments.Assignment2;

import org.junit.jupiter.api.Test;

class LoShuMagicSquareTest {
  @Test
  void testSomething() {
    int square[][] = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};

    if (LoShuMagicSquare.isTrue(square)) {
      System.out.println("You have Magic Square!");
      System.out.print(" -- -- -- --\n");
      System.out.println("| " + square[0][0] + " | " + square[0][1] + " | " + square[0][2] + " |");
      System.out.print(" -- -- -- --\n");
      System.out.println("| " + square[1][0] + " | " + square[1][1] + " | " + square[1][2] + " |");
      System.out.print(" -- -- -- --\n");
      System.out.println("| " + square[2][0] + " | " + square[2][1] + " | " + square[2][2] + " |");
      System.out.print(" -- -- -- --");
    } else {
      System.out.println("It's not a Magic Square!");
    }
  }
}



