package gguro.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import gguro.common.Testable;

public class PropertiesEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("config.properties");
			
			prop.setProperty("local.ip", "192.168.0.1");
			prop.setProperty("remote.ip", "192.168.0.2");
			prop.setProperty("database.ip", "192.168.0.3");
			
			System.out.println(">> save properties to config.properties");
			prop.store(os, null);
			System.out.println("<< done.");
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if(os != null) {
				try {
					os.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
