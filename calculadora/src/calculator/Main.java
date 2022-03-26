package calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println("Soma: 2 + 9: " + calc.sum(2, 9));
		System.out.println("Soma: 2 + 9: " + calc.subtraction(9, 2));
		System.out.println("Soma: 2 + 9: " + calc.multiplication(2, 9));
		System.out.println("Soma: 2 + 9: " + calc.division(9, 2));
		
		System.out.println("Operações realizadas: ");
		
	}
}
