package oops;



public class ExceptionDemo {

	public void divide() {
		
		
		try
		{
			int num1 = 10;
			int num2 = 0;
			float num3 = (num1 / num2);
			System.out.println(num3);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}

		System.out.println("division completed successfully");
	}

	public static void main(String[] args) {
		ExceptionDemo ob = new ExceptionDemo();
		ob.divide();
	}
}
