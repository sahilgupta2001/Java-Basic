package string;

public class StringBufferandBuilder {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("java");
		buffer.append("rules");
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("java");
		builder.append("rules");
		System.out.println(builder);
	}
}
/*
javarules
javarules
*/