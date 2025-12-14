package lab3;

import java.util.Scanner;

public class Lab3_15 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        String username = inputSource.nextLine();
        int N = inputSource.nextInt();
        inputSource.nextLine(); 

        User userProfile = new User(username);
        
        for (int i = 0; i < N; i++) {
            String command = inputSource.nextLine().trim();
            
            if (command.equalsIgnoreCase("SET_POLICY")) {
                int max = inputSource.nextInt();
                inputSource.nextLine(); 
                User.setPolicy(max);
            } else if (command.equalsIgnoreCase("LOGIN")) {
                String password = inputSource.nextLine();
                userProfile.login(password);
            } else if (command.equalsIgnoreCase("STATUS")) {
                System.out.println("User: " + userProfile.getUsername());
                System.out.println("Locked: " + userProfile.isLocked());
                System.out.println("Failed attempts: " + userProfile.getFailedAttempts());
                System.out.println("Max attempts: " + User.getMaxAttempts());
            }
        }
        
        inputSource.close();
    }
}

class User {
    
    private String username;
    private int failedAttempts;
    private boolean isLocked;
    
    // Static Policy Attribute
    private static int maxAttempts = 3;
    
    // Constructor
    public User(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }
    
    // Instance Getters
    public String getUsername() { return this.username; }
    public boolean isLocked() { return this.isLocked; }
    public int getFailedAttempts() { return this.failedAttempts; }

    // Static Getter (เพื่อให้ Main เรียกใช้ได้)
    public static int getMaxAttempts() {
        return maxAttempts;
    }
    
    // Static Setter (setPolicy)
    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }
    
    // Login Method
    public void login(String password) {
        if (this.isLocked) {
            System.out.println("Login failed. Account locked.");
            return;
        }
        
        // สมมติรหัสที่ถูกต้องคือ "pass123"
        if (password.equals("pass123")) {
            this.failedAttempts = 0; // รีเซ็ตเมื่อสำเร็จ
            System.out.println("Login successful.");
        } else {
            this.failedAttempts++;
            
            if (this.failedAttempts >= maxAttempts) {
                this.isLocked = true;
                System.out.println("Login failed. Account locked.");
            } else {
                int attemptsLeft = maxAttempts - this.failedAttempts;
                System.out.println("Login failed. " + attemptsLeft + " attempts left.");
            }
        }
    }
}