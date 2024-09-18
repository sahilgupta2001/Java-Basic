// To find out the even number between 1 to n 
package loopcase;
import java.util.Scanner;
public class Even_Number {			//create a class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the  Starting Number : ");		//Enter the Starting Number for checking the number whether the number is even or not
		int start = sc.nextInt();
		System.out.print("Enter the Ending Number : ");		//Enter the Ending Number for end the loop
		int end = sc.nextInt();
		for(int i=start; i<=end; i++)
		{
			if(i%2==0)		//formula for checking the number is even or not
					System.out.println(i);
		}
		sc.close();
	}

}
