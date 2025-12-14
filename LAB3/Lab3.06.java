package lab3;

import java.util.Scanner;

public class Lab3_6 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        double initialBalance = inputSource.nextDouble();
        double depositAmount = inputSource.nextDouble();
        double withdrawalAmount = inputSource.nextDouble();
        
        inputSource.close();
        
        BankAccount account = new BankAccount(initialBalance);
        
        account.deposit(depositAmount);
        account.withdraw(withdrawalAmount);
        
        System.out.println("Final Balance: " + account.getBalance());
    }
}

class BankAccount {
    
    private double balance;
    
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("InitialBalance is zero or negative. Set balance to 0.");
        }
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}