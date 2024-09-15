import java.util.Scanner;

public class Calculations3 {
int a;
int b;
int c;
int d;

	public void addtwonumber(int a, int b, int c) {
		d = c + a + b;
		System.out.println(d);
	}
	
	public void subtwonumber(int a, int b) {
		d = a - b;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Calculations3 ob = new Calculations3();
		Scanner sc  = new Scanner(System.in);
		System.out.println("Input numbers :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		ob.addtwonumber(num1, num2, num3);
		ob.subtwonumber(num1, num2);
        sc.close();
	}

}
