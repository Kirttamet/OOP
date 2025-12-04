package lab2;

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {
        
        Scanner dataInput = new Scanner(System.in);
        
        int numberOfProducts;
        numberOfProducts = dataInput.nextInt();
        dataInput.nextLine(); 
        
        ShoppingCart myCart = new ShoppingCart();
        
        for (int i = 0; i < numberOfProducts; i++) {
            
            String productName = dataInput.nextLine();
            double productPrice = dataInput.nextDouble();
            dataInput.nextLine(); 
            
            Item newItem = new Item(productName, productPrice);
            myCart.addProduct(newItem);
        }
        
        double finalPrice = myCart.calculateTotalPrice();
        
        System.out.println(finalPrice);
        
        dataInput.close();
    }
}

class Item {
    
    public String name;
    public double price;
    
    public Item(String itemName, double itemPrice) {
        this.name = itemName;
        this.price = itemPrice;
    }
    
}

class ShoppingCart {
    
    public Item[] items = new Item[10]; 
    public int itemCount = 0;
    
    public void addProduct(Item product) {
        this.items[this.itemCount] = product;
        this.itemCount++;
    }
    
    public double calculateTotalPrice() {
        
        double totalSum = 0.0;
        
        for (int i = 0; i < this.itemCount; i++) {
            totalSum = totalSum + this.items[i].price;
        }
        
        return totalSum;
    }
    
}