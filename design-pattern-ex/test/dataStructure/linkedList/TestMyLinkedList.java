package dataStructure.linkedList;

import static org.junit.Assert.*;

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

	@Test
	public void testGetFirst() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLast() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveFirst() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveLast() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

}
