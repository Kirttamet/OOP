package lab2;

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {
        
        Scanner dataFlow = new Scanner(System.in);
        
        String nameValue = dataFlow.nextLine();
        
        int midtermValue;
        midtermValue = dataFlow.nextInt();
        
        int finalValue;
        finalValue = dataFlow.nextInt();
        
        Student academicProfile = new Student(nameValue, midtermValue, finalValue);
        
        academicProfile.displaySummary();
        
        dataFlow.close();
    }
}

class Student {
    
    public String name;
    public int midtermScore;
    public int finalScore;
    
    // Constructor (รับ 3 ค่า)
    public Student(String studentName, int midterm, int finalScore) {
        this.name = studentName;
        this.midtermScore = midterm;
        this.finalScore = finalScore;
    }
    
    // Method 1: คำนวณค่าเฉลี่ย
    public double calculateAverage() {
        return (this.midtermScore + this.finalScore) / 2.0;
    }
    
    // Method 2: แสดงสรุปและเรียกใช้ calculateAverage()
    public void displaySummary() {
        
        double studentAverage = this.calculateAverage();
        
        String statusText;
        if (studentAverage >= 50.0) {
            statusText = "Pass";
        } else {
            statusText = "Fail";
        }
        
        System.out.println("Name: " + this.name);
        System.out.println("Average Score: " + studentAverage);
        System.out.println("Status: " + statusText);
    }
    
}