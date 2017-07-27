package gguro.fileio2;

import java.io.File;
import java.io.FilenameFilter;

import gguro.common.Testable;

public class FindFilesEx1 implements Testable {
	private final String FILE_DIR = "test.txt";
	private final String FILE_EXT = ".jpg";
	
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		listFile(FILE_DIR, FILE_EXT);
	}
	
	public void listFile(String folder, String ext) {
		GenericExtFilter filter = new GenericExtFilter(ext);
		
		File f = new File(folder);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("it's not directory.");
			return;
		}
		
		String[] list = f.list(filter);
		if(list.length == 0) {
			System.out.println("matched file not found.");
			return;
		}
		
		for (String name : list) {
			String temp = new StringBuffer(FILE_DIR).append(File.separator).append(name).toString();
			System.out.println("file : " + temp);
		}
	}
	
	public class GenericExtFilter implements FilenameFilter {
		private String ext;
		
		public GenericExtFilter(String ext) {
			this.ext = ext;
		}
		
		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			
			return (name.endsWith(ext));
		}
	}
}
