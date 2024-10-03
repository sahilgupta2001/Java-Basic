package oops;



public class nestedtrycatch {

	public void divide() {
		
		
		try
		{
			int num1 = 10;
			int num2 = 0;
			float num3 = (num1 / num2);
			System.out.println(num3);
	
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		try {
			int []arr = {2,3,4,5,};
			System.out.println(arr[6]);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("division completed successfully");
	}

	public static void main(String[] args) {
		nestedtrycatch ob = new nestedtrycatch();
		ob.divide();
	}
}
