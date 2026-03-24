/*
Topic: Methods
Concepts Practiced:
- methods
- if statements
- variables

Author: Sheriff 
Date: March 17, 2026
*/

package methods.projects;
/*MINI PROJECT - ATM SIMULATOR
    Create a platform that allows you to 
    - checkBalance
    - deposit 
    - withdraw 
    
    Make sure to add the proper security checks 
    for deposit and withdraw*/

public class ATMsimulator {

  // Variables
  static double balance = 0; // set initial balance

  // Check Balance
  public static double checkBalance() {
    return balance;
  }

  // Deposit Amount
  public static void deposit(double amount) {

    if (amount > 0) { // Make sure amount in > £0
      balance += amount; // add the amount to the balance
      System.out.println("Successfully deposited: £" + amount);
      System.out.println("New Balance: £" + balance);
    } else {  //If the amount is less than £0
      System.out.println("Please deposit a valid amount.");
    }

  }

  // Withdraw Amount
  public static void withdraw(double amount) {
    if (amount <= 0 || amount > balance) { // Make sure amount is > £0 and you have enough
      System.out.println("Insufficient Funds.");
    } else {  //If the amount is valid
      balance -= amount; // remove the amount from the balance
      System.out.println("Successfully withdrew: £" + amount);
      System.out.println("New Balance: £" + balance);
    }

  }

  public static void main(String[] args) {

    //Display the initial balance
    System.out.println("Initial Balance: £" + checkBalance());
    
    deposit(5); //use deposit method
    withdraw(2);  //use withdraw method
    
    //display the final balance
    System.out.println("Final balance: £" + checkBalance());

  }
}
