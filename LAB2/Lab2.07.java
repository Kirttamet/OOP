package lab2;

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {
        
        Scanner inputSource = new Scanner(System.in);
        
        String accountHolderName = inputSource.nextLine();
        
        double startingBalance;
        startingBalance = inputSource.nextDouble();
        
        double withdrawalOne;
        withdrawalOne = inputSource.nextDouble();
        
        double withdrawalTwo;
        withdrawalTwo = inputSource.nextDouble();
        
        BankAccount clientAccount = new BankAccount(accountHolderName, startingBalance);
        
        clientAccount.withdraw(withdrawalOne);
        clientAccount.withdraw(withdrawalTwo);
        
        clientAccount.displayBalance();
        
        inputSource.close();
    }
}

class BankAccount {
    
    public String ownerName;
    public double balance;
    
    public BankAccount(String name, double initialAmount) {
        this.ownerName = name;
        this.balance = initialAmount;
    }
    
    public void withdraw(double amountToDeduct) {
        
        if (amountToDeduct <= this.balance) {
            this.balance = this.balance - amountToDeduct;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    
    public void displayBalance() {
        
        System.out.println("Balance: " + this.balance);
    }
    
}