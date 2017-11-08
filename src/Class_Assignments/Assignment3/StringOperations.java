/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Assignments.Assignment3;

import java.util.Arrays;

/**
 * Created by RupGautam on 15/10/2017.
 */


public class StringOperations {
  public static int wordCount(String input) {
    int countChars;
    String[] words = input.split(" ");
    countChars = words.length;
    return countChars;
  }

  public static String arrayToString(char[] ch) {
    return String.valueOf(ch);
  }

  public static char mostFrequent(String str) {
    String string = str.replaceAll(" ", "");
    char[] array = string.toCharArray();
    System.out.println(Arrays.toString(array));
    int max = 0;
    char maxChar = ' ';

    for (int i = 0; i < array.length - 1; i++) {
      int count = 0;
      char ch = array[i];
      for (int j = 1; j < array.length; j++) {
        if (ch == array[j]) {
          count++;
        }

      }
      if (i == 0 || count > max) {
        count++;
        max = count;
        maxChar = array[i];
      }
    }
    return maxChar;
  }


  public static String replaceSubString(String stringOriginal, String stringFind, String
      stringReplace) {
    String string = "";

    // Convert string into string array tokens
    String[] tokens = stringOriginal.split("\\s+");
    for (int i = 0; i < tokens.length; i++) {
      if (tokens[i].equalsIgnoreCase(stringFind)) {
        tokens[i] = stringReplace;
        string += tokens[i] + " ";
      }
      else {
        string += tokens[i] + " ";
      }
    }
    return string;
  }

}