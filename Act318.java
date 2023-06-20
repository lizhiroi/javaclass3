package class3;

import java.util.Scanner;

public class Act318 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner kb = new Scanner(System.in);

	        System.out.println("Enter the quantity purchased:");
	        int quantity = kb.nextInt();

	        System.out.println("Enter the price per item:");
	        double pricePerItem = kb.nextDouble();

	        double totalExpenses = quantity * pricePerItem;

	        if (quantity > 100) {
	            double discount = 0.10 * totalExpenses; 
	            totalExpenses -= discount;
	        }

	        System.out.println("Total Expenses: " + totalExpenses);

	        kb.close(); 

	}

}
