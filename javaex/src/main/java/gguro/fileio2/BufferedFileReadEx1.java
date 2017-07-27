package gguro.fileio2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import gguro.common.Testable;

public class BufferedFileReadEx1 implements Testable{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		File file = new File("c:\\testing.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		byte[] buf = new byte[1024];
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			while (bis.available() != 0) {
				System.out.println(bis.read(buf));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null)
					bis.close();
				if(fis != null) 
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
