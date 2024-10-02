/*
Write a program to find the value of one number raised to the power of another
 */
package loopcase;
import java.util.Scanner;
public class Power {	//To create class with object "Power"
	public static void main(String[] args) {		//To create method
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base number : ");
		int base = sc.nextInt();		//To create a base input 
		System.out.print("Enter the power number : ");
		int power = sc.nextInt();		//To create a power input for base
		int result =1;
		for(int i=1; i<=power; i++) {
			result *= base;		//result = result * base
		}
		System.out.print("Result : " + result);
		sc.close();
	}

}
//Explains
/*
Let's Assume
base = 2
power = 3 
 
loop start
i=1
result = result * base
result = 1 * 2
result = 2

i=2
result = result = base
result = 2 * 2		//result = 2 in i=1 loop rum
result = 4

i=3
result = result * base
result = 4 * 2
result = 8

Result : 8
*/
