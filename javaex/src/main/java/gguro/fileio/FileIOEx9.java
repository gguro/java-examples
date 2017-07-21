package gguro.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import gguro.common.Testable;

/**
 * Write a Java program to append text to an existing file. 기존 파일에 추가
 */
public class FileIOEx9 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		
		try {
			String filename = "/home/students/myfile.txt";
			FileWriter fw = new FileWriter(filename, true);
			// appends the string to the file
			fw.write("Java Exercises\n");
			fw.close();
			
			BufferedReader br = new BufferedReader(new FileReader("/home/students/myfile.txt"));
			// read the file content
			while (strLine != null) {
				sb.append(strLine);
				sb.append(System.lineSeparator());
				strLine = br.readLine();
				System.out.println(strLine);
			}
			br.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}

}
