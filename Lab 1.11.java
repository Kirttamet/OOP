package lab1;

import java.util.Scanner;

public class Main {
    
    public static int sumArray(int[] numberSet) {
      
        int totalValue = 0;
        
        for (int element : numberSet) {
            totalValue += element;
        }
        
        return totalValue;
    }
    
    public static void main(String[] args) {
        
        Scanner dataFlow = new Scanner(System.in);
        
        int arrayLength = dataFlow.nextInt(); 
        
        int[] inputNumbers = new int[arrayLength];
        
        for (int position = 0; position < arrayLength; position++) {
            inputNumbers[position] = dataFlow.nextInt();
        }
        
        int calculatedResult = sumArray(inputNumbers);
        
        System.out.println(calculatedResult);
        
        dataFlow.close();
    }
}
