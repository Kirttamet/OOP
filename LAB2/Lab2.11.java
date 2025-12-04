package lab2;

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        double widthValue;
        widthValue = inputReader.nextDouble();
        
        double heightValue;
        heightValue = inputReader.nextDouble();
        
        Rectangle shapeObject = new Rectangle(widthValue, heightValue);
        
        double areaResult = shapeObject.getArea();
        double perimeterResult = shapeObject.getPerimeter();
        
        System.out.println(areaResult);
        System.out.println(perimeterResult);
        
        inputReader.close();
    }
}

class Rectangle {
    
    public double width;
    public double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        return this.width * this.height;
    }
    
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
    
}