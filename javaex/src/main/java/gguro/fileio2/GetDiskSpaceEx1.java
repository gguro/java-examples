package gguro.fileio2;

import java.io.File;

import gguro.common.Testable;

public class GetDiskSpaceEx1 implements Testable {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		File file = new File("c:");
    	long totalSpace = file.getTotalSpace(); //total disk space in bytes.
    	long usableSpace = file.getUsableSpace(); ///unallocated / free disk space in bytes.
    	long freeSpace = file.getFreeSpace(); //unallocated / free disk space in bytes.

    	System.out.println(" === Partition Detail ===");

    	System.out.println(" === bytes ===");
    	System.out.println("Total size : " + totalSpace + " bytes");
    	System.out.println("Space free : " + usableSpace + " bytes");
    	System.out.println("Space free : " + freeSpace + " bytes");

    	System.out.println(" === mega bytes ===");
    	System.out.println("Total size : " + totalSpace /1024 /1024 + " mb");
    	System.out.println("Space free : " + usableSpace /1024 /1024 + " mb");
    	System.out.println("Space free : " + freeSpace /1024 /1024 + " mb");
	}

}
