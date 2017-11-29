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


public class PayrollDemo {
  public static void main(String[] args) throws Exception{

    //Set hour worked.
    PayRoll1 testObj[] = new PayRoll1[5];
    try {
      // no error test
      testObj[0] = new PayRoll1("John Doe", 100);
      //test obj for name error test
      testObj[1] = new PayRoll1("Jone Huge", 200);
      // test obj for id number error test
      testObj[2] = new PayRoll1("Luke Martin", 0);
      // test obj for pay rate
      testObj[3] = new PayRoll1("Jane Doe", 400);
      // test obj for hour worked
      testObj[4] = new PayRoll1("Jesse Penney", 500);

    } catch (InvalidNameException | InvalidIDException e) {
      System.out.println(e.getMessage());
    }

    try {
      testObj[1] = new PayRoll1("", 200);
    } catch (InvalidNameException e) {
      System.out.println(e.getMessage());
    }
    try {
      testObj[2] = new PayRoll1("John Doe", 0);
    } catch (InvalidIDException e) {
      System.out.println(e.getMessage());
    }
    try {
      testObj[3].setPayRate(26);
    } catch (InvalidHourlyRateException e) {
      System.out.println(e.getMessage());
    }

    try {
      testObj[4].setHoursWorked(90);
    } catch (InvalidHoursException e) {
      System.out.println(e.getMessage());
    }

  }
}
