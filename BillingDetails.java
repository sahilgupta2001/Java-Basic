import java.util.Scanner; 

public class BillingDetails {
	
	public void totalprice(int price) {
		float gst = (price*18)/100;
		float totalprice = gst + price;
		System.out.println("gst on given product " +gst);
		System.out.println("total calculated price " +totalprice);
	}
	
	public static void main(String[] args) {
		BillingDetails bd = new BillingDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :");		//Enter your First/last name only 
		String name = sc.next();						//
		System.out.println("Enter your Number :");		//Enter your Mobile Number
		long number = sc.nextLong();
		System.out.println("Enter your Product Name :");//Enter your Product Name
		String pname = sc.next();
		System.out.println("Enter your Product Price :");//Enter your Product Price
		int price = sc.nextInt();
		bd.totalprice(price);
		sc.close();
	}
}
