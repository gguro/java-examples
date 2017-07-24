package gguro.collections;

import java.util.Arrays;
import java.util.List;

import gguro.common.Testable;

/**
 * List Sort example
 */

public class ListEx2 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		System.out.println("Sorting with natural order");
		List<String> l1 = createList();
		l1.sort(null);
		l1.forEach(System.out::println);
		
		System.out.println("Sorting with a lambda expresstion");
		List<String> l2 = createList();
		l2.sort((s1,s2) -> s1.compareToIgnoreCase(s2));
		l2.forEach(System.out::println);
		
		System.out.println("Sorting with a method references");
		List<String> l3 = createList();
		l3.sort(String::compareToIgnoreCase);
		l3.forEach(System.out::println);
		
	}
	
	private List<String> createList() {
		return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");
	}

}
