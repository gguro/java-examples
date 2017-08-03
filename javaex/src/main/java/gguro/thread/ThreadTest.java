package gguro.thread;

import gguro.common.Testable;

public class ThreadTest implements Testable{
	public void test() {
		ReadThread rt = new ReadThread();
		WriteThread wt = new WriteThread();
		RunnableThread runnable = new RunnableThread();
		Thread t = new Thread(runnable);
		
		System.out.println("Thread test start");
		rt.setName("ReadThread");
		rt.setPriority(10);
		
		wt.setPriority(1);
		wt.setName("WriteThread");
		
		t.setName("Runnable Thread");
		
		
		wt.start();
		rt.start();
		t.start();
		
		try {
			wt.join();
			rt.join();
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("The End.");
	}
}
