// Write a program to find maximum number using array
package array;
import java.util.Scanner;
public class Arrayfindmax {
	public void findmax(int[] num) {
		int max = num[0];
		for(int i=0; i<num.length; i++) {
			if(max<num[i]) {
				max=num[i];
			}
		}
		System.out.print(max);
	}
	public static void main(String[] args) {
		Arrayfindmax ob = new Arrayfindmax();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array of size 5 : ");
		//int arr = sc.nextInt();
		int[] arr = new int[5];
		for(int i=0; i<5; i++)
		{
			arr[i] = sc.nextInt();
		}
		ob.findmax(arr);
		sc.close();
	}
}
