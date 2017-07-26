package gguro.exceptions;

import java.io.IOException;

public class PropagatedExceptionEx1 {

	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException { // need to throws
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public void test() {
		
		p();
		
		System.out.println("normal flow...");
	}

}
