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
	
	@Test
	public void queueTestUC3() {
		System.out.println("\nUC-03:");
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myQueue.enqueue(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		myQueue.enqueue(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		myQueue.enqueue(thirdNode);
		myQueue.printQueue();
		assertEquals(myQueue.front(), firstNode);
		assertEquals(myQueue.rear(), thirdNode);
	}
	
	@Test
	public void queueTestUC4() {
		System.out.println("\nUC-04:");
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myQueue.enqueue(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		myQueue.enqueue(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		myQueue.enqueue(thirdNode);
		assertEquals(myQueue.front(), firstNode);
		assertEquals(myQueue.rear(), thirdNode);
		while (!myQueue.isEmpty()) {
			myQueue.printQueue();
			System.out.println("Front node is " + myQueue.front().getData() + ".");
			System.out.println("Rear node is " + myQueue.rear().getData() + ".");
			NewNodeInterface<Integer> dequeueValue = myQueue.dequeue();
			System.out.println("Dequeueing " + dequeueValue.getData() + ".");
		}
		assertEquals(myQueue.isEmpty(), true);
	}
} 