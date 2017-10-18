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


public class PoliceOfficer {

	/* Officer's Info */

	private String officerName;
	private String officerBadge;

	/**
	 * @param officerName Officers Name
	 * @param officerBadge Officers Badge
	 */
	public PoliceOfficer(String officerName, String officerBadge) {
		this.officerName = officerName;
		this.officerBadge = officerBadge;
	}

	/**
	 *
	 * @param car Creates car object of ParkedCar
	 * @param meter Creates meter object of ParkingMeter
	 * @return Returns null, if no ticket issued
	 */
	public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
		//this.getOfficerName ( );
		//ParkingTicket ticket = null;

		//double illegalMin = car.getMinutesParked ( ) - meter.getMinutesPurchased ( );
		if (car.getMinutesParked ( ) > meter.getMinutesPurchased ( )) {
			return new ParkingTicket (car, this, meter );
		}
		return null;
	}

	/**
	 *
	 * @return Returns the officer Name
	 */
	public String getOfficerName() {
		return officerName;
	}

	/**
	 *
	 * @param officerName Sets officer name
	 */
	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	/**
	 *
	 * @return Returns officers badge
	 */
	public String getOfficerBadge() {
		return officerBadge;
	}

	/**
	 *
	 * @param officerBadge Set officer badge
	 */
	public void setOfficerBadge(String officerBadge) {
		this.officerBadge = officerBadge;
	}

}
