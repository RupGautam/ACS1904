/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Labs.Lab7;

/**
 * Created by RupGautam on 26/10/2017.
 */


public class CheckingAccount extends BankAccount {
  private static double FEE = 0.15;

  public CheckingAccount(String name, double amount) {

    name = super.getOwner();
    super.deposit(amount);

  }



}
