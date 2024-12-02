package com.csc;

public class Node {
    Node left, right;
    Squirrel data;

    public Node (Squirrel data) {
        this.data = data;
        left = right = null;
    }

    public Squirrel getValue() {
        return this.data;
    }

    public void insertLeft(Node leftNode) {
        this.left = leftNode;
    }

    public void insertRight(Node rightNode) {
        this.right = rightNode;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }
}