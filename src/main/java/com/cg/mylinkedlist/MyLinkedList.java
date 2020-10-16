package com.cg.mylinkedlist;

public class MyLinkedList {
    Node head=null;

    public void addToStart(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            node.next=head;
            head=node;
        }
    }

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

