/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Assignments.Assignment3;

/**
 * Created by RupGautam on 26/10/2017.
 */


public class Morse {

  int NUM_CHARS = 40;
  private String original = "ABCDEFGHIJKLMNOPQRSTVUWXYZ";
  private String mcode;
  private char[] regular = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
      'F', 'G', 'H', 'I', 'J', 'K', 'L',
      'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
      'U', 'V', 'W', 'X', 'Y', 'Z'};
  private String[] morse = {".-", "-...", "-.-.", "-..", ".",
      "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
      "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
      ".--", "-..-", "-.--", "--.."};


  public Morse(String input) {
    this.original = input;
    char[] ch = input.toCharArray();
    for (int i = 0; i < ch.length; i++) {
      this.mcode += toMorse(ch[i]);
    }
  }

  public String toMorse(char ch) {
    if (Character.isDigit(ch)) {
      int i = Character.getNumericValue(ch);
      return morse[i];
    } else if (Character.isLetter(ch)) {
      char chars = Character.toUpperCase(ch);
      int i = Character.getNumericValue(chars);
      return morse[i];
    } else {
      return null;
    }
  }

  public String getMorsecode() {
    return mcode;
  }

  public String getOriginal() {
    return original;
  }
}
