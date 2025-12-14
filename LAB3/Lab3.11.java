package lab3;

import java.util.Scanner;

public class Lab3_11 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        int N = inputSource.nextInt();
        inputSource.nextLine(); 
        
        for (int i = 0; i < N; i++) {
            String command = inputSource.nextLine().trim();
            
            if (command.equalsIgnoreCase("SET_URL")) {
                String newUrl = inputSource.nextLine();
                SystemConfig.getInstance().setServerUrl(newUrl);
            } else if (command.equalsIgnoreCase("SET_MAX")) {
                int maxCount = inputSource.nextInt();
                inputSource.nextLine(); 
                SystemConfig.getInstance().setMaxConnections(maxCount);
            } else if (command.equalsIgnoreCase("SHOW")) {
                SystemConfig config = SystemConfig.getInstance();
                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            }
        }
        
        inputSource.close();
    }
}

class SystemConfig {
    
    private static SystemConfig instance;
    
    private String serverUrl;
    private int maxConnections;
    
    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }
    
    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig(); 
        }
        return instance;
    }
    
    public String getServerUrl() {
        return this.serverUrl;
    }
    
    public int getMaxConnections() {
        return this.maxConnections;
    }
    
    public void setServerUrl(String url) {
        this.serverUrl = url;
    }
    
    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}