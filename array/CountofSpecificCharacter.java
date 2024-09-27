// Write a program to count the specific character in the given word
package array;
import java.util.Scanner;
public class CountofSpecificCharacter {
	public void countofspecificcharacter(String inp, char ch) {
		int count = 0;
		char[] ch2 = inp.toCharArray();	//[a,n,a,i,k,a]
		for(int i=0; i<ch2.length; i++) {
			if(ch2[i]==ch)
			{
				count++;
			}
		}
		System.out.println(ch + " occurs " + count + " times");
	}
	public static void main(String[] args) {
		CountofSpecificCharacter ob = new CountofSpecificCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input : ");
		String inp = sc.next();	//anaika
		System.out.println("Enter the character for count : ");
		char ch = sc.next().charAt(0);
		ob.countofspecificcharacter(inp, ch);
		sc.close();
	}
}
//Console
/*
Enter the input :
anaika
Enter the character for count : 
a
a occurs 3 times
*/
