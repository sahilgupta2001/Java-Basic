/*
write a program to reverse the given Digits
 */
package loopcase;
import java.util.Scanner;
public class Digits_Reserve {		//To create a class "Digits_Reserve"
	public static void main(String[] args) {		//To create a main method
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();		//To create a num variable for store number  
		int a = num;		//Add a num value in another variable 'a'
		int rev = 0;		//rev(reverse) To store a reverse number
		int rem = 0;		//rem(remainder) To store a remainder number
		while(num!=0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println("Given Number : " + a);
		System.out.print("Reverse Number is : " + rev);
		sc.close();
	}
}
//Run
/*
Enter the number : 123(Input)
Given Number : 123
Reverse Number is : 321
*/
//Explains
/*
Let assume,
num = 123

loop start only when num is not equal to 0
rem = num % 10
rem = 123 % 10
rem = 3

rev = rev * 10 + rem
rev = 0 * 10 + 3
rev = 3

num /= 10
num = num/10
num = 123/10
num = 12

All process repeat until rev value is out
rev = 321
*/
