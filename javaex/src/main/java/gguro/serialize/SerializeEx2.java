package gguro.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import gguro.common.Testable;

public class SerializeEx2 implements Testable {
	public void test() {
		ArrayList<SerializeData> list = new ArrayList<SerializeData> ();
		
		list.add(new SerializeData("Name1", "Address1", 11111, 101));
		list.add(new SerializeData("Name2", "Address2", 22222, 202));
		list.add(new SerializeData("Name3", "Address3", 33333, 303));
		list.add(new SerializeData("Name4", "Address4", 44444, 404));
		
		try {
			FileOutputStream fileOut = new FileOutputStream("serializeData2.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(list);
			
			out.flush();
			out.close();
			fileOut.close();
			System.out.printf("Done.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
