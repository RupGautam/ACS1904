/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Labs.Lab10;

/**
 * Created by RupGautam on 17/11/2017.
 */


public class Recursion {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    factorial(12);
    System.out.println();

  }

  /**
   * Factorial int.
   *
   * @param n the n
   * @return the int
   */
  public static int factorial(int n) {
    int temp;
    System.out.println("Method call -- " +
        "calculating " + "Factorial of: " + n);
    if (n == 0) {
      return 1;
    } else {
      temp = factorial(n - 1);
      System.out.println("Factorial of: " + (n - 1) + " is " + temp);
      return (temp * n);
    }
  }
}
