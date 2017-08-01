package gguro.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import gguro.common.Testable;

public class URLEx2 implements Testable {

	@Override
	public void test()  {
		// TODO Auto-generated method stub
		// 1. 자원연결통신수단 : URL
		//URL url = new URL("http://www.daum.net:80/index.html");
		try {
			URL url = new URL("http://www.nate.com");
			URLConnection conn = url.openConnection();
			// 1.5 연결
			conn.connect();
	
			// 2. URL입력스트림
			// InputStream is= url.openStream();
			InputStream is = conn.getInputStream();
	        //----------------------------------------------
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			String s = "";

			System.out.println("-----------------------------");
			// 연결된 자원헤더정보
			System.out.println(conn.getHeaderFields());
			// html
			System.out.println(conn.getContentType());
			// 자원크기
			System.out.println(conn.getContentLength());
			br.close();
		}catch (MalformedURLException me) {
			me.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
