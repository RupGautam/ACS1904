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


public class SavingsAccount extends BankAccount {
  private double Rate = 0.025;
  private int savingsNumber = 0;
  private String accountNumber;

  public SavingsAccount(String name, double amount) {
    super(name, amount);

    accountNumber = super.getAccountNumber() + "-" + savingsNumber;
  }

  public SavingsAccount(SavingsAccount oldAccount, double amount) {

  }

  public void postInterest() {
    double newBalance = getBalance() * (1 + Rate / 12);

    setBalance(newBalance);

  }

  @Override
  public String getAccountNumber() {

    return accountNumber;
  }

}
