/*
write a program to Check Whether a Given Number is Prime or Not
 */
package loopcase;
import java.util.Scanner;
public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.print("This is the prime number.");
		}
		else
		{
			System.out.print("This is not the prime number.");
		}
		sc.close();
	}

}
//Explains
/*
let assume,
num = 5
count = 0
loop start
i=2
if loop,
num % i == 0
3 % 2 == 0
Not possible
if loop,
This is the prime number.
*/
