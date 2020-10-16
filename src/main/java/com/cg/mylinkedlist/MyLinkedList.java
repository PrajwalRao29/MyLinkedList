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
    public void addToEnd(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public void pop()
    {
        head=head.next;
    }
    public void popLast()
    {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;

    }
    public void addAfter(int prev,int data)
    {
        Node n=new Node(data);
        Node temp=head;
        while(temp.data!=prev)
        {
            if(temp.next==null)
            {
                System.out.println("Previous value not found");
                return;
            }
            temp=temp.next;
        }
        Node n1=temp.next;
        temp.next=n;
        n.next=n1;
    }
    public void print()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" -> ");
            n=n.next;
        }
        System.out.println();
    }
}

