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

    CargoShip obj1 = new CargoShip("Emma Mærsk", "1930", 14770);

    CruiseShip obj2 = new CruiseShip("Jerry", "2001", 500);


    Ship[] array = {obj1, obj2};

    for (Ship object : array) {
      System.out.println(object + "\n");
    }
  }
}
