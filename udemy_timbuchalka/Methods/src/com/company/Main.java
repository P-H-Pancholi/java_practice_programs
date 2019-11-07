package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;


        calculatescores(true, 800,levelcompleted, bonus);
        calculatescores(true, 10000,8,800);

            }
    public static void calculatescores(boolean gameover, int score, int levelcompleted, int bonus){

        if(gameover){
            int finalscore = score + levelcompleted * bonus;
            finalscore += 1000;
            System.out.println("This is your final score " + finalscore);
        }

    }

}
