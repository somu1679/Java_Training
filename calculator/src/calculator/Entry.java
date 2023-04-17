package calculator;

public class Entry {

	public static void main(String[] args) {
		int a = 200;
		int b = 30;
		Maths calc = new Maths();
		calc.add(a, b);
		calc.substract(a, b);
		calc.multiply(a, b);
		calc.divide(a, b);
		calc.setSquare(a);
		calc.setCube(a);
	}

}
