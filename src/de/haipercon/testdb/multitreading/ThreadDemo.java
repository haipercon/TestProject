package de.haipercon.testdb.multitreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RunableDemo robj1 = new RunableDemo ("Thread-1");
		//robj1.start();
		//RunableDemo robj2 = new RunableDemo ("Thread-2");
		//robj2.start();
		
		PrintDemo PD = new PrintDemo();
		
		
		ThreadCode t1 = new ThreadCode ("Thread-1", PD);
		ThreadCode t2 = new ThreadCode ("Thread-2", PD);
	
		t1.start();
		t2.start();
		
		// wait for threads to end
	      try {
	         t1.join();
	         t2.join();
	      } catch( Exception e) {
	         System.out.println("Interrupted");
	      }
	
	}
}
