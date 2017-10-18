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
 *
 * @author RupGautam
 */


public class ParkingTicket {

  // This are fields
  private static int count = 0;
  public final double BASE_FINE = 25.0;
  public final double HOURLY_FINE = 10.0;
  private ParkedCar car;
  private PoliceOfficer officer;
  private ParkingMeter meter;
  private double totalFine = 0.0;
  private double overTimeHours = 0.0;


  /**
   * @param car new car Object
   * @param officer new officer Object
   */
  public ParkingTicket(ParkedCar car, PoliceOfficer officer) {
    this.car = car;
    this.officer = officer;

    calculateFine();
  }

  /**
   * @param car New car Object
   * @param officer New officer Object
   */
  public ParkingTicket(ParkedCar car, PoliceOfficer officer, ParkingMeter meter) {
    this.car = car;
    this.officer = officer;
    this.meter = meter;

    calculateFine();
  }

  /**
   *
   * @return Returns the totalFine to be paid
   */
  private double calculateFine() {

    overTimeHours = Math.ceil((car.getMinutesParked() - meter.getMinutesPurchased()) / 60) - 1;

    totalFine = overTimeHours * HOURLY_FINE + BASE_FINE;
    return totalFine;
  }


  @Override
  public String toString() {
    return "\n***** ParkingTicket *****"
        + "\nCar info: " + car.getMake() + " " + car.getModel()
        + "\nCar License: " + car.getLicenseNumber()
        + "\nTotal Hour Parked: " + Math.ceil(car.getMinutesParked() / 60)
        + "\n--------------------------"
        + "\nTotal Fine: " + calculateFine()
        + "\n--------------------------"
        + "\nTicket Issued By: " + officer.getOfficerName();

  }

}

