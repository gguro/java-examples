package gguro.fileio2;

import java.io.File;
import java.util.Date;

import gguro.common.Testable;

public class FileClassEx1 implements Testable {
	public void test() {
		File f1 = new File("testTextFile.txt");
		
		System.out.println(" f1.getPath(): " + f1.getPath());
		System.out.println(" f1.getAbsolutePath(): " + f1.getAbsolutePath());
		System.out.println(" f1.getName(): " + f1.getName());
		System.out.println(" f1.getPath(): " + f1.getPath());
		System.out.println(" f1.toString(): " + f1.toString());
		try {
			System.out.println(" f1.toURL(): " + f1.toURL());
			System.out.println(" f1.toURL(): " + f1.toURI());
			
		} catch (java.net.MalformedURLException e) {
			System.out.println(" f1.toURL(): " + e);
		}
		System.out.println(" f1.canRead(): " + f1.canRead());
		System.out.println(" f1.canWrite(): " + f1.canWrite());
		System.out.println(" f1.isAbsolute(): " + f1.isAbsolute());
		System.out.println(" f1.isDirectory(): " + f1.isDirectory());
		System.out.println(" f1.isFile(): " + f1.isFile());
		System.out.println(" f1.isHidden(): " + f1.isHidden());
		System.out.println(" f1.lastModified(): " + new Date(f1.lastModified()));
		System.out.println(" f1.length(): " + f1.length());
		System.out.println(" f1.exists(): " + f1.exists());
		
		File c = new File("c:/");
		String [] nameList = c.list();
		
		System.out.println("--- file list ---");
		for (String name : nameList) {
			System.out.println(name);
		}
		
		System.out.println("--- file list 2 ---");
		File[] flist = c.listFiles();
		for(File ff : flist) {
			if(ff.isDirectory()) {
				System.out.println("[folder] " + ff.getName());
			} else {
				System.out.println("   - " + ff.getName());
			}
		}
		
		System.out.println("--- Make dir ---");
		File folder = new File("test");
		if(!folder.exists()) {
			System.out.println("make dir");
			if(folder.mkdir()) {
				System.out.println("success");
			} else {
				System.out.println("fail");
			}
		}
			
	}
}
