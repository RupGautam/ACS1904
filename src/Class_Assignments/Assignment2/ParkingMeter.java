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

  private double minutesPurchased;

  /**
   * Parking meter reference to super class
   *
   * @param minutesPurchased Assign minutes purchased to new object
   */
  ParkingMeter(double minutesPurchased) {
    this.minutesPurchased = minutesPurchased;
  }

  /**
   * Returns total minutes purchased
   *
   * @return Returns total purchased minutes
   */
  public double getMinutesPurchased() {
    return this.minutesPurchased;
  }

}
