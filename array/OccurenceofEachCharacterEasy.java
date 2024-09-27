// Write a program to print occurence of each character in given string
package array;
import java.util.Scanner;
public class OccurenceofEachCharacterEasy {
	public void counteachcharacters(String inp) {
		//int count = 1;
		char[] ch = inp.toCharArray();	//[h,e,l,l,o,j,a,v,a]
		String out = "";	//helojva
		for(int i=0; i<ch.length; i++) {
			boolean flag = false;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					flag = true;
				}
			}
			if(flag==false) {
				out = out + ch[i];
			}
		}
		char[] ch1 = out.toCharArray();	//[h,e,l,o,j,v,a]
		for(int i=0; i<ch1.length; i++) {
			int count = 0;
			for(int j=0; j<ch.length; j++) {
				if(ch1[i]==ch[j]) {
					count++;
				}
			}
			System.out.println(ch1[i] + " occurs " + count);
		}
	}
	public static void main(String[] args) {
		OccurenceofEachCharacterEasy ob = new OccurenceofEachCharacterEasy();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String inp = sc.nextLine();	//hellojava
		ob.counteachcharacters(inp);
		sc.close();
	}
}
//Console
/*
Enter the String : hellojava(given)
h occurs 1
e occurs 1
l occurs 2
o occurs 1
j occurs 1
v occurs 1
a occurs 2
*/
