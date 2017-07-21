package gguro.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import gguro.common.Testable;

/**
 * Write a Java program to find the longest word in a text file. 파일에서 가장 긴 단어 찾기
 */
public class FileIOEx10 implements Testable {

	public void test() {
		// TODO Auto-generated method stub

		try {
			findLongestWords();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String findLongestWords() throws FileNotFoundException {

		String longest_word = "";
		String current;
		Scanner sc = new Scanner(new File("/home/students/test.txt"));

		while (sc.hasNext()) {
			current = sc.next();
			if (current.length() > longest_word.length()) {
				longest_word = current;
			}

		}
		System.out.println("\n" + longest_word + "\n");
		return longest_word;
	}
}
