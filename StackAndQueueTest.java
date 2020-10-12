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
	
	@Test
	public void stackTestUC2() {
		System.out.println("\nUC-02:");
		MyStack<Integer> myStack = new MyStack<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		myStack.push(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		myStack.push(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		myStack.push(thirdNode);
		assertEquals(myStack.peek(), thirdNode);
		while (!myStack.isEmpty()) {
			myStack.printStack();
			System.out.println("Peeking:Top node is " + myStack.peek().getData() + ".");
			NewNodeInterface<Integer> popValue = myStack.pop();
			System.out.println("Popping out " + popValue.getData() + ".");
		}
		assertEquals(myStack.isEmpty(), true);
	}
} 