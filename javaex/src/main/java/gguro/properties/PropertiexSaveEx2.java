package gguro.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import gguro.common.Testable;

public class PropertiexSaveEx2 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		String filename = "config.properties";
		//InputStream is = PropertiexSaveEx2.class.getClassLoader().getResourceAsStream(filename);
		
		
		try {
			//prop.load(is);
			prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
			
			//get the property value and print it out
	        System.out.println(prop.getProperty("local.ip"));
	        System.out.println(prop.getProperty("remote.ip"));
	        System.out.println(prop.getProperty("database.ip"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			if(is != null) {
//				try {
//					is.close();
//				} catch (IOException e2) {
//					e2.printStackTrace();
//				}
//			}
		}
		
		
		
	}

}
