package gguro.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import gguro.common.Testable;

public class PropertiesEx2 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		InputStream is = null;
		
		try {
			is = new FileInputStream("config.properties");
			
			System.out.println(">> load config.properties");
			prop.load(is);
			System.out.println("<< done.");
			
			System.out.println(prop.getProperty("local.ip"));
			System.out.println(prop.getProperty("remote.ip"));
			System.out.println(prop.getProperty("database.ip"));
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
