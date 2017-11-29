/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Assignments.Assignment4;

/**
 * Created by RupGautam on 2017-11-28.
 */


public class PayRoll1 {
  private String name;
  private int idNumber;
  private double payRate;
  private double hoursWorked;

  /**
   * Instantiates a new Pay roll 1.
   *
   * @param name     the name
   * @param idNumber the id number
   * @throws InvalidIDException   the invalid id exception
   * @throws InvalidNameException the invalid name exception
   */
  public PayRoll1(String name, int idNumber)
      throws InvalidIDException, InvalidNameException {
    try {
      if (name.equals(""))
        throw new InvalidNameException(name);
      if (idNumber <= 0)
        throw new InvalidIDException(idNumber);
      name = name;
      idNumber = idNumber;
    } catch (InvalidIDException | InvalidNameException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    try {
      if (name.equals("")) {
        throw new InvalidNameException(name);
      }
      name = name;
    } catch (InvalidNameException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Gets id number.
   *
   * @return the id number
   */
  public int getIdNumber() {
    return idNumber;
  }

  /**
   * Sets id number.
   *
   * @param idNumber the id number
   */
  public void setIdNumber(int idNumber) {
    try {
      if (idNumber <= 0) {
        throw new InvalidIDException(idNumber);
      }
      idNumber = idNumber;

    } catch (InvalidIDException e) {
      System.out.println(e.getMessage());
    }

  }

  /**
   * Gets pay rate.
   *
   * @return the pay rate
   */
  public double getPayRate() {
    return payRate;
  }

  /**
   * Sets pay rate.
   *
   * @param payRate the pay rate
   * @throws InvalidHourlyRateException the invalid hourly rate exception
   */
  public void setPayRate(double payRate) throws InvalidHourlyRateException {

        if (payRate > 25 || payRate < 0) {
          throw new InvalidHourlyRateException(payRate);
        }
        payRate = payRate;


  }

  /**
   * Gets hours worked.
   *
   * @return the hours worked
   */
  public double getHoursWorked() {
    return hoursWorked;
  }

  /**
   * Sets hours worked.
   *
   * @param hoursWorked the hours worked
   * @throws InvalidHoursException the invalid hours exception
   */
  public void setHoursWorked(double hoursWorked) throws InvalidHoursException {
    try {
      if (hoursWorked > 84 || hoursWorked < 0) {

        throw new InvalidHoursException(hoursWorked);
      }
      hoursWorked = hoursWorked;
    } catch (InvalidHoursException e) {
      System.out.println(e.getMessage());

    }

  }
}
