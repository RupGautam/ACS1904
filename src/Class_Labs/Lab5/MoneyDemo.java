/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Labs.Lab5;/**
 * Created by RupGautam on 05/10/2017.
 */


/**
 This program demonstrates the Money class.
 */
public class MoneyDemo {
	public static void main(String[] args) {
// Named constants
		final int BEGINNING = 500; // Beginning balance
		final Money FIRST_AMOUNT = new Money(10.02);
		final Money SECOND_AMOUNT = new Money(10.02);
		final Money THIRD_AMOUNT = new Money(10.88);
// Create an instance of the Money class with
// the beginning balance.
		Money balance = new Money(BEGINNING);
// Display the current balance.
		System.out.println("The current amount is " +
				balance.toString());
// Add the second amount to the balance
// and display the results.
		balance = balance.add(SECOND_AMOUNT);
		System.out.println
				("Adding " + SECOND_AMOUNT +
						" gives " + balance.toString());
// Subtract the third amount from the balance
// and display the results.
		balance = balance.subtract(THIRD_AMOUNT);
		System.out.println("Subtracting " + THIRD_AMOUNT +
				" gives " + balance.toString());
// Determine if the second amount equals
// the first amount and store the result.
		boolean equal = SECOND_AMOUNT.equals(FIRST_AMOUNT);
// Display the result.
		if(equal) {
// The first and second amounts are equal.
			System.out.println(SECOND_AMOUNT + " equals " +
					FIRST_AMOUNT);
		} else {
// The first and second amounts are not equal.
			System.out.println(SECOND_AMOUNT+" does not equal "+
					FIRST_AMOUNT);
		}

// Determine if the third amount equals
// the first amount and store the result.
		equal = THIRD_AMOUNT.equals(FIRST_AMOUNT);
// Display the result.
		if(equal) {
// The third and first amounts are equal.
			System.out.println(THIRD_AMOUNT + " equals " +
					FIRST_AMOUNT);
		} else
		{
// The third and first amounts are not equal.
			System.out.println(THIRD_AMOUNT +
					" does not equal " +
					FIRST_AMOUNT);
		}
	}
}
