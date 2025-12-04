package lab2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    
    public static void main(String[] args) {
        
        Scanner dataFlow = new Scanner(System.in);
        
        int numberOfStudents = dataFlow.nextInt();
        dataFlow.nextLine();
        
        List<Student> studentList = new ArrayList<>();
        
        for (int i = 0; i < numberOfStudents; i++) {
            
            String nameValue = dataFlow.nextLine();
            
            int midtermValue;
            midtermValue = dataFlow.nextInt();
            
            int finalValue;
            finalValue = dataFlow.nextInt();
            
            dataFlow.nextLine();
            
            Student academicProfile = new Student(nameValue, midtermValue, finalValue);
            studentList.add(academicProfile);
        }
        
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("--- Student " + (i + 1) + " ---");
            studentList.get(i).displaySummary();
        }
        
        dataFlow.close();
    }
}

class Student {
    
    public String name;
    public int midtermScore;
    public int finalScore;
    
    public Student(String studentName, int midterm, int finalScore) {
        this.name = studentName;
        this.midtermScore = midterm;
        this.finalScore = finalScore;
    }
    
    public double calculateAverage() {
        return (this.midtermScore + this.finalScore) / 2.0;
    }
    
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