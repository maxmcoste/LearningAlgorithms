package com.maxmcold.learning.list;

public class Node<E> {
    private E element;



    private Node<E> prev;
    private Node<E> next;

    public Node(E e, Node<E> n){
        element = e;
        next = n;

    }
    public Node(E e, Node<E> n, Node<E> p){
        element = e;
        next = n;
        prev = p;

    }
    public E getElement() { return element;}
    public Node<E> getNext() { return next;}
    public Node<E> getPrev() { return prev; }
    public void setNext(Node<E> n){ next = n;}
    public void setPrev(Node<E> p){ next = p;}


}
