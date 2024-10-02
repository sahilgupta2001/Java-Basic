// Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9  
package loopcase;

public class Sum_Divisible_Nine {
	public static void main(String[] args) {
		int i,sum=0;
		System.out.println("Numbers between 100 and 200, divisible by 9 : \n");	// '\n' character is used to add a newline after the string
		for(i=101;i<200;i++)
		{
			if(i % 9 == 0)
			{
				System.out.println(i);
				sum += i;	//sum = sum + i
			}
		}
		System.out.println("Sum is : " + sum);
	}
}
//Console
/*
Numbers between 100 and 200, divisible by 9 : 

108
117
126
135
144
153
162
171
180
189
198
*/
