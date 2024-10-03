package oops;

public class finallydemo {

	public void validateAge() 
	{
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}
		finally
		{
			System.out.println("finally block executed");
		}
		System.out.println("exception is not handled");
	}
	public static void main(String[] args) {
		finallydemo ob = new finallydemo();
		
		ob.validateAge();
		
	}
}
