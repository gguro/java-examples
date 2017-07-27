package gguro.fileio2;

import java.io.File;
import java.io.FilenameFilter;

import gguro.common.Testable;

/**
 * delete "*.txt" files
 */

public class DeleteFileFilterEx1 implements Testable {

	private static final String FILE_DIR = "c:\\folder";
	private static final String FILE_TEXT_EXT = ".txt";
	
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		deleteFile(FILE_DIR, FILE_TEXT_EXT);
	}
	
	public void deleteFile(String folder, String ext) {
		
		File dir = new File(folder);
		GenericExtFilter filter = new GenericExtFilter(ext);
		
		String[] list = dir.list(filter);
		
		if(list.length == 0) return;
		
		File fileDelete;
		
		for (String file : list) {
			String temp = new StringBuffer(FILE_DIR)
					.append(File.separator)
					.append(file)
					.toString();

			
			fileDelete = new File(temp);
		
			boolean isDeleted = fileDelete.delete();
			System.out.println("file : " + temp + "is deleted : " + isDeleted);
		}
		
	}

	// inner class
	public class GenericExtFilter implements FilenameFilter {
		
		private String ext;
		
		public GenericExtFilter(String ext) {
			this.ext = ext;
		}
		
		public boolean accept(File dir, String name) {
			return (name.endsWith(ext));
		}
	}
}
