//52. Write a program to check whether the given number is prime number or not
package loopcase;
import java.util.Scanner;
public class PrimeNumber2 {
	public void findprime(int num) {
		if(num==0 || num==1) {
			System.out.println("It is not a prime number");
		}
		else {
			boolean flag = false;
			for(int i=2;i<num;i++) {
				int remainder = num%i;
				if(remainder==0) {
					flag=true;
				}
				
			}
			if(flag==false) {
				System.out.println("given number is prime number");
			}
			else
			{
				System.out.println("given number is not a prime number");
			}
		}
	}
	public static void main(String[] args) {
		PrimeNumber2 ob = new PrimeNumber2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		ob.findprime(num);
		sc.close();
	}
}
