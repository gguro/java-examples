package gguro.fileio2;

import java.io.File;

import gguro.common.Testable;

public class FilePermissionEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		File file = new File("test.sh");
		
		try{
			if(file.exists()) {
				System.out.println("Is Execute allow : " + file.canExecute());
				System.out.println("Is Write allow : " + file.canWrite());
				System.out.println("Is Read allow : " + file.canRead());
			} else {
				file.createNewFile();
			}
			
			file.setExecutable(false);
			file.setReadable(false);
			file.setWritable(false);
			
			System.out.println("Is Execute allow : " + file.canExecute());
			System.out.println("Is Write allow : " + file.canWrite());
			System.out.println("Is Read allow : " + file.canRead());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
