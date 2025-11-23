package lab1;

import java.util.Scanner;

public class Main {
    
    public static int countNeighborMines(char[][] mapGrid, int R, int C, int rTarget, int cTarget) {
        
        int mineCount = 0;
        
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for (int i = 0; i < 8; i++) {
            
            int neighborR = rTarget + dr[i]; 
            int neighborC = cTarget + dc[i]; 
            
            boolean isInBounds = (neighborR >= 0 && neighborR < R && neighborC >= 0 && neighborC < C);
            
            if (isInBounds && mapGrid[neighborR][neighborC] == '*') {
                mineCount++;
            }
        }
        
        return mineCount;
    }
    
    public static void main(String[] args) {
        
        Scanner inputHandler = new Scanner(System.in);
        
        int numRows = inputHandler.nextInt();
        int numCols = inputHandler.nextInt();
        
        char[][] mapGrid = new char[numRows][numCols];
        
        for (int r = 0; r < numRows; r++) {
            String rowData = inputHandler.next();
            for (int c = 0; c < numCols; c++) {
                mapGrid[r][c] = rowData.charAt(c);
            }
        }
        
        int targetR = inputHandler.nextInt();
        int targetC = inputHandler.nextInt();
        
        if (mapGrid[targetR][targetC] == '*') {
            
            System.out.println("Mine");
            
        } else {
            
            int bombsNearby = countNeighborMines(mapGrid, numRows, numCols, targetR, targetC);
            System.out.println(bombsNearby);
            
        }
        
        inputHandler.close();
    }
}
