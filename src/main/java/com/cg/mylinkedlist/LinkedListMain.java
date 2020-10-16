package com.cg.mylinkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        //add to the beginning
       MyLinkedList l = new MyLinkedList();
        l.addToStart(70);
        l.addToStart(30);
        l.addToStart(56);
        l.print();
        //add to the end
        MyLinkedList l1 = new MyLinkedList();
        l1.addToEnd(56);
        l1.addToEnd(30);
        l1.addToEnd(70);
        l1.print();
        //add in between
        MyLinkedList l2 = new MyLinkedList();
        l2.addToEnd(56);
        l2.addToEnd(70);
        l2.addAfter(56, 30);
        l2.print();
        //pop
        l.pop();
        l.print();
        //popLast
        l1.popLast();
        l1.print();
        //addAfterElement
        l2.addAfter(30,40);
        l2.print();
        //delete
        l2.delete(40);
        l2.print();
        //OrderedList
        System.out.println("Sort and add");
        MyLinkedList l3=new MyLinkedList();
        l3.addSort(56);
        l3.addSort(30);
        l3.addSort(40);
        l3.addSort(70);
        l3.print();
    }
}
