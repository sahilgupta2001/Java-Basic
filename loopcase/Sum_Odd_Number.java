/*
Write a program to sum all odd natural numbers between 1 to n
 */
package loopcase;
import java.util.Scanner;
public class Sum_Odd_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit  number : ");
		int n = sc.nextInt();		//To input the limit number
		int sum = 0;
		for(int i=1; i<=n; i++)
		{
			if(i%2!=0) {
				sum = sum + i;
			}
		}
		System.out.print("Sum of Odd Number : " + sum);
		sc.close();
	}

}
//Results
/*
Enter the limit number : 10(Input)
Sum of Odd Number : 25(Run Time Output)
*/
