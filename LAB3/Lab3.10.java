package lab3;

import java.util.Scanner;

public class Lab3_10 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        int N = inputSource.nextInt();
        inputSource.nextLine(); 
        
        for (int i = 0; i < N; i++) {
            String command = inputSource.nextLine();
            
            if (command.equalsIgnoreCase("SET")) {
                int newLevel = inputSource.nextInt();
                inputSource.nextLine(); 
                SystemLogger.setLogLevel(newLevel);
            } else if (command.equalsIgnoreCase("LOG")) {
                int messageLevel = inputSource.nextInt();
                String message = inputSource.nextLine().trim(); 
                SystemLogger.log(messageLevel, message);
            }
        }
        
        inputSource.close();
    }
}

class SystemLogger {
    
    private static int currentLogLevel = 1;
    
    private static String getLevelName(int level) {
        if (level == 1) {
            return "INFO";
        } else if (level == 2) {
            return "DEBUG";
        } else if (level == 3) {
            return "ERROR";
        } else {
            return "UNKNOWN";
        }
    }
    
    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        } else {
            System.out.println("Invalid log level.");
        }
    }
    
    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel && messageLevel >= 1 && messageLevel <= 3) {
            String levelName = getLevelName(messageLevel);
            System.out.println("[" + levelName + "]: " + message);
        }
    }
}