public class StaticDemo {  
 static int a = 10;	
 public StaticDemo()	
{		
  a++;		
  System.out.println(a);
	}	
 public static void main(String[] args)	{		
  StaticDemo ob = new StaticDemo();		
  StaticDemo ob1 = new StaticDemo();		
  StaticDemo ob2 = new StaticDemo();	}}