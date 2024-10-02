//one to ten
package loopcase;

public class one_to_ten {		// create a class to print numbering 1 to 10
	public void print1to10() {
		for(int i=1; i<=10; i++) 	//start a loop to print 1 to 10
		{
			System.out.println(i);	//print 1 to 10
		}
	}
	public static void main(String[] args) {
		one_to_ten ob = new one_to_ten();
		ob.print1to10();
	}
}
// Results
/*
1
2
3
4
5
6
7
8
9
10
*/
