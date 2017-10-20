/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Labs.Lab6;

import java.io.File;
import java.util.Scanner;

/**
 * Created by RupGautam on 20/10/2017.
 */


public class SplitDemo {
  public static void main(String[] args) {
    File file = new File("secret.txt");
    Scanner inputFile = null;
    try {
      inputFile = new Scanner(file);
    } catch (Exception e) {
      System.out.println("ERROR!");
      System.exit(1);
    }
    String fileContents;
    int counter = 0;
    char letter;

    StringBuilder strb = new StringBuilder();
    fileContents = inputFile.nextLine();
    inputFile.close();

    String[] tokens = fileContents.split(" ");

    for (String s : tokens) {
      if (counter % 5 == 0) {
        letter = Character.toUpperCase(s.charAt(0));
        strb.append(letter);
      }
      counter++;
    }
    System.out.println(strb);
  }
}
