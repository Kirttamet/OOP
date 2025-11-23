package lab1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner dataFlow = new Scanner(System.in);
        
        int numRows = dataFlow.nextInt(); 
        int numCols = dataFlow.nextInt(); 
        
        int[][] serverGrid = new int[numRows][numCols];
        
        int onlineCount = 0;
        
        for (int row = 0; row < numRows; row++) {
            
            for (int col = 0; col < numCols; col++) {
                
                serverGrid[row][col] = dataFlow.nextInt();
                
                if (serverGrid[row][col] == 1) {
                    onlineCount++; 
                }
            }
        }
        
        System.out.println(onlineCount);
        
        dataFlow.close();
    }
}
