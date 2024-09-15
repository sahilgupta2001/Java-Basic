import java.util.Scanner;

public class BillingDetails2 {
	
	public float calgst(int price) {
		float gst = (price*18)/100;
		return gst;
	}
	
	public static void main(String[] args) {
		BillingDetails2 bd = new BillingDetails2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");			//Enter your First/last Name
		String name = sc.next();							//String because we use alphabet
		System.out.println("Enter your Mobile Number : ");  //Enter your Mobile Number 
		long number = sc.nextLong();						//Long because we use many number
		System.out.println("Enter your Product Name : ");	//Enter your Product Name
		String pname = sc.next();							//String because we use alphabet
		System.out.println("Enter your Product Price : ");	//Enter your Product Price

		int price = sc.nextInt();
		float gstcal = bd.calgst(price);
		float totalprice = gstcal + price;
		System.out.println("Customar Name : " +name);
		System.out.println("Mobile Number of the Customer : " +number);
		System.out.println("Product Purchased : " +pname);
		System.out.println("Price of the Producy is : " +price);
		System.out.println("Gst Calculated : " +gstcal);
		System.out.println("Total Price : " +totalprice);
        sc.close();
	}

}
