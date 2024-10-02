package oops;

class B {
	public void methodB() {
		System.out.println("Method of Class B");
	}
}

class C extends B {
	public void methodC() {
		System.out.println("Method of Class C");
	}
}

public class MultipleInheritanceDemo extends C {
	public static void main(String[] args) {
		MultipleInheritanceDemo ob = new MultipleInheritanceDemo();
		ob.methodB();
		ob.methodC();
		
		B ob1 = new B();
		ob1.methodB();
		
		C ob2 = new C();
		ob2.methodB();
		ob2.methodC();
		
		C ob3 = new MultipleInheritanceDemo();
		ob3.methodB();
		ob3.methodC();
		//B = parent class, C = child class
		B ob4 = new C();	
		ob4.methodB();
	}
}
/*
Method of Class B
Method of Class C
Method of Class B
Method of Class B
Method of Class C
Method of Class B
Method of Class C
Method of Class B
 */