package gguro.network;

import java.io.IOException;
import java.net.ServerSocket;

import gguro.common.Testable;

public class PortScannerEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		ServerSocket sp;
		
		for(int i=1; i<65535; i++) {
			try {
				sp = new ServerSocket(i);
				sp.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("port["+i+"] : " + e.getMessage());
			} 
		}
			
	}

}
