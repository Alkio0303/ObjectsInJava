package com.sirma.javacourse.objectsinjava.homogeneous_tree_test;
import static org.junit.Assert.*;

import com.sirma.javacourse.objectsinjava.homogeneous_tree.HomogeneousTree;
import org.junit.Test;

public class HomogeneousTreeTest {
    @Test
    public void testInsertAndSearch() {
        HomogeneousTree<Integer> tree = new HomogeneousTree<>();

        // Insert elements
        tree.insert(5, "Five");
        tree.insert(3, "Three");
        tree.insert(7, "Seven");
        tree.insert(2, "Two");
        tree.insert(4, "Four");

        // Test search for existing elements
        assertTrue(tree.search(5));
        assertTrue(tree.search(2));

        // Test search for non-existing elements
        assertFalse(tree.search(1));
        assertFalse(tree.search(6));
    }

    @Test
    public void testEmptyTree() {
        HomogeneousTree<Integer> tree = new HomogeneousTree<>();

        // Test searching in an empty tree
        assertFalse(tree.search(1));
    }

    @Test
    public void testLargeTree() {
        HomogeneousTree<Integer> tree = new HomogeneousTree<>();

        // Insert a large number of elements
        for (int i = 1; i <= 1000; i++) {
            tree.insert(i, "Item" + i);
        }

        // Test searching for elements
        assertTrue(tree.search(500));
        assertTrue(tree.search(1000));
        assertFalse(tree.search(1001));
    }

    @Test
    public void testNegativeValues() {
        HomogeneousTree<Integer> tree = new HomogeneousTree<>();

        // Insert negative values
        tree.insert(-5, "NegativeFive");
        tree.insert(-3, "NegativeThree");
        tree.insert(-7, "NegativeSeven");

        // Test searching for negative values
        assertTrue(tree.search(-5));
        assertTrue(tree.search(-3));
        assertTrue(tree.search(-7));
    }

    @Test
    public void testMixedDataTypes() {
        HomogeneousTree<String> tree = new HomogeneousTree<>();

        // Insert strings
        tree.insert("apple", "Apple");
        tree.insert("banana", "Banana");
        tree.insert("cherry", "Cherry");

        // Test searching for string elements
        assertTrue(tree.search("apple"));
        assertTrue(tree.search("banana"));
        assertFalse(tree.search("grape"));
    }

    @Test
    public void testSpecialCharacters() {
        HomogeneousTree<String> tree = new HomogeneousTree<>();

        // Insert strings with special characters
        tree.insert("@#$%", "Special1");
        tree.insert("12345", "Special2");
        tree.insert("!@#$", "Special3");

        // Test searching for elements with special characters
        assertTrue(tree.search("@#$%"));
        assertTrue(tree.search("!@#$"));
        assertFalse(tree.search("Special4"));
    }
}
