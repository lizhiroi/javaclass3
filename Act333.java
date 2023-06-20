package class3;

import java.util.Scanner;

public class Act333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

	        System.out.println("Enter the first number:");
	        int num1 = kb.nextInt();

	        System.out.println("Enter the second number:");
	        int num2 = kb.nextInt();

	        System.out.println("Enter the third number:");
	        int num3 = kb.nextInt();

	        if (num1 < num2 && num2 < num3) {
	            System.out.println("Numbers are in increasing order.");
	        } else if (num1 > num2 && num2 > num3) {
	            System.out.println("Numbers are in decreasing order.");
	        } else {
	            System.out.println("Numbers are neither in increasing nor in decreasing order.");
	        }

	        kb.close(); 

	}

}
