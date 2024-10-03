package oops;

public class throwsdemo {

	public void waitforPrint() throws InterruptedException
	{
		System.out.println("wait for 5 second");
		
		Thread.sleep(5000);
		System.out.println("wait for 5 second done");
	}
	public static void main(String[] args) throws InterruptedException {
		throwsdemo ob = new throwsdemo();
		ob.waitforPrint();
	}
}
