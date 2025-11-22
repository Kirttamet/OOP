package lab1; // ใช้ package ชื่อ lab1 ตามที่ Eclipse แนะนำ

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับค่าจำนวนเต็มสองตัวจากผู้ใช้
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // คำนวณผลบวก
        int sum = num1 + num2;

        // แสดงผลลัพธ์
        System.out.println(sum);
        
        // <<< เพิ่มบรรทัดนี้เพื่อปิด Scanner >>>
        sc.close(); 
    }
}
