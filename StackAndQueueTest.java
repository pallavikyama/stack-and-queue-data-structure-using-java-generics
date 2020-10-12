package com.blz.stackandqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackAndQueueTest {

	@Test
	public void stackTestUC1() {
		System.out.println("\nUC-01:");
		MyStack<Integer> myStack = new MyStack<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		myStack.push(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		myStack.push(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		myStack.push(thirdNode);
		myStack.printStack();
		assertEquals(myStack.peek(), thirdNode);
	}
} 