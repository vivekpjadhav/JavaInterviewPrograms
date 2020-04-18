package com.company.algo.collections;

public class MyLinkQue {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    public MyLinkQue() {
        this.head = this.tail = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;


    }

    public Node dequeue() {
        if (head == null)
            return null;

        Node temp = head;
        head = head.next;

        return temp;
    }

    public static void main(String[] args) {
        MyLinkQue q = new MyLinkQue();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue().data);
        System.out.println(q.dequeue().data);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.dequeue().data);
        System.out.println("Queue Front : " + q.head.data);
        System.out.println("Queue Rear : " + q.tail.data);
    }
}
