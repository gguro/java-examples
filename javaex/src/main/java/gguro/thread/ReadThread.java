package gguro.thread;

public class ReadThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		System.out.println("Thread start : " + this.getClass().getName());
		for(int i = 0; i< 20; i++) {
			System.out.println(currentThread().getName() + " " + i);
			
			//Thread.yield();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
