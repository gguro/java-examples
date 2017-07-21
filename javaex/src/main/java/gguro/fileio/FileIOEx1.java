package gguro.fileio;

import java.io.File;

import gguro.common.Testable;

/**
 * Write a Java program to get a list of all file/directory names from the
 * given.
 * 
 */

public class FileIOEx1 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		File file = new File("/home/students/");
		String[] fileList = file.list();
		for (String name : fileList) {
			System.out.println(name);
		}
	}

}
