//Natural Number
package loopcase;
import java.util.Scanner;
public class Naturalnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Starting Number : ");		//Enter the Starting Number where you have to start the code
		int start = sc.nextInt();
		System.out.print("Enter the Ending Number : ");		//Enter the Ending Number where you have to end the code
		int end = sc.nextInt();
		for(int i=start; i<=end; i++) {
			System.out.println(i);
		}
		sc.close();
	}
}
//Results
/*
Console -
Enter the Starting Number : 1(input)
Enter the Ending Number : 5(input)
1
2
3
4
5
*/
