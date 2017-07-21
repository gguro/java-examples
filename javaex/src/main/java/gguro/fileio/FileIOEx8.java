package gguro.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import gguro.common.Testable;

/**
 * Write a java program to read a file line by line and store it into a variable.
 * 텍스트 파일 읽기
 */

public class FileIOEx8 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		String str_data = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
			while (strLine != null) {
				if (strLine == null)
					break;
				str_data += strLine;
				strLine = br.readLine();

			}
			
			System.out.println(str_data);
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read the file.");
		}
	}

}
