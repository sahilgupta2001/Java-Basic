/*
Write a program to print all odd number between 1 to 100
 */
package loopcase;
import java.util.Scanner;
public class Odd_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int first = sc.nextInt();		//To given first input
		System.out.print("Enter the last number : ");
		int last = sc.nextInt();		//To give last input
		for(int i=first; i<=last; i++)
		{
			if(i%2!=0)
			{
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
//Results
/*
Enter the number : 1(Input)
Enter the last number : 100(Input)
1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99
*/
