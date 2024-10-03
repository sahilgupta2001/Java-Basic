package string;

public class StringBufferandBuilder2 {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("java");
		long starttimeforBuffer = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
		buffer.append("rules");
		}
		long actualTimeByBuffer=System.currentTimeMillis()- starttimeforBuffer;
		System.out.println("time taken by StringBUffer : " + actualTimeByBuffer);
		
		StringBuilder builder = new StringBuilder("java");
		long starttimeforBuilder = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
		builder.append("rules");
		}
		 long actualTimeByBuilder=System.currentTimeMillis()- starttimeforBuilder;
		System.out.println("time taken by StringBuilder : " + actualTimeByBuilder);
	}
}
/*
time taken by StringBuffer : 5
time taken by StringBuilder : 6
*/