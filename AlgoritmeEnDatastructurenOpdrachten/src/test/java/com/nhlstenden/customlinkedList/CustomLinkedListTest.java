package com.nhlstenden.customlinkedList;

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
        list.add(0, 300);

        assertEquals(300, list.getHead().getValue());

        list.add(1, 256);
        assertEquals(2, list.size());
        assertEquals(2, list.getTail().getValue());

        list.add(2, 156);
        assertEquals(3, list.size());
        assertEquals(1, list.getTail().getValue());
        assertEquals(2, list.getNode(1).getValue());

    }

    @Test
    void size() {
    }

    @Test
    void remove() {
    }


}