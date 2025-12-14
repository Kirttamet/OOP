package lab3;

import java.util.Scanner;

public class Lab3_9 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        int minLength1 = inputSource.nextInt();
        inputSource.nextLine(); 

        String user1_name = inputSource.nextLine();
        String user1_pass = inputSource.nextLine();
        
        String user2_name = inputSource.nextLine();
        String user2_pass = inputSource.nextLine();
        
        int minLength2 = inputSource.nextInt();
        inputSource.nextLine(); 
        
        String user2_newPass = inputSource.nextLine();
        
        inputSource.close();
        
        User.setMinLength(minLength1);
        
        User user1 = new User(user1_name, user1_pass);
        
        User user2 = new User(user2_name, user2_pass);
        
        User.setMinLength(minLength2);
        
        user2.setPassword(user2_newPass);
        
        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());
    }
}

class User {
    
    private String username;
    private String password;
    
    private static int minPasswordLength = 8;
    
    public static void setMinLength(int length) {
        if (length > 4) {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        } else {
            System.out.println("Invalid length.");
        }
    }
    
    public static int getMinLength() {
        return minPasswordLength;
    }
    
    public User(String username, String password) {
        this.username = username;
        
        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }
}