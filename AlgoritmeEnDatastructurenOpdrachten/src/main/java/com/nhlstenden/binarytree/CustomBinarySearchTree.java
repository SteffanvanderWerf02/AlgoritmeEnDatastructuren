package com.nhlstenden.binarytree;

public class CustomBinarySearchTree extends CustomBinarytree {
    public CustomBinarySearchTree() {
        super();
    }

    @Override
    public void add(int data, Node current) {
        if (current == null) {
            this.root = new Node(data);
            return;
        }

        if (data < current.getData()) {
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