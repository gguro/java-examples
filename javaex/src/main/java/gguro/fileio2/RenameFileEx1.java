package gguro.fileio2;

import java.io.File;

import gguro.common.Testable;

public class RenameFileEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		File oldfile =new File("oldfile.txt");
		File newfile =new File("newfile.txt");

		if(oldfile.renameTo(newfile)){
			System.out.println("Rename succesful");
		}else{
			System.out.println("Rename failed");
		}
	}

}
