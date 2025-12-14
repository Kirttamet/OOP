package lab3;

import java.util.Scanner;

public class Lab3_13 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        int N = inputSource.nextInt();
        inputSource.nextLine(); 
        
        for (int i = 0; i < N; i++) {
            String command = inputSource.nextLine().trim();
            
            if (command.equalsIgnoreCase("SET")) {
                int max = inputSource.nextInt();
                inputSource.nextLine(); 
                LicenseManager.setMax(max);
            } else if (command.equalsIgnoreCase("CHECKOUT")) {
                LicenseManager.checkOut();
            } else if (command.equalsIgnoreCase("CHECKIN")) {
                LicenseManager.checkIn();
            } else if (command.equalsIgnoreCase("STATUS")) {
                LicenseManager.displayStatus();
            }
        }
        
        inputSource.close();
    }
}

class LicenseManager {
    
    private static int maxLicenses = 10;
    private static int usedLicenses = 0;
    
    public static void setMax(int max) {
        if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
        } else if (max > 0) {
            maxLicenses = max;
            System.out.println("Max licenses set to " + max);
        } else {
            System.out.println("Invalid max value.");
        }
    }
    
    public static boolean checkOut() {
        if (usedLicenses < maxLicenses) {
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;
        } else {
            System.out.println("Checkout failed: No licenses available.");
            return false;
        }
    }
    
    public static void checkIn() {
        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }
    
    public static void displayStatus() {
        int available = maxLicenses - usedLicenses;
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + available);
    }
}