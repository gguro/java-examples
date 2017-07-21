package gguro.fileio;

import java.io.File;

import gguro.common.Testable;

/**
 * Write a Java program to check if given pathname is a directory or a file
 * 디렉토리인지 파일인지 확인
 */

public class FileIOEx5 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		// Create a File object
		File my_file_dir = new File("/home/students/abc.txt");
		
		if (my_file_dir.isDirectory()) {
			System.out.println(my_file_dir.getAbsolutePath() + " is a directory.\n");
		} else {
			System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.\n");
		}
		if (my_file_dir.isFile()) {
			System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
		} else {
			System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
		}
	}

}
