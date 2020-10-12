package com.blz.stackandqueue;

public class MyQueue<E> {
	private MyNewLinkedList<E> myNewList2;

	public MyQueue() {
		this.myNewList2 = new MyNewLinkedList<E>();
	}

	// APPENDING NEW NODE TO QUEUE
	public void enqueue(NewNodeInterface<E> newNode) {
		myNewList2.append(newNode);
	}

	// RETURN FIRST NODE OF QUEUE
	public NewNodeInterface<E> front() {
		return myNewList2.head;
	}

	// RETURN LAST NODE OF QUEUE
	public NewNodeInterface<E> rear() {
		return myNewList2.tail;
	}

	public void printQueue() {
		myNewList2.printNodes();
	}
}