package lab3;

import java.util.Scanner;

public class Lab3_8 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        String productNameInput = inputSource.nextLine();
        int initialStockInput = inputSource.nextInt();
        int N = inputSource.nextInt();
        
        inputSource.nextLine(); 
        
        InventoryItem item = new InventoryItem(productNameInput, initialStockInput);
        
        for (int i = 0; i < N; i++) {
            String operationLine = inputSource.nextLine();
            String[] parts = operationLine.split(" ");
            
            String operation = parts[0];
            int amount = Integer.parseInt(parts[1]);
            
            if (operation.equalsIgnoreCase("ADD")) {
                item.addStock(amount);
            } else if (operation.equalsIgnoreCase("SELL")) {
                item.sellStock(amount);
            }
        }
        
        inputSource.close();
        
        System.out.println("Final Stock: " + item.getStock());
    }
}

class InventoryItem {
    
    private String productName;
    private int stock;
    
    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;
        
        if (initialStock > 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }
    
    public String getProductName() {
        return this.productName;
    }
    
    public int getStock() {
        return this.stock;
    }
    
    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    public void sellStock(int amount) {
        if (amount > 0) {
            if (amount <= this.stock) {
                this.stock -= amount;
                System.out.println("Sale successful.");
            } else {
                System.out.println("Not enough stock.");
            }
        } else {
            System.out.println("Invalid amount.");
        }
    }
}