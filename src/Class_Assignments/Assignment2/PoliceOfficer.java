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

	// Officer's Info
	private String officerName;
	private String officerBadge;

	/**
	 * @param officerName
	 * @param officerBadge
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
		this.getOfficerName ( );
		ParkingTicket ticket = null;

		float illegalMin = car.getMinutesParked ( ) - meter.getMinutesPurchased ( );
		if (car.getMinutesParked ( ) > meter.getMinutesPurchased ( )) {
			return new ParkingTicket ( car, this, illegalMin );
		}
		return null;
	}

	/**
	 * Returns the officer Name
	 * @return
	 */
	public String getOfficerName() {
		return officerName;
	}

	/**
	 * Sets officer name
	 * @param officerName
	 */
	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	/**
	 * Returns officers badge
	 * @return
	 */
	public String getOfficerBadge() {
		return officerBadge;
	}

	/**
	 * Set officer badge
	 * @param officerBadge
	 */
	public void setOfficerBadge(String officerBadge) {
		this.officerBadge = officerBadge;
	}

}
