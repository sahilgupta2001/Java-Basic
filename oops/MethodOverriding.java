package oops;

class Gst {
	public void calcGst(int amount) {
		float gst = (amount*5)/100;
		System.out.println(gst);
	}
}

public class MethodOverriding extends Gst {
	public void calcGst(int amount) {
		float gst = (amount*18)/100;
		System.out.println(gst);
	}
	public static void main(String[] args) {
		Gst ob = new MethodOverriding();	//Gst = parent class, MethodOverriding = child class
		ob.calcGst(100);	//18.0
		
		MethodOverriding ob1 = new MethodOverriding();
		ob1.calcGst(100);	//18.0
	}
}
//Console
//18.0