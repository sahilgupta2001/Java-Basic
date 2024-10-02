/*
Write a program to sun of all even natural numbers between 1 to n
 */
package loopcase;
import java.util.Scanner;
public class Sum_Even_Number {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the limit number : ");
	int n = sc.nextInt();		//To input the limit number
	int sum = 0;	
	for(int i=1; i<=n; i++) {
		if(i%2==0) {
			sum = sum + i; 
		}
	}
	System.out.print("Sum of Even Numbers : " + sum);
	sc.close();

}
}
//Results
/*
Enter the limit number : 20(Input)
Sum of Even Numbers : 110(Run time output)
*/
