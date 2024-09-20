//To print a number using do while loop 
package loopcase;
import java.util.Scanner;
public class Dowhiledemonumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//To given a input
		System.out.print("Enter the Start Number : ");
		int start = sc.nextInt();		//To start a number what we choose
		System.out.print("Enter the End Number : ");
		int end = sc.nextInt();		//To end the number what we choose
		do		// statement
		{
			System.out.print(start + " ");
			start++;		//start = start + 1
		}
		while (start<=end);		//condition
		sc.close();			//to close scanner
	}

}
//Results
/*
Enter the Start Number : 1(Input)
Enter the End Number : 20(Input)
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
*/
