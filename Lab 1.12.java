package lab1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner dataFlow = new Scanner(System.in);
        
        int productCount = dataFlow.nextInt(); 
        
        int[] productIDs = new int[productCount];
        int[] stockQuantities = new int[productCount];
        
        for (int inventoryIndex = 0; inventoryIndex < productCount; inventoryIndex++) {
            productIDs[inventoryIndex] = dataFlow.nextInt();     
            stockQuantities[inventoryIndex] = dataFlow.nextInt(); 
        }
        
        int searchID = dataFlow.nextInt();
      
        boolean itemFound = false; 
        int foundStock = 0;        
        
        for (int searchIndex = 0; searchIndex < productCount; searchIndex++) {
            
            if (productIDs[searchIndex] == searchID) {
                
                foundStock = stockQuantities[searchIndex];
                itemFound = true; 
                
                break; 
            }
        }
        
        if (itemFound) {
            System.out.println(foundStock);
        } else {
            System.out.println("Product " + searchID + " not found");
        }
        
        dataFlow.close();
    }
}
