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


public class ParkedCar {

	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private double minutesParked;


  /**
   * New ParkedCar object
   * @param make Make of the car
   * @param model Model of the car
   * @param color Color of the car
   * @param licenseNumber License number of the car
   * @param minutesParked Minutes Purchased
   */
	public ParkedCar(String make, String model, String color, String licenseNumber, double
	  minutesParked) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.minutesParked = minutesParked;
	}

  /**
   *
   * @return Return make of the car
   */
	public String getMake() {
		return make;
	}

  /**
   *
   * @param make Make of the car
   */
	public void setMake(String make) {
		this.make = make;
	}

  /**
   *
   * @return Return the model of the car
   */
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

  /**
   *
   * @return Returns the color of the car
   */
	public String getColor() {
		return color;
	}

  /**
   *
   * @param color Color of the car
   */
	public void setColor(String color) {
		this.color = color;
	}

  /**
   *
   * @return Return the licenseNumber
   */
	public String getLicenseNumber() {
		return licenseNumber;
	}

  /**
   *
   * @param licenseNumber Set the licenseNumber
   */
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

  /**
   *
   * @return Return minutesParked
   */
	public double getMinutesParked() {
		return minutesParked;
	}


  /**
   *
   * @param minutesParked minutesParked
   */
	public void setMinutesParked(float minutesParked) {
		this.minutesParked = minutesParked;
	}
}
