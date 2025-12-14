package lab3;

import java.util.Scanner;

public class Lab3_4 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        // รับจำนวน N
        int N = inputSource.nextInt();
        
        // รับค่า enter ที่เหลือจากการอ่าน int N
        inputSource.nextLine(); 
        
        for (int i = 0; i < N; i++) {
            // รับชื่อสินค้า (String)
            String productName = inputSource.nextLine();
            
            // สร้าง Object Product 
            new Product(productName); 
        }
        
        inputSource.close();
        
        // แสดงผลจำนวนสินค้าทั้งหมดโดยเรียกใช้เมธอด static
        System.out.println(Product.getProductCount());
    }
}

class Product {
    
    // Attribute ของ Instance: ชื่อสินค้า
    private String name;
    
    // Attribute ของ Class (Static): นับจำนวนสินค้าทั้งหมด
    private static int productCount = 0;
    
    // Constructor
    public Product(String name) {
        this.name = name;
        // เพิ่มค่า productCount ขึ้น 1 ทุกครั้งที่ Constructor ถูกเรียก
        productCount++;
    }
    
    // เมธอดสาธารณะ: ทำหน้าที่ return ค่า name
    public String getName() {
        return this.name;
    }
    
    // เมธอดสาธารณะ (Static): ทำหน้าที่ return ค่า productCount ที่เป็น static
    public static int getProductCount() {
        return productCount;
    }
}