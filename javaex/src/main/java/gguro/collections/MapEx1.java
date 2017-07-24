package gguro.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gguro.common.Testable;

public class MapEx1 implements Testable {
	
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		fillData(map);
		
		map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));
		
		System.out.println(">> add iPhone");
		map.put("iPhone", "Created by Apple");
		System.out.println(">> remove Android");
		map.remove("Android");
		
		map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));
		
		// convert keys to array
		System.out.println(">> convert Map to []");
		String[] strings = keysAsArray(map);
		for (String string : strings)  {
			System.out.println(string);
			
		}
		
		// convert keys to list
		System.out.println(">> convert Map to List");
		List<String> list = keysAsList(map);
		for (String string : list) {
			System.out.println(string);
		}
		
	}
	
	private void fillData(Map<String, String> map) {
		map.put("Android", "Mobile");
		map.put("Eclipse IDE", "Java");
		map.put("Eclipse RCP", "Java");
		map.put("Git", "Version control system");
	}
	
	private String[] keysAsArray(Map<String, String> map) {
		return map.keySet().toArray(new String[map.keySet().size()]);
	}
	
	private List<String> keysAsList(Map<String, String> map) {
		List<String> list = new ArrayList<String>(map.keySet());
		return list;
	}
}
