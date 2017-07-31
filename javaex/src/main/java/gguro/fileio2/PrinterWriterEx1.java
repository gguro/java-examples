package gguro.fileio2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import gguro.common.Testable;

public class PrinterWriterEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		FileWriter fwrite = null;
		PrintWriter pw = null;
		
		try {
			fwrite = new FileWriter("PrintWriterEx1.txt");
			pw = new PrintWriter(fwrite);
			pw.println("Println Test");
			pw.print("Print Test");
			pw.print("int test" + 2000);
			pw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pw != null) 
				pw.close();
		}
		
	}

}
