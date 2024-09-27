// Write a program to convert a binary to decimal number without using array
package convert;
import java.util.Scanner;
public class Binary_Decimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number : ");	//This displays a message "Enter Binary Number : "
		int n = sc.nextInt();	//Let assume, n = 100100
		int n1,p=1;
		int dec=0,i=1,j,d;
		n1=n;	// n1 = 100100
		for(j=n; j>0; j=j/10) {
			d = j % 10;
			if(i==1)
			{
				p=p*1;
			}
			else
			{
				p=p*2;
			}
			dec = dec + (d*p);
			i++;
		}
		System.out.println("Binary Number : " + n1);	// This displays a message "Binary Number : 100100"
		System.err.println("Decimal Number : " + dec);	// This displays a message "Decimal Number : 36"
		sc.close();
	}
}
//Process
/*
n = 100100
n1 = 100100
p = 1
dec = 0
i = 1
j
d

for
j = n; j = 100100
j > 0; j is greater than 0
j = j / 10; j = 100100/10; j = 10010

d = j % 10; d = 0
if
i==1
p = p * 1; p = 1 * 1; p = 1
dec = dec + (d * p); dec = 0 + (0 * 1); dec = 0

j = 10010
d = j % 10; d = 0
p = 2
dec = 0

j = 1001
d = j % 10; d = 1
p = 4
dec = 0 + (1 * 4); dec = 4

j = 100
d = 0
p = 8
dec = 4

j = 10
d = 0
p = 16
dec = 4

j = 1
d = 1
p = 32
dec = 4 + (1 * 32)
dec = 36
*/
