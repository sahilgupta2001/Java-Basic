package oops;
class A1 {
	public A1() {
		System.out.println("Constructor of Class A");
	}
}
public class ConstructorDemo extends A1 {
	int a = 10;
	public ConstructorDemo() {
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		ConstructorDemo ob = new ConstructorDemo();
	}
}
