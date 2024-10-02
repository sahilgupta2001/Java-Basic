package oops;

class A {
	public void methodA() {
		System.out.println("Method of Class A");
	}
}

public class SingleInheritanceDemo extends A {
	public static void main(String[] args) {
		SingleInheritanceDemo ob = new SingleInheritanceDemo();
		ob.methodA();
		
		A ob1 = new A();
		ob1.methodA();
		//A = parent class, SingleInheritanceDemo = child class
		A ob2 = new SingleInheritanceDemo();	
		ob2.methodA();
		
		//SingleInheritanceDemo ob3 = new A();
		//ob3.methodA();
	}
	
}
