package gguro.collections;

import java.util.HashMap;
import java.util.Map;

import gguro.common.Testable;

public class MapEx3 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = createMap();
		
		Integer calculatedValue = map.computeIfAbsent("Java", it->0);
		System.out.println(calculatedValue);
		
		// write to command line
		map.keySet().forEach(key->System.out.println(key + " " + map.get(key)));
	}
	
	private static Map<String, Integer> createMap() {
		Map<String, Integer> map = new HashMap<> ();
		map.put("Eclipse IDE", 0);
		map.put("Eclipse RCP", 0);
		map.put("Git", 0);
		map.put("Groovy", 0);
		
		
		
		return map;
	}
}
