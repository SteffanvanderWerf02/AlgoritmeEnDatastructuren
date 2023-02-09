package com.nhlstenden.customlinkedList;


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
            Node currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }

            return currentNode;
    }
    public boolean checkIfIndexIsOutOfBounds(int index) {
        if (this.head != null || this.size == 0) {
            if (index >= 0 && index <= this.size) {
                return true;
            }
            return false;

        }

        return false;
    }

    public boolean add(int index, int value) {
        //Check if index is out of bounds
        if (this.checkIfIndexIsOutOfBounds(index)) {
            // create new node
            Node newNode = new Node(value);

            if (index == 0 && this.size == 0) {
                this.head = newNode;
            }else if (index == 0 && this.size > 0) {
                if (this.size == 1) {
                    this.tail = this.head;
                }
                newNode.setNext(this.head);
                this.head = newNode;
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
                this.size--;
            } else {
                if (index == this.size) {
                    return false;
                } else {

                Node previousNode = this.getNode(index - 1);
                Node nextNode = previousNode.getNext().getNext();

                previousNode.setNext(nextNode);
                this.tail = previousNode;
                    this.size--;
                }
            }



            return true;
        }

        return false;
    }
    // selfmade method to print the list
    public void printListValuesToString() {

        String printString = "[";

        for (int i = 0; i < this.size; i++) {
            Node currentNode = this.getNode(i);

            if (i == this.size - 1) {
                printString += Integer.toString(currentNode.getValue());
            } else
            printString += Integer.toString(currentNode.getValue()) + ", ";
        }

        printString += "]";

        System.out.println(printString);
    }

    public void addValueToTail(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        }else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }

        this.size++;
    }
}