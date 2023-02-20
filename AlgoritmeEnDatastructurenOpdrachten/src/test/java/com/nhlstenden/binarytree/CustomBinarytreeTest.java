package com.nhlstenden.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomBinarytreeTest {

    CustomBinarytree tree;
    @BeforeEach
    void setUp() {
        tree = new CustomBinarytree();

    }

    @Test
    void addWhile() {
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(1);
        tree.add(4);
    }
    @Test
    void addReq() {
        tree.add(5, tree.getHead());
        tree.add(23,tree.getHead());
        tree.add(2321,tree.getHead());
        tree.add(24323,tree.getHead());
        tree.add(34,tree.getHead());
    }
}