/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Assignments.Assignment2;

/**
 * Created by RupGautam on 02/10/2017.
 */

public class ParkingTicketSimulator {

	public static void main(String[] args) {

		// Create a ParkingMeter object. 60 minutes were purchased.
		ParkingMeter meter = new ParkingMeter ( 60 );

// Create a ParkedCar object.
// The car was parked for 125 minutes.
		ParkedCar car = new ParkedCar ( "Volkswagen", "1972", "Red", "147RHZM", 125 );
		// Create a PoliceOfficer object.
		PoliceOfficer officer = new PoliceOfficer ( "Joe Friday",
				"4788" );
		// Let the officer patrol.
		ParkingTicket ticket = officer.patrol ( car, meter );
		if (ticket != null) {
			System.out.println ( ticket );
		} else {
			System.out.println ( "No crimes committed!" );
		}
	}
}

