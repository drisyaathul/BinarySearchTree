package com.binarysearchtree;

public class BinaryTreeMain {
    public static void main(String[] args) {

        BinaryTree <Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);

        binaryTree.display(binaryTree.root);
        System.out.println("\n-------------------------------------------");

        BinaryTree <Integer> binaryTree1 = new BinaryTree<>();
        binaryTree1.add(56);
        binaryTree1.add(30);
        binaryTree1.add(70);
        binaryTree1.add(22);
        binaryTree1.add(40);
        binaryTree1.add(60);
        binaryTree1.add(95);
        binaryTree1.add(11);
        binaryTree1.add(65);
        binaryTree1.add(3);
        binaryTree1.add(16);
        binaryTree1.add(63);
        binaryTree1.add(67);

        binaryTree.display(binaryTree1.root);

    }
}
