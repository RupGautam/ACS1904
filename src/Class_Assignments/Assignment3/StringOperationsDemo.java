/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Assignments.Assignment3;

/**
 * Created by RupGautam on 15/10/2017.
 */


public class StringOperationsDemo {
  public static void main(String[] args) {
    System.out.println("The words in the sentence " +
        "(He is a good guy) are " + StringOperations.wordCount("He is a good guy"));
    char[] array = {'d', 'h', 'r', 'u', 'v', 'i', 'k'};
    System.out.println("The arrayToString medhoud returns: '" + StringOperations.arrayToString(array) + "'.");
    System.out.println("The most frequent character in string (Bank Account)" +
        " is: " + StringOperations.mostFrequent("Bank Account"));
    System.out.println("The most frequent character in (Java Programming)" +
        " is: " + StringOperations.mostFrequent("Java Programming"));
    System.out.println("The demo of replace substring: "
        + StringOperations.replaceSubString("the dog jumped over the fence",
        "the", "that"));
  }
}
