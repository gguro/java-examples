package gguro.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

import gguro.common.Testable;

public class InetAddressEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		InetAddress ia;
		InetAddress iaLocal;
		InetAddress [] iaAll;
		try {
			
			ia = InetAddress.getByName("www.nate.net");
			iaLocal = InetAddress.getLocalHost();
			iaAll = InetAddress.getAllByName("www.naver.com");
			
			System.out.println(">> www.nate.net");
			System.out.println(ia.getHostName());
			System.out.println(ia.getHostAddress());
			System.out.println();
			
			System.out.println(">> localhost");
			System.out.println(iaLocal.getHostName());
			System.out.println(iaLocal.getHostAddress());
			System.out.println();
			
			System.out.println(">> www.naver.com");
			for(int i=0; i<iaAll.length; i++) {
				System.out.println(iaAll[i].getHostName());
				System.out.println(iaAll[i].getHostAddress());
			}

			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
