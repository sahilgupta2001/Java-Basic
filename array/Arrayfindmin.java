// Write a program to find minimum array using array
package array;
import java.util.Scanner;
public class Arrayfindmin {	//class
	public void findmin(int[] num) {
		int min=num[0];
		for(int i=0; i<num.length; i++) {
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.print(min);
	}
	public static void main(String[] args) {	//main method
		Arrayfindmin ob = new Arrayfindmin();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array of size 5 : ");
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		ob.findmin(arr);
		sc.close();
	}
}
