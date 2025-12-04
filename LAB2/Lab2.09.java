package lab2;

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        String studentName = inputReader.nextLine();
        String streetDetail = inputReader.nextLine();
        String cityDetail = inputReader.nextLine();
        String zipCodeDetail = inputReader.nextLine();
        
        Address studentAddress = new Address(streetDetail, cityDetail, zipCodeDetail);
        
        Student academicPerson = new Student(studentName, studentAddress);
        
        academicPerson.displayProfile();
        
        inputReader.close();
    }
}

class Address {
    
    public String street;
    public String city;
    public String zipCode;
    
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    
    public String getFullAddress() {
        return this.street + ", " + this.city + ", " + this.zipCode;
    }
    
}

class Student {
    
    public String name;
    public Address address; 
    
    public Student(String studentName, Address addressObject) {
        this.name = studentName;
        this.address = addressObject;
    }
    
    public void displayProfile() {
        
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address.getFullAddress());
    }
    
}