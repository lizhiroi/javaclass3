package class3;

import java.util.Scanner;

public class Act326 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

	        System.out.println("Enter a number:");
	        int number = kb.nextInt();

	        int absoluteValue = Math.abs(number);

	        System.out.println("Absolute Value: " + absoluteValue);

	        kb.close();

	}

}
