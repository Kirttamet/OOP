package lab1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner consoleInput = new Scanner(System.in); 

        double rectangleWidth = consoleInput.nextDouble();
        double rectangleHeight = consoleInput.nextDouble();

        System.out.println(rectangleWidth * rectangleHeight);
        
        consoleInput.close(); 
    }
}
