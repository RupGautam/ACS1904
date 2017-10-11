/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package PracticeQuestions;

import java.util.Random;

/**
 * Created by RupGautam on 08/10/2017.
 */


public class PhoneNumberGenerator {

	public static void main(String[] args) {
		Random rand = new Random ();
//
//		System.out.print ("("+areaCode +")");
//		for (int i = 0; i < 3; i++)
//			System.out.print ( i+rand.nextInt (10) );
//		System.out.print ("-" );
//		for (int j = 0; j < 4; j++)
//			System.out.print ( j+rand.nextInt (10) );

		for(int i = 0; i < 3 ; i++) {
			for(int j = 0; i <3 ; i++){
				for (int k =0; k < 4; k++) {
					System.out.print (i+rand.nextInt (9));
					System.out.print (j+rand.nextInt (9) );
					System.out.print (k+rand.nextInt (9) );
				}
			}
		}
	}
}
