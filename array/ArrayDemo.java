// To create code for array demo
package array;
import java.util.Scanner;
public class ArrayDemo {		//To create a class "ArrayDemo"
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i=1; i<n; i++) {
			num[i] = sc.nextInt();
		}
		for(int i=1; i<n; i++) {
			System.out.print(num[i] + " ");
		}
		sc.close();
	}
}
