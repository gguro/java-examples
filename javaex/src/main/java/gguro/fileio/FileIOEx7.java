package gguro.fileio;

import java.io.File;

import gguro.common.Testable;

/**
 * Write a Java program to get file size in bytes, kb, mb.
 * 파일 용량 계산
 */

public class FileIOEx7 implements Testable {

	public void test() {
		// TODO Auto-generated method stub
		File file = new File("/home/students/test.txt");

		if (file.exists()) {
			System.out.println(filesize_in_Bytes(file));
			System.out.println(filesize_in_kiloBytes(file));
			System.out.println(filesize_in_megaBytes(file));
		} else
			System.out.println("File doesn't exist");
	}

	private static String filesize_in_megaBytes(File file) {
		return (double) file.length() / (1024 * 1024) + " mb";
	}

	private static String filesize_in_kiloBytes(File file) {
		return (double) file.length() / 1024 + "  kb";
	}

	private static String filesize_in_Bytes(File file) {
		return file.length() + " bytes";
	}

}
