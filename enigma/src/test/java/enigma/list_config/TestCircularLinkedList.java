package enigma.list_config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import enigma.list_config.*;

public class TestCircularLinkedList {

    @Test
	public void test01EmptyTrue()
	{
		CircularLinkedList l = new CircularLinkedList();
		Assertions.assertTrue(l.isEmpty());
	}

	@Test
	public void testEmptyFalse()
	{
		CircularLinkedList l = new CircularLinkedList();
		l.addFirst('A');
		Assertions.assertTrue(!l.isEmpty());
	}

	@Test
	public void test02AddFirst()
	{
		CircularLinkedList l = new CircularLinkedList();
		char[] list_expected = {'A', 'B', 'C'};
		for (char i: list_expected ) {
			l.addFirst(i);
		}

		CircularListNode node = l.getTail();
		int size = l.size();
		if(size != 3) {
			Assertions.fail();
		}
		for (int expected: list_expected  ) {
			int actual = node.getLetter();
			Assertions.assertEquals(expected, actual);
			node = node.getPrevious();
		}      
	}

	@Test
	public void test03AddLast()
	{
		CircularLinkedList l = new CircularLinkedList();
		char[] list_expected = {'A', 'B', 'C'};
		for (char i: list_expected ) {
			l.addLast(i);
		}

		char[] list_expected_reversed = {'C', 'B', 'A'};
		int size = l.size();
		if(size != 3) {
			Assertions.fail();
		}
		CircularListNode node = l.getTail();
		for (char expected: list_expected_reversed  ) {
			char actual = node.getLetter();
			Assertions.assertEquals(expected, actual);
			node = node.getPrevious();
		}       
	}

}