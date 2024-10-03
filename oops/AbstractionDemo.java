package oops;

 abstract class RBI
{
	public abstract void roi();

public void loanSchemes()
{
	System.out.println("RBI loan scheme fro the user");
}
}

class SBI extends RBI
{

	@Override
	public void roi() {
		System.out.println("Rate of interest will be 10%");
		
	}
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		SBI ob = new SBI();
		ob.roi();
	}
}
