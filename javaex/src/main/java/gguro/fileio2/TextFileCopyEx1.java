package gguro.fileio2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import gguro.common.Testable;

public class TextFileCopyEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr= new FileReader("br.txt");
			FileWriter fw= new FileWriter("br2.txt");
			
			PrintWriter pw = new PrintWriter(fw);
			BufferedReader br= new BufferedReader(fr);
			
			String s="";
			while ((s=br.readLine())!=null) {
				//System.out : 포준출력장치(콘솔창) 스트림
				//System.in : 포준입력장치(콘솔창) 스트림
				//close() 호출 X
				//System.out.close();
				System.out.println(s);
				//fw.write(s+"\n"); //Writer는 문자열 출력 가능
				//ps.println(s);
				pw.println(s);
				
			}
			//fw.flush();
			//ps.flush();
			pw.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

}
