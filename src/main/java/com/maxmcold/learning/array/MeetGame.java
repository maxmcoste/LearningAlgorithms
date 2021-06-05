package com.maxmcold.learning.array;
import com.maxmcold.learning.Logger;

import java.util.Random;

public class MeetGame {

    private Scoreboard scores;

    public MeetGame(Scoreboard sb){
        scores = sb;
    }

    public boolean meet(int i, int j){

        if (i != j){

            GameEntry pl1 = scores.getElementAt(i);
            GameEntry pl2 = scores.getElementAt(j);
            if (i<j){
                scores.remove(i);
                scores.remove(j-1);
            }else{

                scores.remove(j);
                scores.remove(i-1);
            }


            int tmpScore = pl1.getScore();
            pl1.setScore(++tmpScore);
            tmpScore = pl2.getScore();
            pl2.setScore(++tmpScore);
            scores.add(pl1);
            scores.add(pl2);
            return true;

        }
        return false;

    }

    public void run(){

        int i = scores.size();
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());

        while (i-->0){

            int a = r.nextInt(scores.size());
            int b = r.nextInt(scores.size());
            if (meet(a,b))
                Logger.log("Step for index (" + a + "," + b + ") "+scores.getElementAt(a)+ " meet "+ scores.getElementAt(b));



        }



    }

}
