package com.blz.stackandqueue;

public interface NewNodeInterface<E> {
	E getData();

	void setData(E data);

	NewNodeInterface<E> getNext();

	void setNext(NewNodeInterface<E> next);
}

class MyNode<E> implements NewNodeInterface<E> {
	private E data;
	private NewNodeInterface<E> next;

	public MyNode(E data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public E getData() {
		return data;
	}

	@Override
	public void setData(E data) {
		this.data = data;
	}

	@Override
	public NewNodeInterface<E> getNext() {
		return next;
	}

	@Override
	public void setNext(NewNodeInterface<E> next) {
		this.next = next;
	}
}