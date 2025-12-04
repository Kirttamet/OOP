package lab2;

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        double radiusValue;
        radiusValue = inputReader.nextDouble();
        
        Circle circleObject = new Circle(radiusValue);
        
        double areaResult = circleObject.getArea();
        double circumferenceResult = circleObject.getCircumference();
        
        System.out.println(areaResult);
        System.out.println(circumferenceResult);
        
        inputReader.close();
    }
}

class Circle {
    
    public double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
    
}