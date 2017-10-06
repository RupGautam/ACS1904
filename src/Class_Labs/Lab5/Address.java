/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Labs.Lab5;
/**
 * Created by RupGautam on 05/10/2017.
 */

/**
 This class defines an address using a street,
 city, state, and zipcode.
 */
public class Address {
	// The street number and name
	private String street;
	// The city in which the address is located
	private String city;
	// The state in which the address is located
	private String state;
	// The zip code associated with the city and street
	private String zip;
	/**
	 Constructor
	 @param road Describes the street number and name.
	 @param town Describes the cit
	 y.
	 @param st Describes the state.
	 @param zipCode Describes the zip code.
	 */
	public Address(String road, String town, String st,
			String zipCode) {
		street = road;
		city = town;
		state = st;
		zip = zipCode;
	}
	/**
	 The
	 toString method
	 @return Information about the address.
	 */
	public String toString() {
		return (street + ", " + city +
				", " + state + " " + zip);
	}
}

