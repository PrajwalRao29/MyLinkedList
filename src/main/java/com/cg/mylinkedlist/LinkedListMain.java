package com.cg.mylinkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        //add to the beginning
        MyLinkedList l=new MyLinkedList();
        l.addToStart(70);
        l.addToStart(30);
        l.addToStart(56);
        l.print();
    }
}
