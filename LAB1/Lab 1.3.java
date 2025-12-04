package lab1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner inputSource = new Scanner(System.in);
        int userNumber = inputSource.nextInt();

        if (userNumber % 2 == 0) {
            
            System.out.println("Even");
            
        } else {
            
            System.out.println("Odd");
            
        }
        
        inputSource.close();
    }
}
