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
  private String original;
  private String mcode;
  private char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
      'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
      'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
  private String[] morse = {"----",".----","..---","...--","....-",".....",
      "-....","--...","---..","----.",".-","-...","-.-.","-..",".","..-.","--.","....",
      "..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
      "...-",".--","-..-","-.--","--.."};


  public Morse(String input) {
    original = input;
    this.mcode = "";
    //check if words are more than 40 words.
    if(input.length() > NUM_CHARS){
      System.out.println("Chars more than 40. Aborting..!");
      System.exit(0);
    }
    //Change user input into charArray
    char chars[] = original.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      this.mcode += toMorse(chars[i]);

    }
  }

  /**
   * Convert user inputted to Morse code.
   * @param chars mcode get passed here from Morse
   * @return Returns morse at i is those condition applies else return null
   */
  public String toMorse(char chars) {

      if (Character.isDigit(chars)){
        int i = Character.getNumericValue(chars);
        return this.morse[i];
      }
      else if(Character.isLetter(chars)){
        int i = Character.toLowerCase(Character.getNumericValue(chars));
        return this.morse[i];
      }
      else if(Character.isWhitespace(chars)){
        int i = Character.getNumericValue(chars);
        return " ";
      }
      else {
        return null;
      }
  }

  /**
   * Get the morse code
   * @return Returns mcode
   */
  public String getMorsecode() {
    return this.mcode;
  }

  /**
   * Get the original input
   * @return Returns original input
   */
  public String getOriginal() {
    return this.original;
  }
}

