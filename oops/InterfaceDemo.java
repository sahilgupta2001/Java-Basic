package oops;
interface RBINew
{
	
public void roi();
}
class HDFC implements RBINew
{

	@Override
	public void roi() {
		System.out.println("ROI would be 10%");
		
	}	
}
class ICICI implements RBINew
{
	public void roi() {
		System.out.println("ROI would be 12%");
	}

}
public class InterfaceDemo {
 public static void main(String[] args) {
	 RBINew ob = new ICICI();
	 ob.roi();
	 
	 ICICI ob2 = new ICICI();
	 ob2.roi();
}
}
