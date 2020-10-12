package com.blz.stackandqueue;

public class MyStack<E> {
	private MyNewLinkedList<E> myNewList;

	public MyStack() {
		this.myNewList = new MyNewLinkedList<E>();
	}

	// ADDING NEW NODE TO THE TOP OF STACK
	public void push(NewNodeInterface<E> newNode) {
		myNewList.add(newNode);
	}

	// RETURN TOP-MOST NODE OF STACK
	public NewNodeInterface<E> peek() {
		return myNewList.head;
	}

	//
	public NewNodeInterface<E> pop() {
		return myNewList.pop();
	}

	// CHECK IF STACK IS EMPTY
	public boolean isEmpty() {
		if (myNewList.size() == 0)
			return true;
		return false;
	}

	public void printStack() {
		myNewList.printNodes();
	}
}