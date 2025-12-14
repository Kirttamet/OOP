package lab3;

import java.util.Scanner;

public class Lab3_5 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        String connectionStringInput = inputSource.nextLine();
        
        inputSource.close();
        
        DatabaseConnection db = new DatabaseConnection(connectionStringInput);
        
        db.connect();
        db.disconnect();
        db.disconnect();
        
        System.out.println(db.isConnected());
    }
}

class DatabaseConnection {
    
    private String connectionString;
    private boolean connected;
    
    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = true;
    }
    
    public boolean isConnected() {
        return this.connected;
    }
    
    public void connect() {
        if (this.connected == false) {
            this.connected = true;
            System.out.println("Connected to " + this.connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }
    
    public void disconnect() {
        if (this.connected == true) {
            this.connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}