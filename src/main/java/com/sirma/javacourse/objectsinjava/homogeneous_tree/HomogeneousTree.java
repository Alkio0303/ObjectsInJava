package com.sirma.javacourse.objectsinjava.homogeneous_tree;

public class HomogeneousTree<T extends Comparable<T>> {
    private class TreeNode {
        T data;
        String name;
        TreeNode left;
        TreeNode right;

        TreeNode(T data, String name) {
            this.data = data;
            this.name = name;
            left = null;
            right = null;
        }
    }

    private TreeNode root;

    public void insert(T data, String name) {
        root = insertRec(root, data, name);
    }

    private TreeNode insertRec(TreeNode root, T data, String name) {
        if (root == null) {
            return new TreeNode(data, name);
        }

        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data, name);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data, name);
        }

        return root;
    }

    public void printSorted() {
        inorder(root);
    }

    private void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.data + " - " + node.name);
            inorder(node.right);
        }
    }

    public boolean search(T data) {
        return searchRec(root, data);
    }

    private boolean searchRec(TreeNode root, T data) {
        if (root == null) {
            return false;
        }

        if (data.compareTo(root.data) == 0) {
            return true;
        }

        if (data.compareTo(root.data) < 0) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }
}

