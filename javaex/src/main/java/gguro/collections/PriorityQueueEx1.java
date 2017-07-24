package gguro.collections;

import java.util.PriorityQueue;

import gguro.common.Testable;

public class PriorityQueueEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(2);
		pq.add(3);
		pq.add(1);
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}

}
