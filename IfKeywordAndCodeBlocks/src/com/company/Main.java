package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 600;
        int levelCompleted = 5;
        int bonus = 100;

        if(score <=5000 && score >1000) {
            System.out.println("Your score was " + score );
            System.out.println("You got a score between 5000 and 10000");
        }else if(score <1000  && score >500) {
            System.out.println("Your score was " + score );
            System.out.println("You got a score between 1000 and 500");
        }
        else {
            System.out.println("Your score was " + score );
            System.out.println("Or you are really bad or good who knows?");
        }
    }
}
