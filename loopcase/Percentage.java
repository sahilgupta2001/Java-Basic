package loopcase;
import java.util.Scanner;

public class Percentage {
	
	public void perdivision(float per) {
		if(per>=0 && per < 33)
		{
			System.out.println("Fail");
		}
		else if(per>=33 && per<45)
		{
			System.out.println("Third Division");
		}
		else if(per>=45 && per<60)
		{
			System.out.println("Second Division");
		}
		else
		{
			System.out.println("First Division");
		}
	}
	public static void main(String[] args) {
		Percentage ob = new Percentage();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name = sc.next();
		System.out.println("Enter your Percentage : ");
		float per = sc.nextFloat();
		ob.perdivision(per);
        sc.close();
	}
}