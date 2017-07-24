package gguro.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import gguro.common.Testable;

public class 	ListEx1 implements Testable {
	
	public void test() {
		// create a list using the 
		List<String> list = Arrays.asList("Lars", "Simon");
		
		// alternatively
		List<String> anotherList = new ArrayList<>();
		anotherList.add("Lars");
		anotherList.add("Simon");
		
		List<Integer> numList = Arrays.asList(3,2,1,4,5,6,6);
		
		list.forEach(System.out::println);
		anotherList.forEach(System.out::println);
		numList.forEach(System.out::println);
		
		System.out.println("removeIf(contains( \"i \" ))");
		anotherList.removeIf(s->s.toLowerCase().contains("i"));
		anotherList.forEach(System.out::println);
	}
	
}
