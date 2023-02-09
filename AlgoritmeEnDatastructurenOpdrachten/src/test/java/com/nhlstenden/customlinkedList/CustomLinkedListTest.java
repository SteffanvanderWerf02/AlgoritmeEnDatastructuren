package com.nhlstenden.customlinkedList;
import com.nhlstenden.customlinkedList.exeptions.IndexIsOutOfBounds;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomLinkedListTest {
    private CustomLinkedList list;
    @BeforeEach
    void setUp() {
        list = new CustomLinkedList();
    }
    @Test
    void add() {
        // add node to list
        list.add(0, 300);

        //check if head is set and right node
        assertEquals(300, list.getHead().getValue());

        //Add new node to list
        list.add(1, 256);

        //Check if the size is 2
        assertEquals(2, list.size());

        //Check if index one is the newley add node
        assertEquals(256, list.getNode(1).getValue());

        //Add new node to list
        list.add(2, 156);

        //Check if the tail is the new node and if the link are made
        assertEquals(list.getNode(1).getNext(), list.getNode(2));
        assertEquals(156, list.getNode(2).getValue());
        assertEquals(156, list.getTail().getValue());

        //Add new node on filled position
        list.add(2, 15600);

        //Check if the node is set between the existing nodes and the next fields are filled
        assertEquals(15600, list.getNode(2).getValue());
        assertEquals(156, list.getNode(3).getValue());

    }

    @Test
    void size() {
        list.add(0, 300);
        assertEquals(1, list.size());
        list.add(0, 300);
        list.add(0, 300);
        assertEquals(3, list.size());
    }

    @Test
    void remove() {
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);

        list.remove(3);
    }


}