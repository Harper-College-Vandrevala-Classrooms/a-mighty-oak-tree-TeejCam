package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOakTree {

  OakTree tree;

  @BeforeEach
  void setUp() {
    tree = new OakTree();
  }

  @Test 
  void testGetLeft() {
    Squirrel cheeks = new Squirrel("cheeks");
    Node nodeOne = new Node(cheeks);

    Squirrel chip = new Squirrel("chip");
    Node nodeTwo = new Node(chip);

    nodeOne.insertLeft(nodeTwo);

    assertEquals(nodeOne.getLeft().getValue().getName(), "chip");
  }

  @Test 
  void testGetRight() {
    Squirrel cheeks = new Squirrel("cheeks");
    Node nodeOne = new Node(cheeks);

    Squirrel chip = new Squirrel("chip");
    Node nodeTwo = new Node(chip);

    nodeOne.insertRight(nodeTwo);

    assertEquals(nodeOne.getRight().getValue().getName(), "chip");

  }

  @Test 
  void testGenericLeft() {
    GenericNode<Integer> intNode = new GenericNode<>(13);
    intNode.insertLeft(new GenericNode<>(90));

    assertEquals(intNode.getLeft().getValue(), 90);
  }

  @Test 
  void testGenericRight() {
    GenericNode<Integer> intNode = new GenericNode<>(13);
    intNode.insertRight(new GenericNode<>(81));

    assertEquals(intNode.getRight().getValue(), 81);
  }
}
