package oops;

public class Method_overloading {
	public void getTrainDetails(int pnr) {
		System.out.println("your train details according to : " + pnr);
	}
	
	public void getTrainDetails(String trainName) {
		System.out.println("your train Details according to : " + trainName);
	}
	
	public void getTrainDetails(String frmStation, String toStation) {
		System.out.println("your Train details according to : " + toStation);
	}
	public static void main(String[] args) {
		Method_overloading ob = new Method_overloading();
		ob.getTrainDetails(23415);
	}
}
//Console
//your train details according to : 23415