package loopcase;
import java.util.Scanner;
public class WeekSwitchmethod {
	public void dayWeek(String day) {
		switch (day)
		{
		case "Monday":
		{
			System.out.println("First Day of the Week");
			break;
		}
		case "Tuesday":
		{
			System.out.println("Second Day of the Week");
			break;
		}
		case "Wednesday":
		{
			System.out.println("Third Day of the Week");
			break;
		}
		case "Thursday":
		{
			System.out.println("Fourth Day of the Week");
			break;
		}
		case "Friday":
		{
			System.out.println("Fifth Day of the Week");
			break;
		}
		case "Saturday":
		{
			System.out.println("Sixth Day of the Week");
			break;
		}
		default:
			System.out.println("Seventh Day of the Week");
		}
	}
	public static void main(String[] args ) {
		WeekSwitchmethod ob = new WeekSwitchmethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your week : ");
		String dayName = sc.next();
		ob.dayWeek(dayName);
        sc.close();
	}

}
