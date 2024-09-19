// Write a program to display the largest and smallest numbers
package loopcase;
import java.util.Scanner;
public class Display_Largest_Smallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// To create a Scanner object
		int number;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		char choice;
		do {
			System.out.println("enter the number : ");
			number  = sc.nextInt();
			if(number > max) {
				max = number;
			}
			if(number < min)
			{
				min = number;
			}
			System.out.println("Do you want to continue y/n : ");	//This displays a message "Do you want to continue y/n : "
			choice  = sc.next().charAt(0);	// To store a character in choice
		}while(choice=='y' || choice=='Y');
		System.out.println("Largest Number : " + max);	//This displays a message "Largest Number : "
		System.out.println("Smallest Number : " + min);	//This displays a message "Smallest Number : "
		sc.close();
	}
}
