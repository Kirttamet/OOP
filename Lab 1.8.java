package lab1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);
        
        int arraySize = inputScanner.nextInt(); 
        
        int[] numberCollection = new int[arraySize];

        for (int index = 0; index < arraySize; index++) {
            numberCollection[index] = inputScanner.nextInt();
        }
      
        int maximumValue = numberCollection[0];

        for (int index = 1; index < arraySize; index++) {

            if (numberCollection[index] > maximumValue) {
                
                maximumValue = numberCollection[index];
            }
        }
        
        System.out.println(maximumValue);
        
        inputScanner.close();
    }
}
