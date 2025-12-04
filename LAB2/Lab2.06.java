package lab2;

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {
        
        Scanner dataFlow = new Scanner(System.in);
        
        String accountOwnerName = dataFlow.nextLine();
        
        double initialAmount;
        initialAmount = dataFlow.nextDouble();
        
        double depositAmount;
        depositAmount = dataFlow.nextDouble();
        
        BankAccount primaryAccount = new BankAccount(accountOwnerName, initialAmount);
        
        primaryAccount.deposit(depositAmount);
        
        primaryAccount.displaySummary();
        
        dataFlow.close();
    }
}

class BankAccount {
    
    public String ownerName;
    public double balance;
    
    public BankAccount(String owner, double initialBalance) {
        this.ownerName = owner;
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }
    
    public void displaySummary() {
        
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Balance: " + this.balance);
    }
    
}