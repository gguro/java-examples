package gguro.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import gguro.common.Testable;

public class DeSerializeEx1 implements Testable {
	public void test() {
		SerializeData data = null;
		SerializeData data2 = null;
		
		FileInputStream fileIn;
		ObjectInputStream oin;
		try {
			data = new SerializeData();
			fileIn = new FileInputStream("serializeData.ser");
			oin = new ObjectInputStream(fileIn);

			data = (SerializeData) oin.readObject();
			data2 = (SerializeData) oin.readObject();
			oin.close();
			fileIn.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("SerializeData class not found");
			c.printStackTrace();
		}

		if( data != null) {
			System.out.println("Deserialized Data...");
			System.out.println("Name : " + data.name);
			System.out.println("Address : " + data.address);
			System.out.println("SSN : " + data.SSN);
			System.out.println("Number : " + data.number);
		}
		
		if( data2 != null) {
			System.out.println("Deserialized Data...");
			System.out.println("Name : " + data2.name);
			System.out.println("Address : " + data2.address);
			System.out.println("SSN : " + data2.SSN);
			System.out.println("Number : " + data2.number);
		}
		
		

	}
}
