package com.maxmcold.learning;
import com.maxmcold.learning.array.GameEntry;
import com.maxmcold.learning.array.MeetGame;
import com.maxmcold.learning.array.Scoreboard;
import com.maxmcold.learning.list.CircularlyLinkedList;
import com.maxmcold.learning.list.Node;
import com.maxmcold.learning.list.SinglyLinkedList;

public class Main {

    public static void main(String args[]){
        list(args);
        //array(args);


    }
    private static void list(String[] args){
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        sll.addFirst("A");
        sll.addFirst("B");
        sll.addFirst("C");
        sll.addFirst("D");
        sll.addFirst("E");
        sll.addFirst("F");
        sll.addLast("Chiudi");
        sll.addFirst("Apri");

        int i = sll.getSize();
        Node<String> current = sll.getHead();
        while (current != null){

            Logger.log(current.getElement());
            current = current.getNext();


        }
        Logger.log("head: " + sll.getHead().getElement()+"\n");
        Logger.log("next from head: " + sll.getHead().getNext().getElement()+"\n");


        CircularlyLinkedList<String> cll = new CircularlyLinkedList<>();

        cll.addFirst("Ciccio");
        cll.addFirst("Bacicchio");
        cll.addFirst("Luricchio");

        int k = 0;

        Node<String> cursor = cll.getTail();

        while (cursor != null && k++ <30){

            Logger.log(cursor.getElement()+"\n");
            cursor = cursor.getNext();
        }
        if (k>=30)
            Logger.log("reached max loop count: "+k+"\n");

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

        MeetGame mg = new MeetGame(sb);
        mg.run();
        Logger.log("MeetGame:\n"+sb.toString());



    }
}
