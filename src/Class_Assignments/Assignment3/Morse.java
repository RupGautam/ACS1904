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
  private char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
      'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
      'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
      ',', '.', '?'};
  private String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
      ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
      "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
      "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
      "-----", "--..--", ".-.-.-", "..--.."};


  public Morse(String input) {
    original = input;
    //check if words are more than 40 words.
    this.mcode = "";
    char[] chars = input.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      this.mcode += toMorse(chars[i]);
    }
  }

  public String toMorse(char chars) {
    for (int i = 0; i < chars; i++) {
      if (Character.isDigit(chars)){
        return this.morse[i];
      }
      else if(Character.isLetter(chars)){
        return this.morse[i];
      }
      else {
        return null;
      }
    }
    return mcode;
  }

  public String getMorsecode() {
    return this.mcode;
  }

  public String getOriginal() {
    return this.original;
  }
}

