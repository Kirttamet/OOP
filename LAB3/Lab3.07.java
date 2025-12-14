package lab3;

import java.util.Scanner;

public class Lab3_7 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        String employeeIdInput = inputSource.nextLine();
        String initialDepartment = inputSource.nextLine();
        String newDepartment = inputSource.nextLine();
        
        inputSource.close();
        
        Employee employeeProfile = new Employee(employeeIdInput, initialDepartment);
        
        employeeProfile.setDepartment(newDepartment);
        
        System.out.println(employeeProfile.getEmployeeId());
        System.out.println(employeeProfile.getDepartment());
    }
}

class Employee {
    
    private final String employeeId;
    private String department;
    
    public Employee(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }
    
    public String getEmployeeId() {
        return this.employeeId;
    }
    
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}