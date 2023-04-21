package calculator;
import java.io.IOException;

public class BasicInput {

	public static String readString() throws IOException {
		byte b[] = new byte[255];
		int length = System.in.read(b);
		byte bt[] = new byte[length-1];
		System.arraycopy(b,0,bt,0,length-1);
		
		String s = new String(bt);
		return s;
	}
	
	public  static float readFloat() throws IOException {
		String s = readString();
		float f = Float.parseFloat(s);
		return f;
	}
	public static Integer readInteger() throws IOException {
		String s = readString();
	Integer i = Integer.parseInt(s.trim());
		return i;
	}
	
}