package lab3;

import java.util.Scanner;

public class Lab3_14 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        BankAccount myAccount = null;
        
        int N = inputSource.nextInt();
        inputSource.nextLine(); 
        
        for (int i = 0; i < N; i++) {
            String command = inputSource.nextLine().trim();
            
            if (command.equalsIgnoreCase("CREATE")) {
                double initialDeposit = inputSource.nextDouble();
                inputSource.nextLine(); 
                
                myAccount = new BankAccount(initialDeposit);
            } else if (command.equalsIgnoreCase("DEPOSIT")) {
                double amount = inputSource.nextDouble();
                inputSource.nextLine();
                
                if (myAccount != null) {
                    myAccount.deposit(amount);
                } else {
                    System.out.println("Error: Must CREATE before DEPOSIT or WITHDRAW.");
                }
            } else if (command.equalsIgnoreCase("WITHDRAW")) {
                double amount = inputSource.nextDouble();
                inputSource.nextLine();
                
                if (myAccount != null) {
                    myAccount.withdraw(amount);
                } else {
                    System.out.println("Error: Must CREATE before DEPOSIT or WITHDRAW.");
                }
            } else if (command.equalsIgnoreCase("STATUS")) {
                if (myAccount != null) {
                    System.out.println("Balance: " + myAccount.getBalance());
                } else {
                    System.out.println("No account exists.");
                }
            } else if (command.equalsIgnoreCase("GLOBAL_STATUS")) {
                System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount());
            }
        }
        
        inputSource.close();
    }
}

class BankAccount {
    
    private double balance;
    private static int totalTransactionCount = 0;
    
    public BankAccount(double initialDeposit) {
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
        }
        System.out.println("Account created.");
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}