package oops;
public class thisdemo {

	String name;
	int rollNu;
	public void setValue(String name, int rollNu)
	{
		this.name = name;
		this.rollNu = rollNu;
	}
	public void printDetails()
	{
		System.out.println("name is : " + name);
		System.out.println("rollNu is : " + rollNu);
	}
	public static void main(String[] args) {
		thisdemo ob = new thisdemo();
		ob.setValue("aman", 2);
		ob.printDetails();
	}
}
