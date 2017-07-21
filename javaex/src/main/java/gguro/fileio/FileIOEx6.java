package gguro.fileio;

import java.io.File;
import java.util.Date;

import gguro.common.Testable;

/**
 * Write a Java program to get last modified time of a file.
 * 최종 수정 일자 확인
 */

public class FileIOEx6 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		Date date = new Date(file.lastModified());
		
		System.out.println("\nThe file was last modified on: " + date + "\n");
	}

}
