package gguro.exceptions;

import java.util.Scanner;

import gguro.common.Testable;

public class RecursiveExceptionEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		RecursiveObj ro = new RecursiveObj();
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("start");
		System.out.println("name >> ");
		String name = s.nextLine();
		try {
			
			ro.setName(name);
		} catch (RecursiveException e) {
			System.out.println(e.getMessage());
			e.reInput(ro);
		}
		System.out.println("end");
		
	}

}
