package gguro.network;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import gguro.common.Testable;

public class SimpleServerEx1 implements Testable {

	String[] advices = {"조금씩 드세요", "운동을 하세요", "용감하게 의견을 말해보세요"};
	
	public void test() {
		try {
			ServerSocket ss = new ServerSocket (4242);
			
			while(true) {
				Socket sock = ss.accept();
				PrintWriter pw = new PrintWriter(sock.getOutputStream());
				
				String advice = getAdvice();
				
				pw.println(advice);
				pw.close();
				System.out.println(advice);
			}
		}catch (IOException io) {
			io.printStackTrace();
			
		}
	}
	
	private String getAdvice() {
		int random = (int) (Math.random() * advices.length);
		return advices[random];
	}
	
}
