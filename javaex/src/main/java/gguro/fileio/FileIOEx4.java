package gguro.fileio;

import java.io.File;

import gguro.common.Testable;

/**
 * Write a Java program to check if a file or directory has read and write
 * permission. 파일 읽기/쓰기 권한 확인
 */

public class FileIOEx4 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		// Create a File object
		File my_file_dir = new File("/home/students/abc.txt");
		
		if (my_file_dir.canWrite()) {
			System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
		} else {
			System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
		}
		if (my_file_dir.canRead()) {
			System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
		} else {
			System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
		}
	}

}
