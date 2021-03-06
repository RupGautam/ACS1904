/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Labs.Lab5;/**
 * Created by RupGautam on 06/10/2017.
 */


public class CreditCard {

	private Money balance;
	private Money creditLimit;
	private Person owner;


	/**
	 * Credit card constructor
	 * @param newCardHolder
	 * @param limit
	 */
	public CreditCard(Person newCardHolder, Money limit){
		this.owner = newCardHolder;
		this.balance = new Money ( 0 );
		this.creditLimit = new Money (limit);


	}

	/**
	 * @return Returns balance from Money object
	 */
	public Money getBalance() {
		return new Money (balance);
	}

	/**
	 * @return Returns credit limit from Money object
	 */
	public Money getCreditLimit() {
		return new Money (creditLimit);
	}

	/**
	 * @return Returns owner of the a/c
	 */
	public String getPersonals() {
		return owner.toString ();
	}

	/**
	 * Charge amount, print exceeds if credit limit > 0 else set new balance.
	 * @param amount
	 */
	public void charge(Money amount){
		Money m = new Money ( balance.add ( amount ) );

		if(m.compareTo ( creditLimit ) > 0){
			System.out.println ( "Exceeds credit limit");
		}else {
			balance = m;
			System.out.println ("Charged: " + amount );
		}

	}

	/**
	 *
	 * @param amount
	 */
	public void payment(Money amount){
		balance = balance.subtract ( amount );
		System.out.println ("Payment: " + amount );

	}
}
