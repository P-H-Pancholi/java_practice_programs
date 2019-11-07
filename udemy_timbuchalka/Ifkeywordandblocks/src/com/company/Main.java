package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;


        if(gameover){
            int finalscore = score + levelcompleted * bonus;
            System.out.println("This is your final score " + finalscore);
        }
        //Print out the second score in the screen with following
        //score set to 10000
        //levelcompleted to 8000
        //bonus to 800
        //but make sure the first display above is same as well

        score = 10000;
        levelcompleted = 8;
        bonus = 800;
        if(gameover){
            int finalscore = score + levelcompleted * bonus;
            System.out.println("This is your second final score" + finalscore);
        }
    }
}
