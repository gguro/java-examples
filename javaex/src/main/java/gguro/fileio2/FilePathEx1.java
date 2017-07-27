package gguro.fileio2;

import java.io.File;
import java.io.IOException;

import gguro.common.Testable;

public class FilePathEx1 implements Testable{

	public void test() {
		String filename = "newFile.txt";
		String workingDir = System.getProperty("user.dir");
		
		String absoluteFilePath = "";
		
		absoluteFilePath = workingDir + File.separator + filename;
		
		System.out.println("Full Path = " + absoluteFilePath);
		
		File file = new File(absoluteFilePath);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File is already created!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
