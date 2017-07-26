package gguro.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import gguro.common.Testable;

public class CopyConstructEx implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(Collections.nCopies(100, "test"));
		
		System.out.println(list);
		
	}

}
