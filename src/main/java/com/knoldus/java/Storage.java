package com.knoldus.java;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private final List<Object> elements = new ArrayList<>();

    /**
     * Adds the given element to the storage.
     */
    public void addElement(Object element) {
        elements.add(element);
    }

    /**
     * Removes the given element from the storage, if it exists.
     * Throws IllegalArgumentException if the element is not found in the storage.
     */
    public void removeElement(Object element) throws IllegalArgumentException {
        if (!elements.contains(element)) {
            throw new IllegalArgumentException("Element not found in storage.");
        }
        elements.remove(element);
    }

    /**
     * Removes all the elements from the storage.
     */
    public void removeAll() {
        elements.clear();
    }

    /**
     * Returns true if the storage contains the given element, false otherwise.
     */
    public boolean checkIfContains(Object element) {
        return elements.contains(element);
    }
}
