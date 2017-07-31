package gguro.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import gguro.common.Testable;

public class SerializeEx1 implements Testable {
	public void test() {
		
		SerializeData data = new SerializeData();
		SerializeData data2 = new SerializeData();
		data.name = "Name1";
		data.address = "Address1";
		data.SSN = 123456;
		data.number = 101;
		
		data2.name = "Name2";
		data2.address = "Address2";
		data2.SSN = 2222222;
		data2.number = 202;
		
		
		try {
			FileOutputStream fileOut = new FileOutputStream("serializeData.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(data);
			out.writeObject(data2);
			
			out.close();
			fileOut.close();
			System.out.printf("Done.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
