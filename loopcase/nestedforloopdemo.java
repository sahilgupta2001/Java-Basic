//nested for loop
package loopcase;
import java.util.Scanner;
public class nestedforloopdemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//To create input
		System.out.print("Enter the First Loop Number : ");
		int n = sc.nextInt();		//To give the number in first loop
		System.out.print("Enter the Second Loop Number : ");
		int k = sc.nextInt();		//To give the number in second loop
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=k; j++)
			{
				System.out.println(i + " " + j);
			}
		}
		sc.close();		//To close the scanner
	}

}
//Results
/*
Enter the First Loop Number : 3(Input)
Enter the Second Loop Number : 3(Input)
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
*/
/*
Process
i=1		j=1
i=1		j=2(+1)		j check the number is match or not if match exit otherwise add +1 until j match the given number
i=1 	j=3(+1)
		loop of j repeat
i=2(+1) j=1		because j variable match the number that was given so i proceed and j loop reset until i complete
i=2 	j=2
i=2 	j=3
		loop of j repeat
i=3(+1) j=1
i=3 	j=2
i=3 	j=3
*/
