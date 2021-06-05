package com.maxmcold.learning.list;

public class SinglyLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size =0;
    public SinglyLinkedList(){}

    public int getSize(){ return this.size;}
    public boolean isEmpty() {return size ==0;}

    public void addFirst(E e){
        head = new Node<>(e,head);
        if (size ==0)
            tail = head;
        size++;
    }
    public void addLast(E e){
        Node<E> newest = new Node<>(e,null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }
    public E removeFirst(){
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }
    public Node<E> getHead(){
        return head;
    }

    public Node<E> getNext(Node<E> current){

        if (isEmpty()) return null;
        if (current == null) return null;
        return current.getNext();

    }

}
