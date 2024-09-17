package loopcase;
import java.util.Scanner;		//using a scanner library
public class Whileloopdemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//To given the input
		System.out.print("Enter the Start Number : ");
		int start = sc.nextInt();		//To start the number where we have choose
		System.out.print("Enter the End Number : ");
		int end = sc.nextInt();			//To end the number 
		while (start<=end)		//To give a condition
		{
			System.out.print(start + " ");
			start++;		//start = start + 1
		}
		sc.close();		//To end the Scanner
	}

}
//Results
/*
Enter the Start Number : 1(Input)
Enter the End Number : 20(Input)
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
*/
