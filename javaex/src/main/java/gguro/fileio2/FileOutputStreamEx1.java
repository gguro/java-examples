package gguro.fileio2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import gguro.common.Testable;

public class FileOutputStreamEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		File file = null;
		FileOutputStream fos = null;
		String content = "Example content";
		
		try {
			file = new File("newFile.ext");
			fos = new FileOutputStream(file, true); // append mode
			
			if( !file.exists() ) {
				file.createNewFile();
			}
			
			// get the content in bytes
			byte [] contentInBytes = content.getBytes();
			
			fos.write(contentInBytes);
			fos.flush();
			
			System.out.println("Write done");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
					fos = null;
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}
