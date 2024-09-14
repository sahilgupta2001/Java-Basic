import java.util.Scanner;
public class AgeValidation {
	
	public void validateage(int age) {
		if(age<18)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
	public static void main(String[] args) {
		AgeValidation ob = new AgeValidation();	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		ob.validateage(age);
		sc.close();
		}

}
