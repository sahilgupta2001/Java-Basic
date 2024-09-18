// Write a program to count positive, negative and zeros 
package loopcase;
import java.util.Scanner;
public class Count_PosNegZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//To create a new Scanner object
		int c_pos = 0,c_neg = 0,c_zero = 0;
		char choice;
		do {
			System.out.println("enter the number : ");
			int number  = sc.nextInt();
			if(number > 0)
			{
				c_pos++;
			}
			else if(number < 0)
			{
				c_neg++;
			}
			else
			{
				c_zero++;
			}
			System.out.println("Do you want to continue y/n : ");
			choice = sc.next().charAt(0);	//To choice character 
		}while(choice=='y' || choice=='Y');
		System.out.println("Positive Numbers : " + c_pos);	//This displays a message "Positive Numbers : "
		System.out.println("Negative Numbers : " + c_neg);	//This displays a message "Negative Numbers : "
		System.out.println("Zero Numbers : " + c_zero);		//This displays a message "Zero Numbers : "
		sc.close();
	}
}
