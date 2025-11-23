package lab1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner dataReceiver = new Scanner(System.in);
        
        int countN = dataReceiver.nextInt(); 
        
        double totalSum = 0.0;

        for (int seriesCounter = 0; seriesCounter < countN; seriesCounter++) {
            
            int currentValue = dataReceiver.nextInt();
            
            totalSum += currentValue;
        }
        
        double finalAverage = totalSum / countN;
        
        System.out.println(finalAverage);
        
        dataReceiver.close();
    }
}
