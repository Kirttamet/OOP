package lab3;

import java.util.Scanner;

public class Lab3_3 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        String initialPassword = inputSource.nextLine();
        String newPassword = inputSource.nextLine();
        
        inputSource.close();
        
        User userProfile = new User(initialPassword);
        
        userProfile.setPassword(newPassword);
        
        System.out.println(userProfile.getPassword());
    }
}

class User {
    
    private String password;
    
    public User(String initialPassword) {
        this.password = initialPassword;
    }
    
    public String getPassword() {
        return "ปัจจุบัน: " + this.password;
    }
    
    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}