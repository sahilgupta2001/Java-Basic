package loopcase;
import java.util.Scanner;	//Importing a method
public class Leapyear {
	//boolean leap=false;
	public void isLeapYear(int year) {
		boolean leap;
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					leap = true;
				}
				else
				{
					leap = false;
				}
			}
			else 
			{
				leap = false;	
			}
		}
		else
		{
			leap = false;	
		}
	}
		
	public static void main(String[] args) {
		Leapyear ob = new Leapyear();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your year : ");		//To check whether your selected year is leap year or not
		int yearleap = sc.nextInt();
		ob.isLeapYear(yearleap);
		int year;
		boolean leap;
		if(leap=true)
			{
			System.out.println(yearleap + " is a leap year");
			}
		else
		{
			System.out.println(yearleap + " is not a leap year");
		}
		sc.close();
	}

}