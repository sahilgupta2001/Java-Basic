package oops;

class Aa {
	public void methodA() {
		System.out.println("Method of Class A");
	}
}

class Bb extends Aa {
	public void methodB() {
		System.out.println("Method of Class B");
	}
}

class Cc extends Bb {
	public void methodC() {
		System.out.println("Method of Class C");
	}
}

class D extends Aa {
	public void methodD() {
		System.out.println("Method of Class D");
	}
}

public class HeirarchalInheritanceDemo {
	public static void main(String[] args) {
		Bb ob = new Cc();
		ob.methodA();
		ob.methodB();
		
		
	}
}
