package gguro.collections;

import java.util.Deque;
import java.util.LinkedList;

import gguro.common.Testable;

public class DequeEx1 implements Testable{
	public void test() {
		String[] s = {"first", "second", "third"};
		
		Deque <String> deque = new LinkedList<String>();
		deque.offer(s[0]);
		deque.offer(s[1]);
		deque.offerLast(s[2]);
		
		System.out.println(deque.pollLast());
		System.out.println(deque.poll());
		System.out.println(deque.pollLast());
	}
}
