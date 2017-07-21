package gguro.fileio;

import java.io.File;

import gguro.common.Testable;

/**
 * Write a Java program to check if a file or directory specified by pathname exists or not.
 * 파일 존재 확인
 */



public class FileIOEx3 implements Testable {

	public void test() {
		
		// Create a File object
		File my_file_dir = new File("/home/students/xyz.txt");
		
		if (my_file_dir.exists()) {
			System.out.println("The directory or file exists.\n");
		} else {
			System.out.println("The directory or file does not exist.\n");
		}
	}

}
