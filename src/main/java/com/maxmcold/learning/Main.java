package com.maxmcold.learning;
import com.maxmcold.learning.array.GameEntry;
import com.maxmcold.learning.array.MeetGame;
import com.maxmcold.learning.array.Scoreboard;
import com.maxmcold.learning.list.Node;
import com.maxmcold.learning.list.SinglyLinkedList;

public class Main {

    public static void main(String args[]){
        //list(args);
        array(args);


    }
    private static void list(String[] args){
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        sll.addFirst("A");
        sll.addFirst("B");
        sll.addFirst("C");
        sll.addFirst("D");
        sll.addFirst("E");
        sll.addFirst("F");
        int i = sll.getSize();
        Node<String> current = sll.getHead();
        while (i-->0){

            System.out.println(current.getElement());
            current = current.getNext();


        }
    }

    private static void array(String[] args){
        Scoreboard sb = new Scoreboard(8);
        GameEntry ge1 = new GameEntry("Massimo",0);
        GameEntry ge2 = new GameEntry("Pino",0);
        GameEntry ge3 = new GameEntry("Gino",0);
        GameEntry ge4 = new GameEntry("Bacicchio",0);
        GameEntry ge5 = new GameEntry("Luricchio",0);
        GameEntry ge6 = new GameEntry("Ciccio",0);
        GameEntry ge7 = new GameEntry("Badello",0);
        GameEntry ge8 = new GameEntry("Polutto",0);

        sb.add(ge1);
        sb.add(ge2);
        sb.add(ge3);
        sb.add(ge4);
        sb.add(ge5);
        sb.add(ge6);
        sb.add(ge7);
        sb.add(ge8);

        Logger.log(sb.toString());
        /*
        GameEntry[] ge = sb.equalScore();
        for(int i =0;i<ge.length;System.out.println(ge[i++]));
        //System.out.println(sb.equalScore().toString());
        System.out.println(sb.toString());
        */
        MeetGame mg = new MeetGame(sb);
        mg.run();
        Logger.log("MeetGame:\n"+sb.toString());



    }
}
