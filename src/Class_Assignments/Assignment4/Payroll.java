/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Assignments.Assignment4;

/**
 * Created by RupGautam on 2017-11-27.
 */


public class Payroll {
  private String name;
  private int idNumber;
  private double payRate;
  private double hoursWorked;


  public Payroll(String n, int i) {
    try {
      if (n.equals("")) {
        throw new InvalidNameException(n);
      }
      if (i <= 0) {
        throw new InvalidIDException(i);
      }
      name = n;
      idNumber = i;
    } catch (InvalidNameException | InvalidIDException err) {
      System.out.println(err.getMessage());
    }

  }

  public String getName() {

    return name;
  }

  public void setName(String n) {
    try {
      if (n.equals("")) {
        throw new InvalidNameException(n);
      }
      name = "Please provide your name";

    } catch (InvalidNameException err) {
      System.out.println(err.getMessage());
    }
  }

  public int getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(int i) {
    try {
      if (i <= 0) {
        System.out.println("TEST: Throw me!");
        throw new InvalidIDException(i);
      }
      idNumber = i;

    } catch (InvalidIDException err) {
      System.out.println(err.getMessage());
    }
  }

  public double getPayRate() {
    return payRate;
  }

  public void setPayRate(double p) {
    try {
      if (p > 25 || p < 0) {
        throw new InvalidHourlyRateException(p);
      }
      payRate = p;
    } catch (InvalidHourlyRateException err) {
      System.out.println(err.getMessage());
    }

  }

  public double getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(double h) {
    try {
      if (h > 84 || h < 0) {
        throw new InvalidHoursException(h);
      }
      hoursWorked = h;
    } catch (InvalidHoursException err) {
      System.out.println(err.getMessage());
    }
  }

  public double getGrossPay() {
    return hoursWorked * payRate;
  }
}
