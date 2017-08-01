package gguro.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import gguro.common.Testable;

public class URLEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		URL url = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			url = new URL("http://www.nate.com");
			is = url.openStream();
			isr = new InputStreamReader(is, "utf-8");
			br = new BufferedReader(isr);
			
			String s = "";
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (UnsupportedEncodingException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br != null)
					br.close();
				if(isr != null)
					isr.close();
				if(is != null)
					is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
