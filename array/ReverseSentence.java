// Write a program to print the reverse sentence in the given sentence
package array;
import java.util.Scanner;
public class ReverseSentence {
	public void reversesentence(String inp) {
		String[] str = inp.split(" ");	// [my,name,is,java]
		String out ="";
		for(int i=str.length-1; i>=0; i--)	//first i=java
		{
			char[] ch = str[i].toCharArray();	// first loop ch = [j,a,v,a]
			for(int j=ch.length-1; j>=0; j--)
			{
				out = out + ch[j];	// first loop out = avaj
			}
			out = out + " ";
		}
		System.out.println(out);	//avaj si eman ym
	}
	public static void main(String[] args) {
		ReverseSentence ob = new ReverseSentence();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input : ");
		String inp = sc.nextLine();	//my name is java
		ob.reversesentence(inp);
		sc.close();
	}
}
