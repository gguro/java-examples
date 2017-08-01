package gguro.fileio2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import gguro.common.Testable;

public class FileCopyEx2 implements Testable {
	
	public void test() {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
        
		byte buf[] = new byte [1024*10];
		int length = 0;
		
		try {
			fis = new FileInputStream("first_org.txt");
			fos = new FileOutputStream("first_copy.txt");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while((length = bis.read(buf)) > 0) {
				bos.write(buf, 0, length);
				bos.flush();
			}
			
			
			bis.close();
			
			//플러시후 스트림 종료
			bos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
	}
}
