package gguro.exceptions;

import java.util.Scanner;


public class RecursiveException extends Exception {
	Scanner sc= new Scanner(System.in);
	//msg : 사용자가 작성할 예외메세지
	public RecursiveException(String msg) {
		super(msg);
	}
	public void reInput(RecursiveObj recObj) {
		String name2 = sc.nextLine();
		try {
			recObj.setName(name2);
		} catch (RecursiveException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			reInput(recObj);
		}
	}
}
