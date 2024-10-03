package oops;

import java.util.Scanner;

public class Division {

	public void divide(int num1, int num2)
	{
	//	float num3= (num1/num2);
		//System.out.println(num3);
		
		//int[] arr = {5,4,5};
		//System.out.println(arr[3]);
		String name = null;
		System.out.println(name.charAt(1));
		System.out.println("division completed successfully");
	}
	
	
	public static void main(String[] args) {
		Division ob = new Division();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter inputs");
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		ob.divide(num1, num2);
		sc.close();
		}
}
