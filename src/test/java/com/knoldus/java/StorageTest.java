package com.knoldus.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class StorageTest {

    @Test
    public void testAddElement() {
        Storage storage = new Storage();
        storage.addElement("hello");
        assertTrue(storage.checkIfContains("hello"));
    }

    @Test
    public void testRemoveElement() {
        Storage storage = new Storage();
        storage.addElement("hello");
        storage.removeElement("hello");
        assertFalse(storage.checkIfContains("hello"));
    }

    @Test
    public void testRemoveAll() {
        Storage storage = new Storage();
        storage.addElement("hello");
        storage.addElement("world");
        storage.removeAll();
        assertFalse(storage.checkIfContains("hello"));
        assertFalse(storage.checkIfContains("world"));
    }

    @Test
    public void testCheckIfContains() {
        Storage storage = new Storage();
        storage.addElement(1);
        storage.addElement(2);
        assertTrue(storage.checkIfContains(1));
        assertTrue(storage.checkIfContains(2));
        assertFalse(storage.checkIfContains(3));
    }

}
