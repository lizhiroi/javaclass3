package class3;

import java.util.Scanner;

public class Act335 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

	        System.out.println("Enter an integer:");
	        int number = kb.nextInt();

	        if (number % 5 == 0) {
	            System.out.println(number + " is a multiple of 5.");
	        } else {
	            System.out.println(number + " is not a multiple of 5.");
	        }

	        kb.close();

	}

}
