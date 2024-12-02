package com.csc;

public class OakTree {

  Node root;

  OakTree(Squirrel data) {
    root = new Node(data);
  }

  OakTree() {
    root = null;
  }

  public static void main(String[] args) {
    System.out.println("Oak Tree!!!");

    Squirrel cheeks = new Squirrel("Cheeks");
    Node nodeOne = new Node(cheeks);

    Squirrel squeaks = new Squirrel("Squeaks");
    Node nodeTwo = new Node(squeaks);

    Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
    Node nodeThree = new Node(fluffybutt);

    nodeOne.insertLeft(nodeTwo);
    nodeOne.insertRight(nodeThree);

    Node retrievedLeft = nodeOne.getLeft(); // This should retrieve the left node
    Node retrievedRight = nodeOne.getRight(); // This should retrieve the right node

  }
}
