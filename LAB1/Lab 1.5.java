package lab1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        

        Scanner menuInput = new Scanner(System.in);
        int menuNumber = menuInput.nextInt();
        

        switch (menuNumber) {
            case 1:
                System.out.println("Americano");
                break; 
            case 2:
                System.out.println("Latte");
                break;
            case 3:
                System.out.println("Espresso");
                break;
            case 4:
                System.out.println("Mocha");
                break;
            default: 
                System.out.println("Invalid Menu");
                break;
        }
        
        menuInput.close();
    }
}
