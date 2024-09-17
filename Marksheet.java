import java.util.Scanner;

public class Marksheet {
	
	public static void main(String[] args) {
		int m1,m2,m3,m4,m5,total;
		float percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 5 Subject Number :");
		m1 = sc.nextInt();		// Input First Subject Number
		m2 = sc.nextInt();		// Input Second Subject Number
		m3 = sc.nextInt();		// Input Third Subject Number
		m4 = sc.nextInt();		// Input Fourth Subject Number
		m5 = sc.nextInt();		// Input Fifth Subject Number
		total = m1 + m2 + m3 + m4 + m5;		// Total NUmber of the Five Subjects
		System.out.println(total);
		
		percentage = total / 5;		// Percentage of the total 
		System.out.println(percentage);
		sc.close();
	}

}
