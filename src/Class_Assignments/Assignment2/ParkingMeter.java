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


public class ParkingMeter {

	private float minutesPurchased;

	public ParkingMeter(int minutesPurchased) {
		super ( );
		this.minutesPurchased = minutesPurchased;
	}

	public float getMinutesPurchased() {
		return minutesPurchased;
	}

	public void setMinutesPurchased(float minutesPurchased) {
		this.minutesPurchased = minutesPurchased;
	}

}
