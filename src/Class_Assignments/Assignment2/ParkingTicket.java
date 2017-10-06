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


public class ParkingTicket {

	// Report fields
	private static int count = 0;
	public final double BASE_FINE = 25.0;
	public final double HOURLY_FINE = 10.0;
	private ParkedCar car;
	private PoliceOfficer officer;
	private PoliceOfficer illegalMin;
	private double fine;
	private float minutes;
	private double totalFine;

	public ParkingTicket(ParkedCar car, PoliceOfficer officer, float minutes) {
		super ( );
		this.car = car;
		this.officer = officer;
		this.minutes = minutes;

		calculateFine ( );
	}

	public ParkingTicket(ParkedCar car, PoliceOfficer illegalMin) {
		this.car = car;
		this.illegalMin = illegalMin;
	}

	private void calculateFine() {
		double hours = minutes / 60.0;
		int hourInt = (int) hours;

		if ((hours - hourInt) > 0) {
			hourInt++;
		}
		fine = BASE_FINE;

		fine += (hourInt * HOURLY_FINE);

	}

//	public String printMessage(){
//		System.out.println ("***** ParkingTicket *****");
//		System.out.print("\nOfficer on duty: " + officer);
//		System.out.print("\nCar info: " + car);
//		System.out.print("\nOfficer on duty: " + fine);
//		System.out.print("\nMinutes Parked: " + minutes);
//		System.out.print("\nBase Fine: " + HOURLY_FINE);
//		System.out.print("\nHourly Fine: " + HOURLY_FINE);
//		System.out.print("\nTotal Fine: " + HOURLY_FINE+HOURLY_FINE);
//
//	}

	@Override
	public String toString() {
		// I had to use StringBuilder to build the string
		StringBuilder printMessage = new StringBuilder ( );
		System.out.println ( "\n***** ParkingTicket *****" );
		System.out.print ( "\nParking Ticket Number:" + "WPGTICKET" + count++ );
		System.out.print ( "\n\nOfficer on duty: " + officer.getOfficerName ( ) );
		System.out.println ( "\n\nCar info: " + car.getMake ( ) + " " + car.getModel ( ) );
		System.out.print ( "\n\nCar License: " + car.getLicenseNumber ( ) );
		System.out.print ( "\n\nMinutes Parked: " + minutes );
		System.out.print ( "\n\nBase Fine: " + BASE_FINE );
		System.out.print ( "\n\nHourly Fine: " + HOURLY_FINE );
		System.out.println ( "\n--------------------------" );
		System.out.print ( "Total Fine: " + (HOURLY_FINE + BASE_FINE) );
		System.out.println ( "\n--------------------------" );

		return printMessage.toString ( );
	}

}

