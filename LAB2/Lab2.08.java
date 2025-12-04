package lab2;

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {
        
        Scanner inputSource = new Scanner(System.in);
        
        String conversionMode = inputSource.nextLine();
        
        double temperatureValue;
        temperatureValue = inputSource.nextDouble();
        
        double resultValue;
        
        if (conversionMode.equals("C_TO_F")) {
            resultValue = TempConverter.celsiusToFahrenheit(temperatureValue);
        } else if (conversionMode.equals("F_TO_C")) {
            resultValue = TempConverter.fahrenheitToCelsius(temperatureValue);
        } else {
            resultValue = 0.0;
        }
        
        System.out.println(resultValue);
        
        inputSource.close();
    }
}

class TempConverter {
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
    
}