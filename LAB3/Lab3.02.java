package lab3;

import java.util.Scanner;

public class Lab3_2 {

    public static void main(String[] args) {

        Scanner inputSource = new Scanner(System.in);
        
        int initialScore = inputSource.nextInt();
        int finalScore = inputSource.nextInt();
        
        inputSource.close();
        
        Player playerOne = new Player(initialScore);
        
        playerOne.setScore(finalScore);
        
        System.out.println(playerOne.getScore());
    }
}

class Player {
    
    private int score;
    
    public Player(int initialScore) {
        this.score = initialScore;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public void setScore(int newScore) {
        this.score = newScore;
    }
}