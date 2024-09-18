/*
Write a program to find sum of all natural numbers between 1 to n
 */
package loopcase;
import java.util.Scanner;
public class Natural_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the last number : ");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		System.out.print("Sum of Numbers : " + sum);
		sc.close();
	}

}
//Results
/*
Enter the last number : 20(Input)
Sum of Numbers : 210(Rum time Output)
*/
