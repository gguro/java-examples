package gguro.fileio;

import java.io.File;
import java.io.FilenameFilter;

import gguro.common.Testable;

/**
 * Write a Java program to get specific files by extensions from a specified
 * folder
 * 특정 확장자 파일 목록
 */

public class FileIOEx2 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		File file = new File("/home/students/");
		
		String[] list = file.list(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".py")) {
					return true;
				} else {
					return false;
				}
			}
		});
		
		for (String f : list) {
			System.out.println(f);
		}
	}

}
