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
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public Node getNode(int index) {
        if (this.checkIfIndexIsOutOfBounds(index)) {
            Node currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }

            return currentNode;
        }

        return null;
    }

    public boolean checkIfIndexIsOutOfBounds(int index) {
        if (this.size < index) {
            throw new IndexOutOfBoundsException();
        }

        return true;
    }

    public boolean add(int index, int value) {
        //Check if index is out of bounds
        if (this.checkIfIndexIsOutOfBounds(index)) {
            // create new node
            Node newNode = new Node(value);

            if (index == 0 && this.head == null) {
                this.head = newNode;
            } else if (index == 1) {
                this.tail = newNode;
                this.head.setNext(newNode);
            } else {
                //Check if size is same as index or of tail is net set yet
                if (index == this.size || this.tail == null) {
                    this.tail = newNode;
                }
                //Get previous node and get the reference to next node
                Node previousNode = this.getNode(index - 1);
                Node nextNode = previousNode.getNext();

                //Put new node in refrence of previous node and set the next node refrence to the old next node
                previousNode.setNext(newNode);
                newNode.setNext(nextNode);
            }
            this.size++;

            return true;
        }

        return false;
    }

    public boolean remove(int index) {
        if (checkIfIndexIsOutOfBounds(index)) {
            if (index == 0) {
                this.head = this.head.getNext();
            } else {
                Node previousNode = this.getNode(index - 1);
                Node nextNode = previousNode.getNext().getNext();

                previousNode.setNext(nextNode);
            }

            this.size--;

            return true;
        }

        return false;
    }
}