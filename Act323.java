package class3;

import java.util.Scanner;

public class Act323 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner kb = new Scanner(System.in);

	        System.out.println("Enter a five-digit number:");
	        int number = kb.nextInt();

	      
	        int reversedNumber = 0;
	        int temp = number;
	        while (temp != 0) {
	            int digit = temp % 10;
	            reversedNumber = (reversedNumber * 10) + digit;
	            temp /= 10;
	        }

	        System.out.println("Reversed Number: " + reversedNumber);

	    
	        if (number == reversedNumber) {
	            System.out.println("The original number and the reversed number are equal.");
	        } else {
	            System.out.println("The original number and the reversed number are not equal.");
	        }

	        kb.close(); 

	}

}
