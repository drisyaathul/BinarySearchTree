package com.binarysearchtree;

public class BinaryNode <T extends Comparable <T>>{

    T data;
    BinaryNode<T> nextL;
    BinaryNode<T> nextR;

    public BinaryNode(T data) {
        this.data = data;
    }
}
