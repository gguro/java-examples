package gguro.fileio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import gguro.common.Testable;

public class BufferedReaderEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		FileReader fr = null;
		
		String filename = System.getProperty("user.dir") + File.separator + "test.txt";
		
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			
			String sCurrentLine;
			
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
			
		} catch (Exception e) {
			try {
				if(br!=null)
					br.close();
				if(fr != null) 
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
