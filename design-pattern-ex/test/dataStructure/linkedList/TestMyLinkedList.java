package dataStructure.linkedList;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class TestMyLinkedList {


	@Test
	public void testAddFirst() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		for (int i=5; i>=0; i--){
			list.addFirst(i);
		}
		for (int i=0; i<=5; i++){
			assertEquals(list.get(i).intValue(),i);
		}
	}

	@Test
	public void testAddLast() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		for (int i=0; i<=5; i++){
			list.addLast(i);
		}
		for (int i=0; i<=5; i++){
			assertEquals(list.get(i).intValue(),i);
		}
	}

	private MyLinkedList<Integer> createList(){
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		for (int i=0; i<=5; i++){
			list.addLast(i);
		}
		return list;
	}
	
	@Test
	public void testGetFirst() {
		MyLinkedList<Integer> list = createList();
		assertEquals(list.getFirst().intValue(),0);
	}

	@Test
	public void testGetLast() {
		MyLinkedList<Integer> list = createList();
		assertEquals(list.getLast().intValue(),5);
	}

	@Test
	public void testRemoveFirst() {
		MyLinkedList<Integer> list = createList();
		int value = list.removeFirst();
		assertEquals(value, 0);
		assertEquals(list.size(),5);
		for (int i=1; i<=5; i++){
			assertEquals(list.get(i-1).intValue(),i);
		}
	}

	@Test
	public void testRemoveLast() {
		MyLinkedList<Integer> list = createList();
		int value = list.removeLast();
		assertEquals(value, 5);
		assertEquals(list.size(),5);
		for (int i=0; i<=4; i++){
			assertEquals(list.get(i).intValue(),i);
		}
	}

	@Test
	public void testClear() {
		MyLinkedList<Integer> list = createList();
		list.clear();
		assertEquals(list.size(),0);
		try{
			list.getFirst();
		}catch(NoSuchElementException e){
			assertTrue(true);
			return;
		}
		fail("No exception");
		
	}

	@Test
	public void testRemove() throws Exception {
		MyLinkedList<Integer> list = createList();
		list.remove(5);
		assertEquals(list.size(), 5);
		list.remove(1);
		list.remove(2);
		list.remove(0);
		assertEquals(list.getFirst().intValue(),3);
	}
	
	private MyLinkedList<Integer> createOneList(){
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.addFirst(1);
		return list;
	}
	
	@Test
	public void testOneElementRemoveFirst() throws Exception {
		MyLinkedList<Integer> list = createOneList();
		int value = list.removeFirst();
		assertEquals(value,1);
		assertNull(list.getFirst());
	}

}
