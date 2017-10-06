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

	public PoliceOfficer(String officerName, String officerBadge) {
		this.officerName = officerName;
		this.officerBadge = officerBadge;
	}


	public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
		this.getOfficerName ( );
		ParkingTicket ticket = null;

		float illegalMin = car.getMinutesParked ( ) - meter.getMinutesPurchased ( );
		if (car.getMinutesParked ( ) > meter.getMinutesPurchased ( )) {
			return new ParkingTicket ( car, this, illegalMin );
		}
		return null;
	}

	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public String getOfficerBadge() {
		return officerBadge;
	}

	public void setOfficerBadge(String officerBadge) {
		this.officerBadge = officerBadge;
	}

}
