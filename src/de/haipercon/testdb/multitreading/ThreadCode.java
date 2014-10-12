package de.haipercon.testdb.multitreading;




public class ThreadCode extends Thread {
	private Thread t;
	private String threadName ;
	PrintDemo PD;
	
	public ThreadCode(String threadName, PrintDemo pd) {
		super();
		this.threadName = threadName;
		this.PD = pd;
		System.out.println("Creating " +  threadName );
	}

   public void run() { 
	   //PD.printCount();   // with sysn
	   
	   // with sysn
	   synchronized(PD) {
	        PD.printCount();
	     }
	   
	   System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start ()
   {
      System.out.println("Starting " +  threadName );
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
   
}
