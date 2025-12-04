package lab1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner inputHandler = new Scanner(System.in);
        int multiplierTable = inputHandler.nextInt(); 
        
        for (int counter = 1; counter <= 12; counter++) {
            
            int result = multiplierTable * counter;
            
            System.out.println(multiplierTable + " x " + counter + " = " + result);
        }
        
        inputHandler.close();
    }
}
