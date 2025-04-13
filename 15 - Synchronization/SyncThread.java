class Disp
{
	synchronized void disp1(int n)
	{
		for(int i=1;i<=n;i++)
		{
		System.out.println(i);
		try
		{
	Thread.sleep(500);
					
		} catch (Exception e) {
		}
		}
	}
}
public class SyncThread extends Thread
{
	Disp d;
	SyncThread(Disp d)
	{
		this.d=d;
	}	
	public void run()
	{
		d.disp1(5);
	}
	public static void main(String args[])
	{
		Disp d1=new Disp();
		SyncThread t1=new SyncThread(d1);
		SyncThread t2=new SyncThread(d1);
		 
		t1.start();
		t2.start();
	}
}
