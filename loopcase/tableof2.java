package loopcase;

public class tableof2 {			// create a class to print table of 2
	public void method() {
		for(int i=1; i<=10; i++)		// create a loop to start from 1 to 10
		{
			System.out.println("2 * " + i + " = " + 2*i);	// print a table of 2 ref -2 * 1 = 2 ...
		}
	}
	public static void main(String[] args) {
		tableof2 ob = new tableof2();
		ob.method();
	}

}
//Results
/*
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
2 * 10 = 20
*/
