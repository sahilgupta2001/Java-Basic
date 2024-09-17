package loopcase;
import java.util.Scanner;

public class Leapyear2 {
//boolean leap;
	public static void main(String[] args) {
		//Leapyear ob = new Leapyear();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your year : ");		//To check whether your selected year is leap year or not
		int year = sc.nextInt();
		boolean leap=false;;
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
				leap = true;	
			}
		}
		else
		{
			leap = false;	
		}
		if(leap)
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " is not a leap year");
		}
        sc.close();
	}

}
