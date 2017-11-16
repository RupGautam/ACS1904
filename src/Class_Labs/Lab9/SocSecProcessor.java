/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Labs.Lab9;

import java.util.Scanner;


public class SocSecProcessor {
  private static int SSN_LENGTH= 11;

  public static void main(String[] args) {
    String input;
    String name;
    String socSecNumber;
    String response;
    char answer = 'y';
    Scanner kb = new Scanner(System.in);

    while (Character.toUpperCase(answer) == 'Y') {
      try {
        System.out.print("Name: ");
        name = kb.nextLine();
        System.out.print("SSN: ");
        socSecNumber = kb.nextLine();
        if (isValid(socSecNumber)) {
          System.out.println(name + " " + socSecNumber + " is Valid");
        }
      } catch (SocSecException e) {
        System.out.println(e.getMessage());
      } finally {
        System.out.print("Continue (Y/N)");
        response = kb.nextLine();
        answer = response.charAt(0);
      }
    }

  }

  private static boolean isValid(String ssn) throws SocSecException {
    boolean goodSoFar = true;
    int index = 0;
    if (ssn.length() != SSN_LENGTH) { // ssn will have 11 characters including dashes.
      throw new SocSecException(" Wrong number of characters");
    }
    while (goodSoFar && index < SSN_LENGTH) {
      if (index == 3 || index == 6) {
        if (ssn.charAt(index) != '-') {
          throw new SocSecException(" Dashes at wrong position");
        }
      } else if (!Character.isDigit(ssn.charAt(index))) {
        throw new SocSecException(" Contains non numeric characters");
      }
      index++;
    }
    return goodSoFar;
  }
}
