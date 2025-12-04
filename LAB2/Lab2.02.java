package lab2;

import java.util.Scanner;

public class lab2 {
    
    public static void main(String[] args) {
        
        Scanner dataReader = new Scanner(System.in);
        
        // 1. รับค่า Student ID และ Name
        String studentID_Input = dataReader.nextLine(); // ใช้ตัวแปรชื่อยาวขึ้น
        String studentName_Input = dataReader.nextLine();
        
        // 2. สร้าง Object (Instance) จาก Class Student
        Student academicRecord = new Student(); // ใช้ชื่อ Object ที่ต่างออกไป
        
        // 3. กำหนดค่า (Assign) ให้ Attributes
        academicRecord.studentId = studentID_Input;
        academicRecord.name = studentName_Input;
        
        // 4. เรียกใช้ Method displayInfo() ใน Object เพื่อแสดงผลลัพธ์
        academicRecord.displayInfo();
        
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
     * Method ตามโจทย์: displayInfo()
     * ทำหน้าที่แสดงผล studentId และ name ของ Object ตัวเอง
     */
    public void displayInfo() {
        // พิมพ์ค่า studentId ก่อน name (ตามโจทย์)
        System.out.println(this.studentId);
        System.out.println(this.name);
    }
    
}