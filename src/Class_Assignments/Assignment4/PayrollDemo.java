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
  public static void main(String[] args) {

    // Test for calling out the invalid name exception
    Payroll test1 = new Payroll("", 101);
    System.out.println(test1.getName());


    //Test for calling out the invalid ID exception
    Payroll test2 = new Payroll("Jane Doe", 1);
    System.out.println(test2.getIdNumber());

//    Payroll test3 = new Payroll();

    //Set hour worked.
    test1.setHoursWorked(40.4);
    test1.setPayRate(12.3);



  }
}
