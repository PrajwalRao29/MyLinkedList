package com.cg.mylinkedlist;

public class MyLinkedList {
    Node head=null;

    public boolean search(int data)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                System.out.println("Search Successful");
                return true;
            }
            temp=temp.next;
        }
        System.out.println("Search Not Successful");
        return false;
    }
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
    public boolean addAfter(int prev,int data) {
        if(!search(prev)) {
            return false;
        }
        Node n=new Node(data);
        Node temp=head;
        while(temp.data!=prev)
        {
            if(temp.next==null)
            {
                System.out.println("Previous value not found");
                return false;
            }
            temp=temp.next;
        }
        Node n1=temp.next;
        temp.next=n;
        n.next=n1;
        return true;
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

