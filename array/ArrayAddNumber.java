// Add all number in array
package array;
import java.util.Scanner;
public class ArrayAddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array of size 5 :  ");
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		int out=0;
		for(int i=0; i<5; i++) {
			out = out + arr[i];
		}
		System.out.print(out + " ");
		sc.close();
	}

}
