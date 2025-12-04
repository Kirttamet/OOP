package lab1;

import java.util.Scanner;

public class Main {
  
    public static double calculateArea(double inputWidth, double inputHeight) {

        return inputWidth * inputHeight; 
    }

    public static void main(String[] args) {
        
        Scanner measurementInput = new Scanner(System.in);
        double rectangleWidth = measurementInput.nextDouble();
        double rectangleHeight = measurementInput.nextDouble();
        
        double finalArea = calculateArea(rectangleWidth, rectangleHeight);
        
        System.out.println(finalArea);
        
        measurementInput.close();
    }
}
