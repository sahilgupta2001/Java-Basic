package loopcase;
import java.util.Scanner;
public class EvenOdd2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number : ");
		int number = sc.nextInt();
		String evenodd = (number%2 == 0) ? "even" : "odd";
		System.out.println(number + " is " + evenodd);
        sc.close();
	}

}
