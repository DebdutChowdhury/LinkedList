package com.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void given3NumbersAddedTOtheTop() {
        MyNode<Integer> mysndNode = new MyNode<>(30);
        MyNode<Integer> myfstNode = new MyNode<>(70);
        MyNode<Integer> mythrdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myfstNode);
        myLinkedList.add(mysndNode);
        myLinkedList.add(mythrdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(mythrdNode) && myLinkedList.head.getNext().equals(mysndNode) && myLinkedList.tail.equals(myfstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3number_WhenAppend_ShouldbeAddedToLast() {
        MyNode<Integer> mysndNode = new MyNode<>(30);
        MyNode<Integer> mythrdNode = new MyNode<>(70);
        MyNode<Integer> myfstNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myfstNode);
        myLinkedList.append(mysndNode);
        myLinkedList.append(mythrdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myfstNode) && myLinkedList.head.getNext().equals(mysndNode) &&
                            myLinkedList.tail.equals(mythrdNode);
        Assert.assertTrue(result);

    }

    @Test
    public void given3NumberInsertbetweentwo_ShouldpassResult() {
        MyNode<Integer> mysndNode = new MyNode<>(30);
        MyNode<Integer> mythrdNode = new MyNode<>(70);
        MyNode<Integer> myfstNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myfstNode);
        myLinkedList.append(mythrdNode);
        myLinkedList.insert(myfstNode, mysndNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myfstNode) && myLinkedList.head.getNext().equals(mysndNode) &&
                        myLinkedList.tail.equals(mythrdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Number_shouldDeleteFirstElement() {
        MyNode<Integer> myfstNode = new MyNode<>(70);
        MyNode<Integer> mysndNode = new MyNode<>(30);
        MyNode<Integer> mythrdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myfstNode);
        myLinkedList.add(mysndNode);
        myLinkedList.add(mythrdNode);
        myLinkedList.pop();
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(mysndNode)&&
                myLinkedList.tail.equals(myfstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3number_ShouldDeleteLastElement() {
        MyNode<Integer> myfstNode = new MyNode<>(70);
        MyNode<Integer> mysndNode = new MyNode<>(30);
        MyNode<Integer> mythrdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myfstNode);
        myLinkedList.add(mysndNode);
        myLinkedList.add(mythrdNode);
        myLinkedList.popLast();
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(mythrdNode)&&
                myLinkedList.tail.equals(mysndNode);
        Assert.assertTrue(result);
    }
}
