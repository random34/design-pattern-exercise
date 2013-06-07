package dataStructure.linkedList;
import java.util.NoSuchElementException;

public class MyLinkedList<E> {
	
	private int size;
	private LinkedListNode<E> head = null;
	private LinkedListNode<E> tail = head;
	
	public E get(int index){
		if (index>=size){
			throw new NoSuchElementException();
		}
		LinkedListNode<E> node = head;
		for (int i=0; i<index; i++){
			node = node.getNext();
		}
		return node.getValue();
	}
	
	public void addFirst(E obj){
		LinkedListNode<E> newElement = new LinkedListNode<E>();
		newElement.setValue(obj);
		newElement.setNext(head);
		head = newElement;
		size++;
	}
	
	public void addLast(E obj){
		LinkedListNode<E> newElement = new LinkedListNode<E>();
		newElement.setValue(obj);
		newElement.setNext(null);
		if (size==0){
			head = newElement;
			tail = newElement;
		}else {
			tail.setNext(newElement);
			tail = newElement;
		}
		size++;
	}
	
	public E getFirst(){
		if (size==0){
			throw new NoSuchElementException();
		}
		return head.getValue(); 
	}
	
	public E getLast(){
		if (size==0){
			throw new NoSuchElementException();
		}
		return tail.getValue(); 
	}
	
	public E removeFirst(){
		if (size==0){
			throw new NoSuchElementException();
		}
		LinkedListNode<E> node = head;
		head = head.getNext();
		size--;
		return node.getValue();
	}
	
	public E removeLast(){
		if (size==0){
			throw new NoSuchElementException();
		}else if (size==1){
			E value = head.getValue();
			size--;
			head = null;
			tail = null;
			return value;
		}
		LinkedListNode<E> node = head;
		for (int i=0; i<size-1; i++){
			node = node.getNext();
		}
		tail = node;
		size--;
		return node.getValue();
	}
	
	public E remove(E obj){
		
		if (size==0){
			return null;
		}
		
		if (head.getValue().equals(obj)){
			return removeFirst();
		}
		
		LinkedListNode<E> node = head;
		LinkedListNode<E> removedNode = null;
		for (int i=0; i<size; i++){
			if (node.getNext().getValue().equals(obj)){
				removedNode = node.getNext();
				node.setNext(removedNode.getNext());
				removedNode.setNext(null);
				break;
			}
			node = node.getNext();
		}
		size--;
		return removedNode==null ? null : removedNode.getValue();
	}
	
	public void clear(){
		int originalSize = size;
		for (int i=0; i<originalSize; i++){
			removeFirst();
		}
		tail = head;
	}
	
	public int size(){
		return size;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		LinkedListNode<E> node = head;
		for (int i=0; i<size; i++){
			if (i!=0)
				sb.append(",");
			sb.append(node.getValue().toString());
			node = node.getNext();
		}
		sb.append("]");
		return new String(sb);
	}
	
}
