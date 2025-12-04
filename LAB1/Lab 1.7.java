package lab1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner dataInput = new Scanner(System.in);
        
        int loopCount = dataInput.nextInt(); 
        
        int calculatedSum = 0;
        
        for (int iteration = 0; iteration < loopCount; iteration++) {
            
            int nextNumber = dataInput.nextInt();
            
            calculatedSum = calculatedSum + nextNumber; 
        }
        
        System.out.println(calculatedSum);
        
        dataInput.close();
    }
}
