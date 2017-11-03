/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package PracticeQuestions;

import java.util.Scanner;

/**
 * Created by RupGautam on 29/10/2017.
 */


public class BubbleSort {
  public static void main(String[] args) {
    int n, c, d, swap;
    Scanner kb = new Scanner(System.in);

    System.out.println("Please enter unsorted numbers");
    n = kb.nextInt();

    int array[] = new int[n];
    System.out.println("enter " +n+ " integers");

    for (int i =0; i < n; i++){
      array[i] = kb.nextInt();

      for (int j =0; j < array.length -1; j++){
        for (int k =0; k < array.length - i - 1; k++){
          if (array[k] > array[k+1]){
            // swap it now
            swap = array[k];
            array[k] = array[k+1];
            array[k+1] = swap;
          }
        }
      }
    }
    System.out.println("Sorted numbers.");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
