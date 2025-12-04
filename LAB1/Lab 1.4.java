package lab1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner inputReceiver = new Scanner(System.in);
        int studentScore = inputReceiver.nextInt();
        
        
        if (studentScore >= 80) {
            System.out.println("A");
            
        } else if (studentScore >= 70) { 
            System.out.println("B");
            
        } else if (studentScore >= 60) {
            System.out.println("C");
            
        } else if (studentScore >= 50) {
            System.out.println("D");
            
        } else { 
            System.out.println("F");
            
        }
        
        inputReceiver.close();
    }
}
