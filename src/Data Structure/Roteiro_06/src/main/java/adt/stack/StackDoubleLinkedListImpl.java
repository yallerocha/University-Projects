package adt.stack;

import adt.linkedList.DoubleLinkedList;
import adt.linkedList.DoubleLinkedListImpl;
import adt.linkedList.DoubleLinkedListNode;

public class StackDoubleLinkedListImpl<T> implements Stack<T> {

	protected DoubleLinkedList<T> top;
	protected int size;
	protected int nowSize;

	protected DoubleLinkedListImpl<T> linkedList = new DoubleLinkedListImpl<T>();

	public StackDoubleLinkedListImpl(int size) {
		this.size = size;
		this.top = new DoubleLinkedListImpl<T>();
	}

	@Override
	public void push(T element) throws StackOverflowException {
		if(nowSize < size) {
		linkedList.insert(element);
		nowSize++;
		} else {
			throw new StackOverflowException();
		}
	}

	@Override
	public T pop() throws StackUnderflowException {
		if(nowSize > 0) {
			DoubleLinkedListNode<T> valor = linkedList.getLast();
			linkedList.removeLast();
			nowSize--;
			return valor.getData();
		} else {
			throw new StackUnderflowException();
		}
	}

	@Override
	public T top() {
		DoubleLinkedListNode<T> valor = linkedList.getLast();
		return valor.getData();
	}

	@Override
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

	@Override
	public boolean isFull() {
		return nowSize == size;
	}
}
