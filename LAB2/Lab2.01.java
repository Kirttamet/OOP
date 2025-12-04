package lab2;

import java.util.Scanner;

public class lab2 {
    
    public static void main(String[] args) {
        
        Scanner dataReader = new Scanner(System.in);
        
        // 1. รับค่า Student ID และ Name
        String idInput = dataReader.nextLine();
        String nameInput = dataReader.nextLine();
        
        // 2. สร้าง Object (Instance) จาก Class Student
        Student academicProfile = new Student();
        
        // 3. กำหนดค่า (Assign) ให้ Attributes
        academicProfile.studentId = idInput;
        academicProfile.name = nameInput;
        
        // 4. เรียกใช้ Method ใน Object เพื่อแสดงผลลัพธ์
        // เมธอดนี้จะจัดการการพิมพ์ค่า studentId และ name เอง
        academicProfile.displayProfile();
        
        dataReader.close();
    }
}

// =======================================================
// Class Student (รวมอยู่ในไฟล์เดียวกับ Main)
// =======================================================
class Student {
    
    // Attributes (Fields)
    public String studentId;
    public String name;
    
    /**
     * Method สำหรับแสดงผลข้อมูล (Logic ส่วนนี้ถูกย้ายมาจาก main)
     */
    public void displayProfile() {
        // พิมพ์ค่า studentId ก่อน name (ตามโจทย์)
        System.out.println(this.studentId);
        System.out.println(this.name);
    }
    
}