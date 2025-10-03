package programming_paradigm;

import java.util.Scanner;

public class procedural {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter two number: ");
			int number1 = input.nextInt();
			int number2 = input.nextInt();
			int sum = add(number1, number2);
			int product = multipl(number1, number2);
			int divide = divide(number1, number2);
			int subtract = subtract(number1, number2);
			int mod = mod(number1, number2);
			int squire = squire(number1, number2);
			System.out.println("the sum of two numbers: " + sum);
			System.out.println("the product of two numbers: " + product);
			System.out.println("The divide of two numbers: " + divide);
			System.out.println("the subtract of two numbers: " + subtract);
			System.out.println("the mod of two numbers: " + mod);
			System.out.println("the squire of two numbers: " + squire);
		} catch (ArithmeticException e) {
			System.out.println("you can't divided by zero");
		}
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int multipl(int num1, int num2) {
		return num1 * num2;
	}

	public static int divide(int num1, int num2) {
		return num1 / num2;
	}

	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public static int mod(int num1, int num2) {
		return num1 % num2;
	}

	public static int squire(int num1, int num2) {
		return num1 ^ num2;
	}
}
