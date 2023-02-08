package com.nhlstenden.customlinkedList;
import java.util.LinkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;


    public CustomLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public int size() {
        return this.size;
    }

    //Getters for head & tail
    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }

    public Node getNode(int index) {
        Node currentNode = this.head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    public void add(int index, int value) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }

        Node newNode = new Node(value);

        if (index == 0) {
            newNode.setNext(this.head);
            this.head = newNode;
        } else if (index == this.size) {
            this.tail = newNode;
            this.tail.setNext(newNode);
        } else {
            Node previousNode = this.getNode(index - 1);
            Node nextNode = previousNode.getNext();

            previousNode.setNext(newNode);
            newNode.setNext(nextNode);
        }

        this.size++;
    }
    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            this.head = this.head.getNext();
        } else {
            Node previousNode = this.getNode(index - 1);
            Node nextNode = previousNode.getNext().getNext();

            previousNode.setNext(nextNode);
        }

        this.size--;
    }
}