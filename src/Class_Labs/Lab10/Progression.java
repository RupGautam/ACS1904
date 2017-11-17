/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Labs.Lab10;

import java.util.Scanner;

/**
 * Created by RupGautam on 17/11/2017.
 */


public class Progression {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("This program will calculate " +
        "the geometric and harmonic " +
        "progression for the number " +
        "you enter.");
    System.out.print("Enter an integer that is " +
        "greater than or equal to 1: ");
    int input = keyboard.nextInt();
    // Match the method calls with the methods you write
    int geomAnswer = geometricRecursive(input);
    double harmAnswer = harmonicRecursive(input);
    System.out.println("Using recursion:");
    System.out.println("The geometric progression of " + input + " is " + geomAnswer);
    System.out.println("The harmonic progression of " + input + " is " + harmAnswer);
// Match the method calls with the methods you write
    geomAnswer = geometricIterative(input);

    harmAnswer = harmonicIterative(input);
    System.out.println("Using iteration:");
    System.out.println("The geometric progression of " + input + " is " + geomAnswer);
    System.out.println("The harmonic progression of " + input + " is " + harmAnswer);
  }

  public static int geometricRecursive(int number) {
    if (number == 1) {
      return 1;
    } else {
      return number * geometricRecursive(number - 1);
    }
  }

  public static int geometricIterative(int number) {
    int ans = 1;
    while (number > 1) {
      ans *= number;
      number--;
    }
    return ans;
  }


  /**
   * Harmonic recursion double.
   *
   * @param number the number
   * @return the double
   */
  public static double harmonicRecursive(int number) {
    if (number == 1) {
      return 1;
    } else {
      return (double) 1 / number * harmonicRecursive(number -1);
    }
  }

  /**
   * Harmonic iterative double.
   *
   * @param number the number
   * @return the double
   */
// Write the harmonicIterative method
  public static double harmonicIterative(int number) {
    double ans = 1;
    while (number > 1) {
      ans /= number;
      number--;
    }
    return ans;
  }

}
