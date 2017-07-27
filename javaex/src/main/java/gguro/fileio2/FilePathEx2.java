package gguro.fileio2;

import java.io.File;
import java.io.IOException;

import gguro.common.Testable;

public class FilePathEx2 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		String filename = "newFile.txt";
		String workingDir = System.getProperty("user.dir");
		
		File file = new File(workingDir, filename);
		
		System.out.println("Path = " + file.getAbsolutePath());
		
		try {
			if(file.createNewFile()) {
				System.out.println("File is created");
			} else {
				System.out.println("File is already created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
