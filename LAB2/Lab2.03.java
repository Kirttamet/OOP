package lab2;

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        int registrationCount;
        registrationCount = inputReader.nextInt();
        inputReader.nextLine(); 
        
        for (int i = 0; i < registrationCount; i++) {
            
            String idValue = inputReader.nextLine();
            String nameValue = inputReader.nextLine();
            
            Student studentObject = new Student(idValue, nameValue);
        }
        
        System.out.println(Student.studentCount);
        
        inputReader.close();
    }
}

class Student {
    
    public String studentId;
    public String name;
    
    public static int studentCount = 0;
    
    public Student(String id, String studentName) {
        this.studentId = id;
        this.name = studentName;
        studentCount++; 
    }
    
}