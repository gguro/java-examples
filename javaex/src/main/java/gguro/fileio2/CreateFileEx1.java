package gguro.fileio2;

import java.io.File;
import java.io.IOException;

import gguro.common.Testable;

public class CreateFileEx1 implements Testable {
	public void test() {
		File file = new File("/test/file");
		System.out.println(file.getPath());
		
		try {
			if(file.createNewFile()) {
				System.out.println("file is created");
			} else {
				System.out.println("File is already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
