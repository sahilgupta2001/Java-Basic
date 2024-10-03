package oops;


public class EncapsulationDemo {

	private String name;
	private int number;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
	public int getNumber()
	{
		return number;
	}
	public static void main(String[] args)
	{
		EncapsulationDemo ob = new EncapsulationDemo();
		ob.setName("aman");
		System.out.println(ob.getName());
		
	}
}
