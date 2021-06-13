package com.maxmcold.learning.array;

public class Scoreboard {
    private int numEntries = 0;
    private GameEntry[] board;

    public Scoreboard(int capacity){
        board = new GameEntry[capacity];
    }

    public GameEntry getElementAt(int i){
        return board[i];
    }
    public void add(GameEntry e){
        int newScore = e.getScore();

        if (numEntries < board.length || newScore > board[numEntries-1].getScore()){
            if (numEntries <board.length)
                numEntries++;
            int j = numEntries -1;
            while (j > 0 && board[j-1].getScore() < newScore){
                board[j] = board[j-1];
                j--;
            }
            board[j] = e;

        }
    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException{
        if (i<0 || i>= numEntries)
            throw new IndexOutOfBoundsException("Invalid Index for remove method: "+i);
        GameEntry tmp = board[i];
        for (int j=i;j<numEntries-1;j++){
            board[j] = board[j+1];

        }
        board[numEntries-1] = null;
        numEntries--;
        return tmp;
    }
    public String toString(){
        String out = "";
        for(int i =0;i<this.numEntries; out += board[i++].toString()+"\n");
        return out;
    }
    /***
     * returns array of all equal scores

     */
    public GameEntry[] equalScore(){


        int currentPosition =0;
        GameEntry[] temp = new GameEntry[numEntries]; //initially size the array as if every score is the same
        for (int i = 0; i < numEntries;i++){ //start scrolling from first game entry
            GameEntry current = board[i]; //copy value on
            for (int j=i+1;j<numEntries;j++){
                if (current.getScore() == board[j].getScore()) {
                    current = new GameEntry(board[j].getName()+" & " + current.getName(),current.getScore());
                    temp[currentPosition] = current;
                    currentPosition++;
                }
            }
        }

        GameEntry[] out = new GameEntry[currentPosition];
        for (int i = 0; i < currentPosition;out[i] = temp[i++]);
        return out;
    }

    public int size(){
        return numEntries;
    }




}
