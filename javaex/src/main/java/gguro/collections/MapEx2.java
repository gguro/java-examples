package gguro.collections;

import java.util.HashMap;
import java.util.Map;

import gguro.common.Testable;

public class MapEx2 implements Testable {
	public void test() {

        Map<String,Integer> map = createMap();
        map.put("Android", 1 + map.getOrDefault("Android", 0));

        // write to command line
        map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));
    }

    private static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Eclipse IDE", 0);
        map.put("Eclipse RCP", 0);
        map.put("Git", 0);
        return map;
    }
}
