// Write a program to reverse a character
package array;
import java.util.Scanner;
public class ReverseString {
	public void reverse(String n) {	
		char[] ch = n.toCharArray();	//[n,o,i,d,a]
		String out = "";	
		for(int i=ch.length-1; i>=0; i--)	// starting length = 5
			{
				out = out + ch[i];
			}
		System.out.println(out);	//out = adion
	}
	
	public static void main(String[] args) {
		ReverseString  ob = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input : ");
		String n = sc.next(); //noida
		ob.reverse(n);
		sc.close();
	}
}
