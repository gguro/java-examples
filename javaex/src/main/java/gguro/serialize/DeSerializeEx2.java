package gguro.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import gguro.common.Testable;

public class DeSerializeEx2 implements Testable {
	
	@SuppressWarnings("unchecked")
	public void test() {
		ArrayList<SerializeData> list2 = new ArrayList<SerializeData> ();
		
		FileInputStream fileIn;
		ObjectInputStream oin;
		
		try {
			fileIn = new FileInputStream("serializeData2.ser");
			oin = new ObjectInputStream(fileIn);

			list2 = (ArrayList<SerializeData>) oin.readObject();
			
			
			oin.close();
			fileIn.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(list2 != null) {
			list2.forEach(System.out::println);
		}
		
		
	}
}
