package loopcase;
import java.util.Scanner;
public class EvenOdd {
	//if else method
	public void check(int number) {
		if((number%2) == 0)			//any number divided by 2 give remainder 0
		{
			System.out.println("This number is Even");
		}
		else						//any number divided by 2 give remainder not 0
		{
			System.out.println("This number is Odd");
		}
	}
	public static void main(String[] args) {
		EvenOdd ob = new EvenOdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number : ");	//Enter your number to check whether number is odd or even
		int number = sc.nextInt();
		ob.check(number);
        sc.close();
	}

}
