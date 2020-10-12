package com.blz.stackandqueue;

public class MyNewLinkedList<E> {
	NewNodeInterface<E> head;
	NewNodeInterface<E> tail;

	public MyNewLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// ADDING NEW NODE IN THE FRONT IN LIST
	public void add(NewNodeInterface<E> newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			NewNodeInterface<E> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	// APPENDING NEW NODE IN THE LAST IN LIST
	public void append(NewNodeInterface<E> newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	// INSERTING NEW NODE AFTER A SPECIFIC NODE
	public void insert(NewNodeInterface<E> refNode, NewNodeInterface<E> newNode) {
		newNode.setNext(refNode.getNext());
		refNode.setNext(newNode);
	}

	// DELETING FIRST ELEMENT IN THIS LIST
	public NewNodeInterface<E> pop() {
		NewNodeInterface<E> tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode;
	}

	// DELETING LAST ELEMENT IN THIS LIST
	public NewNodeInterface<E> popLast() {
		NewNodeInterface<E> tempNode = this.head;
		while (!tempNode.getNext().equals(this.tail))
			tempNode = tempNode.getNext();
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		this.tail.setNext(null);
		return tempNode;
	}

	// SEARCHING FOR A NODE USING ITS DATA VALUE
	public NewNodeInterface<E> search(E data) {
		NewNodeInterface<E> tempNode = this.head;
		while (tempNode.getNext() != null && tempNode != null) {
			if (tempNode.getData().equals(data))
				return tempNode;
			else
				tempNode = tempNode.getNext();
		}
		return null;
	}

	// DELETING SPECIFIED NODE USING SEARCH-METHOD ABOVE
	public NewNodeInterface<E> delete(E data) {
		NewNodeInterface<E> tempNode = this.head;
		if (search(data) == null)
			return search(data);
		if (search(data).equals(this.head))
			return pop();
		if (search(data).equals(this.tail))
			return popLast();
		else {
			while (!tempNode.getNext().equals(search(data))) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(search(data).getNext());
		}
		return search(data);
	}

	// GET CURRENT SIZE OF THIS LIST
	public int size() {
		NewNodeInterface<E> tempNode = this.head;
		int value = 0;
		if (tempNode != null)
			while (!tempNode.equals(this.tail)) {
				++value;
				tempNode = tempNode.getNext();
			}
		else
			return 0;
		return ++value;
	}

	public void printNodes() {
		StringBuffer allNodes = new StringBuffer();
		NewNodeInterface<E> tempNode = this.head;
		while (tempNode.getNext() != null) {
			allNodes.append(tempNode.getData());
			if (!tempNode.equals(tail))
				allNodes.append("->");
			tempNode = tempNode.getNext();
		}
		allNodes.append(tempNode.getData());
		System.out.println("Displaying all my nodes:  " + allNodes);
	}
}