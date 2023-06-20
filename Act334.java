package class3;

import java.util.Scanner;

public class Act334 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner kb = new Scanner(System.in);

	        System.out.println("Enter the first number:");
	        double num1 = kb.nextDouble();

	        System.out.println("Enter the second number:");
	        double num2 = kb.nextDouble();

	        System.out.println("Enter the operator (+, -, *, /):");
	        char operator = kb.next().charAt(0);

	        double result;

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Cannot divide by zero.");
	                }
	                break;
	            default:
	                System.out.println("Invalid operator.");
	                break;
	        }

	        kb.close();

	}

}
