package loopcase;
import java.util.Scanner;
public class Calculate_HCF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//To create a new Scanner object
		System.out.print("Enter the first number : ");	//This displays the message "Enter the first number : "
		int dividend = sc.nextInt();	//Let assume, 3
		System.out.print("Enter the Second number : ");	//This displays the message "Enter the Second number : "
		int divisor = sc.nextInt();		//Let assume, 35
		int rem,hcf = 0;	//rem for store remainder between dividend and divisor and hcf(highest common factor) of the two numbers
		do
		{
			rem = dividend % divisor;
			if(rem == 0)
			{
				hcf = divisor;	// 	divisor is the hcf of the two numbers
			}
			else
			{
				dividend = divisor;	// we update dividend to be divisor
				divisor = rem;	//	divisor to be rem
			}
		}while(rem != 0);
		System.out.print("hcf : " + hcf);	// hcf : 1
		sc.close();
}
}
