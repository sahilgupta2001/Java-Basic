// Write a program to print in given number remove duplicates character 
package array;
import java.util.Scanner;
public class RemoveDuplicates {
	public void removeduplicates(String inp) {
		char[] ch = inp.toCharArray();	//[h,e,l,l,o,j,a,v,a]
		String out = "";
		
		for(int i=0; i<ch.length; i++)
		{
			boolean flag= false;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j])
				{
					flag = true;
					break;
				}
			}
			if(flag==false)
			{
				out = out + ch[i];
			}
		}
		System.out.println(out);	//helojva
	}
	public static void main(String[] args) {
		RemoveDuplicates ob = new RemoveDuplicates();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input : "); 	//This displays is message :Enter the input : "
		String inp = sc.nextLine();	//hellojava
		ob.removeduplicates(inp);
		sc.close();
	}
}
