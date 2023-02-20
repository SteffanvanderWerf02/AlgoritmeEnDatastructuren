package com.nhlstenden.binarytree;

import java.util.Queue;

public class CustomBinarytree {
    protected Node root;

    public CustomBinarytree() {
        this.root = null;
    }

    public Node getRoot() {
        return this.root;
    }

    public Boolean hasLeft(Node n) {
        return n.getLeft() != null;
    }

    public Boolean hasRight(Node n) {
        return n.getRight() != null;
    }
    public int THeight(Node current) {
        if (current == null) {
            return 0;
        }
        return (this.THeight(current.getLeft()) + 1 + this.THeight(current.getRight()));
    }

    public void add(int data, Node current) {
        if (current == null) {
            this.root = new Node(data);

            return;
        }

        int rightSize = this.THeight(current.getRight());
        int LeftSize = this.THeight(current.getLeft());

        if (LeftSize <= rightSize) {
            if (this.hasLeft(current)) {
                this.add(data, current.getLeft());
            } else {
                current.setLeft(new Node(data));
            }
        } else {
            if (this.hasRight(current)) {
                this.add(data, current.getRight());
            } else {
                current.setRight(new Node(data));
            }
        }
    }


}