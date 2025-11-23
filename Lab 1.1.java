package lab1;

import java.util.Scanner;

public class Main {
    /**
     * Lab 1.1: โปรแกรมบวกเลขจำนวนเต็ม 2 จำนวน.
     */
    public static void main(String[] args) {
        
        // 1. สร้างวัตถุ Scanner เพื่อรับข้อมูลจากคีย์บอร์ด
        Scanner userInput = new Scanner(System.in); 

        // 2. รับค่าจำนวนเต็มตัวที่หนึ่งและตัวที่สอง
        // ใช้ชื่อตัวแปรที่ไม่ซ้ำ: valueA, valueB
        int valueA = userInput.nextInt();
        int valueB = userInput.nextInt();

        // 3. คำนวณผลรวมของทั้งสองจำนวน
        int resultTotal = valueA + valueB;

        // 4. แสดงผลลัพธ์ออกทางหน้าจอ
        System.out.println(resultTotal);
        
        // 5. ปิด Scanner
        userInput.close(); 
    }
}
