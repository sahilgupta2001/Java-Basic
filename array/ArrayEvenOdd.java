// Write a program to check whether the number is even or odd using array
package array;
import java.util.Scanner;
public class ArrayEvenOdd {
	public void EvenOdd(int[] input) {
			
		for(int i=0;i<5;i++)
		{
			if(input[i]%2==0) {
				System.out.println(input[i] + " is a even.");
			}
			else
			{
				System.out.println(input[i] + " is a odd");
			}
		}
	}
	public static void main(String[] args) {
		ArrayEvenOdd ob = new ArrayEvenOdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array of 5 : ");
		int[] input = new int[5];
		for(int i=0;i<5;i++) {
			input[i] = sc.nextInt();
		}
		ob.EvenOdd(input);
		sc.close();
	}
}
