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


public class shipDemo {
  public static void main(String[] args) {

    CargoShip obj1 = new CargoShip("Tom", "600", 500);

    CruiseShip obj2 = new CruiseShip("Jerry", "", 500);
    Ship obj3 = new Ship("Tom", "900");

    Ship[] array = {obj1, obj2, obj3};

    for (Ship object : array) {
      System.out.println(object + "\n");
    }

  }
}
