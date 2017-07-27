package gguro.fileio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import gguro.common.Testable;

public class FileWriterEx1 implements Testable{
	public void test() {
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		String filename = "test.txt";
		String content = "Test content";
		
		try {
			fw = new FileWriter(filename, true); // append mode
			bw = new BufferedWriter(fw);
			bw.write(content);
			bw.flush();

			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) bw.close();
				if (fw != null) bw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
