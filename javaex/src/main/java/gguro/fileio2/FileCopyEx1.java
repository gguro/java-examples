package gguro.fileio2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import gguro.common.Testable;

public class FileCopyEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		File aFile = new File("testA.txt");
		File bFile = new File("testB.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		byte buf[] = new byte[1024];
		
		int length = -1;
		
		try {
			fis = new FileInputStream(aFile);
			fos = new FileOutputStream(bFile);
			
			while((length = fis.read(buf)) > 0) {
				fos.write(buf, 0, length);
			}
			
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
