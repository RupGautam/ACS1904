/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Assignments.Assignment3;

import java.util.Scanner;

/**
 * Created by RupGautam on 15/10/2017.
 */


public class MorseCodeConverter {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String input;

    System.out.println("please enter string: ");
    input = kb.nextLine();
    Morse secret = new Morse(input);

    System.out.println(secret.getMorsecode());
  }
}
