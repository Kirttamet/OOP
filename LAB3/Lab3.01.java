package lab2;

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {
        
        Scanner inputSource = new Scanner(System.in);
        
        String studentFullName = inputSource.nextLine();
        
        int finalScoreReceived;
        finalScoreReceived = inputSource.nextInt();
        
        int midtermScoreReceived;
        midtermScoreReceived = inputSource.nextInt();
        
        Student studentProfile = new Student(studentFullName, finalScoreReceived, midtermScoreReceived);
        
        studentProfile.showDetailedResult();
        
        inputSource.close();
    }
}

class Student {
    
    private String fullName;
    private int finalScore;
    private int midtermScore;
    
    public Student(String name, int finalValue, int midtermValue) {
        this.fullName = name;
        this.finalScore = finalValue;
        this.midtermScore = midtermValue;
    }
    
    public double calculateMean() {
        return (this.midtermScore + this.finalScore) / 2.0;
    }
    
    public void showDetailedResult() {
        
        double meanScore = this.calculateMean();
        
        String statusResult;
        if (meanScore >= 50.0) {
            statusResult = "Pass";
        } else {
            statusResult = "Fail";
        }
        
        System.out.println("Name: " + this.fullName);
        System.out.println("Average Score: " + meanScore);
        System.out.println("Status: " + statusResult);
    }
    
}