package com.bridgelabz.bst;

import jdk.jfr.StackTrace;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3NumbersWhenAddedToBSTShouldReturnSize3(){
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(70);
        myBinaryTree.add(30);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(3, size);
    }
}
