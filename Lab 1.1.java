package lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        Scanner ohmuserInput = new Scanner(System.in); 


        int ohmvalueA = ohmuserInput.nextInt();
        int ohmvalueB = ohmuserInput.nextInt();


        int resultTotal = ohmvalueA + ohmvalueB;


        System.out.println(resultTotal);
        

        ohmuserInput.close(); 
    }
}

