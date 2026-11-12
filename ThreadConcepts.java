package morninng;
//class Jana extends Thread
//{
//
//	@Override
//	public void run() {
//		System.out.println("Hello");
//	}
//	
//}
//public class ThreadConcepts {
//
//	public static void main(String[] args)
//	{
//		Jana j=new Jana();
//		j.start();
//	}
//	/*
//	 * Thread
//	 * 2 types
//	 * 1.Single thread
//	 *   2 ways
//	 *   1.Using Runnable interface
//	 *   2.Using Thread class
//	 * 2.Multi-thread
//	 *  1.daemon thread
//	 *  2.priority thread
//	 *  3.Synchronization
//	 *  4.join() method
//	 *  
//	 *  Garbage Collector
//	 */
//
//}


//class Jana extends Thread
//{
//
//	@Override
//	public void run() 
//	{
//		if(Thread.currentThread().isDaemon())
//		{
//			System.out.println("Daemon thread...");
//		}
//		else
//		{
//			System.out.println("Not daemon thread");
//		}
//	}
//	
//}
//public class ThreadConcepts {
//
//	public static void main(String[] args)
//	{
//		Jana j=new Jana();
//		Jana j1=new Jana();
//		Jana j2=new Jana();
//		System.out.println(j.getPriority());
//		System.out.println(j1.getPriority());
//		System.out.println(j2.getPriority());
//		j.setPriority(3);
//		j1.setPriority(9);
//		j2.setPriority(6);
//		System.out.println(j.getPriority());
//		System.out.println(j1.getPriority());
//		System.out.println(j2.getPriority());
//	}
//	
//
//}
//class Demo
//{
//	synchronized void print(int n)
//	{
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println(i*n);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//class Jana extends Thread
//{
//	Demo d;
//	Jana(Demo d)
//	{
//		this.d=d;
//	}
//	public void run()
//	{
//		d.print(6);
//	}
//}
//
//class Mano extends Thread
//{
//	Demo d;
//	Mano(Demo d)
//	{
//		this.d=d;
//	}
//	public void run()
//	{
//		d.print(7);
//	}
//}
//public class ThreadConcepts {
//
//	public static void main(String[] args)
//	{
//		Demo d=new Demo();
//		Jana j=new Jana(d);
//		Mano m=new Mano(d);
//		j.start();
//		m.start();
//	}
//	
//
//}
//class Demo extends Thread
//{
//	public void run()
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}

//public class ThreadConcepts {
//
//	public static void main(String[] args) throws InterruptedException
//	{
//		Demo d=new Demo();
//		Demo d1=new Demo();
//		Demo d2=new Demo();
//		d.start();
//		d.join();
//		d1.start();
//		d2.start();
//	}
//	
//
//}


public class ThreadConcepts {
	protected void finalize()
	{
		System.out.println("Garbage collected...");
	}

	public static void main(String[] args) 
	{
		ThreadConcepts t=new ThreadConcepts();
		t=null;
		System.gc();
	}
	

}
