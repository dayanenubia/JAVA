package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calc {
	
	List<String> lastOperations = new ArrayList<String>(); 
	
	public Number sum(Number numberOne, Number numberTwo) {
		Number sum = numberOne.doubleValue() + numberTwo.doubleValue();
		return sum;
	}
	
	public int subtraction(int numberOne, int numberTwo) {
		int subtraction = numberOne - numberTwo;
		return subtraction;
	}
	
	public int multiplication(int numberOne, int numberTwo) {
		int multiplication = numberOne * numberTwo;
		return multiplication;
	}
	
	public double division(int numberOne, int numberTwo) {
		double division = numberOne / numberTwo;
		return division;
	}
}
