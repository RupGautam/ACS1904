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


public class InvalidNameException extends Exception{
  public InvalidNameException(String err){
    super("Invalid Name, Please provide employee name" +err);
  }
}

