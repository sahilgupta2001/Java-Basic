/*
write a program to sum of its Digits
 */
package loopcase;
import java.util.Scanner;
public class Sum_Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sum Number : ");
		int num = sc.nextInt();
		int sum = 0;
		int a = num;
		int rem = 0;
		while(num != 0) {
			rem = num % 10;
			sum = sum + rem;
			num /= 10;
		}
		System.out.println("Given Digit : " + a);
		System.out.print("Sum Digits is : " + sum);
		sc.close();
	}

}
//Explains
/*
Let assume,
num = 123

loop starts
rem = num % 10
rem = 123 % 10
rem = 3

sum = sum + rem
sum = 0 + 3
sum = 3

num /= 10
num = num/10
num = 123/10
num = 12

All process repeat until all value is add
sum = 6
*/
