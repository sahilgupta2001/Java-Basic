// Write a program a check whether a number is strong number or not
package loopcase;
import java.util.Scanner;
public class StrongNumber {
	public void strongnumber(int n) {
		int n1,s1=0,i,j;
		int fact;
		n1=n;
		for(j=n; j>0; j=j/10)
		{
			fact = 1;
			for(i=1; i<=j%10; i++)
			{
				fact = fact * i;
			}
			s1 = s1 + fact;
		}	
		if(s1 == n1)
		{
			System.out.println(n1 + " is Strong Number.");
		}
		else
		{
			System.out.println(n1 + " is not a Strong Number.");
		}
	}
	public static void main(String[] args) {
		StrongNumber ob = new StrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strong Number : ");
		int n = sc.nextInt();
		ob.strongnumber(n);
        sc.close();
	}
}
//Process
/*
Let assume, n = 145
int n1, s1=0,i,j
int fact
n1 = n ; n1 = 145
for
j = n ; j = 145
j > 0 ; 
j = j / 10 ; 

fact = 1 (given)
for
i = 1 ;
i <= j % 10 ; i <= 145 % 10 ; i <= 5
i++ ; 

fact = fact * i ; fact = 1 * 1 ; fact = 1
Until the loop end, the value of the fact is 120
fact = 120
i loop end 

s1 = s1 + fact ; s1 = 0 + 120 ; s1 = 120
j loop end

loop restart
j = 14 ;
j > 0 ;
j = j / 10 ; 

fact = 1 (given)
for
i = 1 ;
i <= j % 10 ; i <= 14 % 10 ; i <= 4
i++ ;

fact = fact * i ; fact = 1 * 1 ; fact = 1
Until the loop end, the value of the fact is 24
fact = 24
i loop end

s1 = s1 + fact ; s1 = 120 + 24 ; s1 = 144
j loop end
one loop pending
end value
s1 = 145
if loop 
s1 == n1
Strong number or not
*/
