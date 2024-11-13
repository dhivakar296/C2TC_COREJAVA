package com.tns.ifet.day5;

import java.util.Scanner;

//Static Bank class
class Bank {
 private static int totalAccounts = 0; // Static variable to keep track of total accounts

 public static int getTotalAccounts() {
     return totalAccounts;
 }

 public static void incrementTotalAccounts() {
     totalAccounts++;
 }
}

//Abstract Account class
abstract class Account {
 protected double balance;

 public Account(double initialBalance) {
     this.balance = initialBalance;
     Bank.incrementTotalAccounts(); // Increment total accounts in Bank whenever a new Account is created
 }

 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
 public abstract double getBalance();
 
 public void displayBalance() {
     System.out.println("Current balance: " + balance);
 }
}

//SavingsAccount class inheriting from Account
class SavingsAccount extends Account {
 private static final double INTEREST_RATE = 0.03; // 3% interest rate

 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount + (amount * INTEREST_RATE);
     System.out.println("Deposited " + amount + " with interest. New balance: " + balance);
 }

 @Override
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrew " + amount + ". New balance: " + balance);
     } else {
         System.out.println("Insufficient balance for withdrawal.");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }
}

//CheckingAccount class inheriting from Account
class CheckingAccount extends Account {
 private static final double OVERDRAFT_LIMIT = 500.00;

 public CheckingAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + ". New balance: " + balance);
 }

 @Override
 public void withdraw(double amount) {
     if (balance + OVERDRAFT_LIMIT >= amount) {
         balance -= amount;
         System.out.println("Withdrew " + amount + ". New balance: " + balance);
     } else {
         System.out.println("Withdrawal exceeds overdraft limit.");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }
}

//Final Transaction class
final class Transaction {
 private final double transactionFee = 2.00; // Final variable for transaction fee

 public final void performTransaction(Account account, double amount, boolean isDeposit) {
     if (isDeposit) {
         account.deposit(amount);
     } else {
         account.withdraw(amount + transactionFee); // Deduct transaction fee for withdrawals
     }
     System.out.println("Transaction complete. Fee applied: " + transactionFee);
 }
}

//Main class to demonstrate functionality
public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Input initial balances for accounts
     System.out.print("Enter initial balance for Savings Account: ");
     double savingsInitialBalance = scanner.nextDouble();
     SavingsAccount savings = new SavingsAccount(savingsInitialBalance);

     System.out.print("Enter initial balance for Checking Account: ");
     double checkingInitialBalance = scanner.nextDouble();
     CheckingAccount checking = new CheckingAccount(checkingInitialBalance);

     Transaction transaction = new Transaction();
     
     System.out.println("Total accounts: " + Bank.getTotalAccounts());

     // Perform transactions
     System.out.print("Enter deposit amount for Savings Account: ");
     double savingsDeposit = scanner.nextDouble();
     transaction.performTransaction(savings, savingsDeposit, true);

     System.out.print("Enter withdrawal amount for Checking Account: ");
     double checkingWithdraw = scanner.nextDouble();
     transaction.performTransaction(checking, checkingWithdraw, false);

     // Display balances
     System.out.println("Savings Account Balance: " + savings.getBalance());
     System.out.println("Checking Account Balance: " + checking.getBalance());
     System.out.println("Total accounts: " + Bank.getTotalAccounts());

     scanner.close();
 }
}