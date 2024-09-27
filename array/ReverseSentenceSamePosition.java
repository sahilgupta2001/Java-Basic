// Write a program to reverse string on the same position on the given sentence
package array;
import java.util.Scanner;
public class ReverseSentenceSamePosition {
	public void reversesen(String inp) {
		String[] str = inp.split(" ");	//[my,name,is,java]
		String out = "";
		for(int i=0; i<=str.length-1; i++)	//first loop i = my 
		{
			char[] ch = str[i].toCharArray();	//first loop ch = [m,y]
			for(int j=ch.length-1; j>=0; j--) 
			{
				out = out + ch[j];	// first loop out = ym
			}
			out = out + " ";
		}
		System.out.println(out);	//ym eman si avaj
	}
	public static void main(String[] args) {
		ReverseSentenceSamePosition ob = new ReverseSentenceSamePosition();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input : ");
		String inp = sc.nextLine();	//my name is java
		ob.reversesen(inp);
		sc.close();
	}
}
