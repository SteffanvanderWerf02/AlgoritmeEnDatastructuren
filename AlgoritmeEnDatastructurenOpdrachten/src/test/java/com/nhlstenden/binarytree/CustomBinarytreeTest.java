package com.nhlstenden.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomBinarytreeTest {

    CustomBinarytree binarytree;
    CustomBinarySearchTree searchTree;
    @BeforeEach
    void setUp() {
        binarytree = new CustomBinarytree();
        searchTree = new CustomBinarySearchTree();

    }

    @Test
    void addBinary() {
        binarytree.add(5, binarytree.getRoot());
        binarytree.add(50,binarytree.getRoot());
        binarytree.add(51,binarytree.getRoot());
        binarytree.add(53,binarytree.getRoot());
        binarytree.add(54,binarytree.getRoot());
        binarytree.add(55,binarytree.getRoot());
        binarytree.add(56,binarytree.getRoot());
    }

    @Test
    void addSearchBinary() {
        searchTree.add(5, searchTree.getRoot());
        searchTree.add(50,searchTree.getRoot());
        searchTree.add(51,searchTree.getRoot());
        searchTree.add(53,searchTree.getRoot());
        searchTree.add(54,searchTree.getRoot());
        searchTree.add(55,searchTree.getRoot());
        searchTree.add(56,searchTree.getRoot());
        searchTree.add(26,searchTree.getRoot());
        searchTree.add(2,searchTree.getRoot());
    }

}