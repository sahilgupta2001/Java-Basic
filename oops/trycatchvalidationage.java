package oops;

import java.util.Scanner;

public class trycatchvalidationage {

	public void validateAge(int age) 
	{
		try {
		if(age<18)
		{
			throw new Exception("you are not eligible");
		}
		else
		{
			System.out.println("you are eligible");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
			main(null);
		}
	}
	public static void main(String[] args) {
		trycatchvalidationage ob = new trycatchvalidationage();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your age");
		int age = sc.nextInt();
		ob.validateAge(age);
		sc.close();
	}
}
