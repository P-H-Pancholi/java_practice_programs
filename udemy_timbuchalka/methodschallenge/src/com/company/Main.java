package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        displayHighScorePosition("Phalin",1 );
        calculateHighScorePosition(1500);
        calculateHighScorePosition(900);
        calculateHighScorePosition(400);
        calculateHighScorePosition(50);
    }
    public static void displayHighScorePosition(String playersName, int playersPosition){
        System.out.println(playersName + " managed to get into position " + playersPosition + " on " +
                "high score table");
    }
    public static int calculateHighScorePosition(int playersScore){
        if (playersScore > 1000)
            return 1;
        if (playersScore < 1000 & playersScore > 500)
            return 2;
        if (playersScore < 500 & playersScore > 100)
            return 3;

            return 4;
        }
    }

