package calculator;

public class Maths {

	public int add(int a, int b) {
		int result = a+b;
		System.out.println("The addition value is "  + result);
		return result;

	}
	
	public void substract(int a, int b) {
		int result = a-b;
		System.out.println("The substract value is "  + result);

	}
	
	public void multiply(int a, int b) {
		int result = a*b;
		System.out.println("The Multipication value is "  + result);

	}
	
	public void divide(int a, int b) {
		int result = a/b;
		System.out.println("The Division value is "  + result);

	}
	
	public void setSquare(int a,int b) {
		int result = a*a;
		System.out.println("The Sqaure value of first number is "  + result);
		int result1 = b*b;
		System.out.println("The Sqaure value of second number is "  + result1);

	}
	
	public void setCube(int a, int b) {
		int result = a*a*a;
		System.out.println("The Cube value of first number is "  + result);
		int result1 = b*b*b;
		System.out.println("The Cube value of second number is "  + result1);

	}

}
