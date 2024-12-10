package com.csc;

public class GenericNode<T>
{
    GenericNode<T> left, right;
    T data;

    public GenericNode(T data)
    {
        this.data = data;
        left = right = null;
    }

    public T getValue()
    {
        return this.data;
    }

    public void insertLeft(GenericNode<T> leftNode)
    {
        this.left = leftNode;
    }

    public void insertRight(GenericNode<T> rightNode)
    {
        this.right = rightNode;
    }

    public GenericNode<T> getLeft()
    {
        return this.left;
    }

    public GenericNode<T> getRight()
    {
        return this.right;
    }
}