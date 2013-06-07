package dataStructure.linkedList;

public class LinkedListNode<E> {
	public E getValue() {
		return value;
	}
	public void setValue(E value) {
		this.value = value;
	}
	public LinkedListNode<E> getNext() {
		return next;
	}
	public void setNext(LinkedListNode<E> next) {
		this.next = next;
	}
	private E value;
	private LinkedListNode<E> next;
}
