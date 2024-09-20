/*
Write a program to find the factorial value of any number
 */
package loopcase;
import java.util.Scanner;	//To import a Scanner method
public class Factorial		//To create class for Factorial
{
	public static void main(String[] args) //To create main method
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Factorial Number : ");
		int num = sc.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact *= i;	//fact = fact * i
		}
		System.out.print("Factorial value is : " + fact);
		sc.close();
	}

}
//Process
/*
num=4

loop start
i=1
fact = fact*i
fact = 1*1
fact =1 

loop start
i=2
fact = fact*i
fact = 1*2
fact = 2

loop start
i=3
fact = fact*i
fact = 2*3
fact = 6

loop start
i=4
fact = fact*i
fact = 6*4
fact = 24
loop end

fact value is 24
*/
