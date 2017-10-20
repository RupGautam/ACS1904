/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
package Class_Labs.Lab6;
import java.util.Scanner;

/**
 * Created by RupGautam on 20/10/2017.
 */


/**
 * This program demonstrates the Time class.
 */
public class TimeDemo {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    char answer = 'Y';
    String enteredTime;
    String response;
    while (Character.toUpperCase(answer) == 'Y') {
      System.out.print("Enter a military time " + "using the ##:## format: ");
      enteredTime = keyboard.nextLine();
      Time now = new Time(enteredTime);
      System.out.println("Do you want to enter" + " another (Y/N)? ");
      response = keyboard.nextLine();
      answer = response.charAt(0);
    }
  }
}