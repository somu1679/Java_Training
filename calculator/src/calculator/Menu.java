package calculator;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
	
	public void showMETHOD() throws IOException {
	    
	    @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	    int result;
	   do {
		   System.out.println("Select Anyone Option listed below:" + '\n' + "1.Addition" + '\n'
		    		+ "2.Subtraction" + '\n'
		    		+ "3.Multiplication" + '\n'
		    		+ "4.Division" + '\n'
		    		+ "5.Square" + '\n'
		    		+ "6.Cube");
	     result = in.nextInt();
	   } while(result < 0 || result > 6);
	   System.out.println("Selection is: " + result);

	   System.out.println("Please Enter first number");
	   int number1 =BasicInput.readInteger();
	   System.out.println("Please Enter second number");
	   int number2 =BasicInput.readInteger();	   
	   
	   Maths m = new Maths();
	   switch (result) {
	      case 1:
			m.add(number1, number2);
	        break;
	      case 2:
				m.substract(number1, number2);
		        break;
	      case 3:
				m.multiply(number1, number2);
		        break;
	      case 4:
				m.divide(number1, number2);
		        break;
	      case 5:
				m.setSquare(number1, number2);
		        break;
	      case 6:
				m.setCube(number1, number2);
		        break;
	   }

	}
}
