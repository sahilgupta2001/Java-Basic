package oops;

public class thisbymethod {

	public void mehtodA()
	{ 
		this.mehtodB();
		System.out.println("method A");
	}
	public void mehtodB()
	{
		System.out.println("method B");
	}
	public static void main(String[] args) {
		thisbymethod ob = new thisbymethod();
		ob.mehtodA();
	}
}
