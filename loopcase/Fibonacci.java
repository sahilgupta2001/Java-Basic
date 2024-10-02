package loopcase;
import java.util.Scanner;
public class Fibonacci {
	public void fibonacci(int num) {
		int a = 0, b = 1, c = 0,i;
		System.out.println("Fibonacci Series.....");
		for(i=1; i<=num; i++) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
		}
	}
	public static void main(String[] args) {
		Fibonacci ob = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fibocanni Number : ");
		int num = sc.nextInt();
		ob.fibonacci(num);
		sc.close();
	}
}
//Console
/*
Enter the Fibonacci Number : 10
Fibonacci Series.....
0
1
1
2
3
5
8
13
21
34
*/
