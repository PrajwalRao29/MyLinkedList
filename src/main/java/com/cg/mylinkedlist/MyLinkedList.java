package com.cg.mylinkedlist;

public class MyLinkedList {
    Node head=null;

    public void print()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" -> ");
            n=n.next;
        }
    }
}

