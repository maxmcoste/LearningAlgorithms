package com.maxmcold.learning.array;

public class GameEntry {
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    private String name;

    public void setScore(int score) {
        this.score = score;
    }

    private int score;
    public GameEntry(String n, int s){
        name = n;
        score = s;
    }
    public String toString(){
        return "("+name + "," + score+")";
    }

}
