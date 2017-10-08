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
 * This class represents non-negative amounts of money.
 */
public class Money {

	// The number of dollars
	private long dollars;
	// The number of cents
	private long cents;

	/**
	 * Constructor
	 *
	 * @param amount The amount in decimal format.
	 */
	public Money(double amount) {
		if (amount < 0) {
			System.out.println ( "Error: Negative amounts " +
					"of money are not allowed." );
			System.exit ( 0 );
		} else {
			long allCents = Math.round ( amount * 100 );
			dollars = allCents / 100;
			cents = allCents % 100;
		}
	}
	// ADD LINES FOR TASK #1 HERE
// Document and write a copy constructor

	/**
	 * Overloaded Constructor
	 *
	 * @param object2 The money object to copy.
	 */
	public Money(Money object2) {
		dollars = object2.dollars;
		cents = object2.cents;

	}

	/**
	 * The add method
	 *
	 * @param otherAmount The amount of money to add.
	 * @return The sum of the calling Money object and the parameter Money object.
	 */
	public Money add(Money otherAmount) {
		Money sum = new Money ( 0 );
		sum.cents = this.cents + otherAmount.cents;
		long carryDollars = sum.cents / 100;
		sum.cents = sum.cents % 100;
		sum.dollars = this.dollars + otherAmount.dollars +
				carryDollars;
		return sum;
	}


	/**
	 * The subtract method
	 *
	 * @param amount The amount of money to subtract.
	 * @return The difference between the calling Money object and the parameter Money object.
	 */
	public Money subtract(Money amount) {
		Money difference = new Money ( 0 );
		if (this.cents < amount.cents) {
			this.dollars = this.dollars - 1;
			this.cents = this.cents + 100;
		}
		difference.dollars = this.dollars - amount.dollars;
		difference.cents = this.cents - amount.cents;
		return difference;
	}

	/**
	 * The compareTo method
	 *
	 * @param amount The amount of money to compare against.
	 * @return - 1 if the dollars and the cents of the calling object are less than the dollars and
	 * the cents of the parameter object. 0 if the dollars and the cents of the calling object are
	 * equal to the dollars and cents of the parameter object. 1 if the dollars and the cents of the
	 * calling object are more than the dollars an d the cents of the parameter object.
	 */
	public int compareTo(Money amount) {
		int value;
		if (this.dollars < amount.dollars) {
			value = - 1;
		} else if (this.dollars > amount.dollars) {
			value = 1;
		} else if (this.cents < amount.cents) {
			value = - 1;
		} else if (this.cents > amount.cents) {
			value = 1;
		} else {
			value = 0;
		}
		return value;
	}

	// ADD LINES FOR TASK #2 HERE
// Document and write an equals method public
// Document and write a toString method

	/**
	 * Equals method
	 * @param amount
	 *        the amount to compare
	 * @return compare the if the objects are equal
	 */
	public boolean equals(Money amount) {
		boolean status;
		if (this.dollars == amount.dollars &&
				this.cents == amount.cents) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}

	/**
	 * (non-Javadoc)
	 * @see Object#toString()
	 */
	public String toString() {
		String str = "$" + dollars;
		if (cents < 10) {
			str += ".0" + cents;
		} else {
			str += "." + cents;
		}
		return str;
	}

}