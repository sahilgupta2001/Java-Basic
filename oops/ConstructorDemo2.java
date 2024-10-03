package oops;

class A5
{
 public void methodA()
 {
	 System.out.println("method of class A");
 }
}

public class ConstructorDemo2 extends A5{
	int a = 10;
	public void methodA()
	 {
		super.methodA();
		a++;
		 System.out.println("method of class ConstructorDemo for incement : " + a);
		 
	 }
	public static void main(String[] args)
	{
		ConstructorDemo2 ob = new ConstructorDemo2();
		ob.methodA();
		
	}
}
