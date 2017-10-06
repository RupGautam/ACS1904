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
 This class defines a person by name and address.
 */
public class Person {
	// The person's last name
	private String lastName;
	// The person's first name
	private String firstName;
	// The person's address
	private Address home;
	/**
	 Constructor
	 @param last The person's last name.
	 @param first The person's first name.
	 @param residence The person's address.
	 */
	public Person(String last, String first,
			Address residence) {
		lastName = last;
		firstName = first;
		home = residence;
	}
	/**
	 The toString method
	 @return Information about the person.
	 */
	public String toString() {
		return(firstName + " " + lastName +
				", " + home.toString());
	}
}
