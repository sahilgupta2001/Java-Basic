package loopcase;
import java.util.Scanner;
public class Week {
//String Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;	
	public void Stringweekday(String day) {
		if(day.equalsIgnoreCase("Monday"))
		{
			System.out.println("First Day of the Weeks");
		}
		else if(day.equalsIgnoreCase("Tuesday"))
		{
			System.out.println("Second Day of the Weeks");
		}
		else if(day.equalsIgnoreCase("Wednesday"))
		{
			System.out.println("Third Day of the Weeks");
		}
		else if(day.equalsIgnoreCase("Thursday"))
		{
			System.out.println("Fourth Day of the Weeks");
		}
		else if(day.equalsIgnoreCase("Friday"))
		{
			System.out.println("Fifth Day of the Weeks");
		}
		else if(day.equalsIgnoreCase("Saturday"))
		{
			System.out.println("Six Day of the Weeks");
		}
		else
		{
			System.out.println("Seventh Day of the Weeks");
		}
	}
	public static void main(String[] args) {
		Week ob = new Week();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Week Day");
		String day = sc.next();
		ob.Stringweekday(day);
        sc.close();
	}

}
