package lab3;

import java.util.Scanner;

public class Lab3_12 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        String name = inputSource.nextLine();
        double monthlySalary = inputSource.nextDouble();
        double taxRate = inputSource.nextDouble();
        double raiseAmount = inputSource.nextDouble();
        
        inputSource.close();
        
        Employee employeeProfile = new Employee(name, monthlySalary);
        
        System.out.println("Tax (Before): " + employeeProfile.calculateTax(taxRate));
        
        employeeProfile.giveRaise(raiseAmount);
        
        System.out.println("Tax (After): " + employeeProfile.calculateTax(taxRate));
    }
}

class Employee {
    
    private String name;
    private double monthlySalary;
    
    public Employee(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public void giveRaise(double amount) {
        if (amount > 0) {
            this.monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    private double getAnnualSalary() {
        return this.monthlySalary * 12;
    }
    
    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}