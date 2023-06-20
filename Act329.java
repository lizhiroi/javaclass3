package class3;

import java.util.Scanner;

public class Act329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner kb = new Scanner(System.in);

	        System.out.println("Enter the number of days the book is late:");
	        int daysLate = kb.nextInt();

	        if (daysLate <= 0) {
	            System.out.println("No fine. Book returned on time.");
	        } else if (daysLate <= 5) {
	            double fine = daysLate * 0.5;
	            System.out.println("Fine: " + fine + " paise");
	        } else if (daysLate <= 10) {
	            System.out.println("Fine: 1 rupee");
	        } else if (daysLate <= 30) {
	            System.out.println("Fine: 5 rupees");
	        } else {
	            System.out.println("Membership cancelled. Book returned after 30 days.");
	        }

	        kb.close(); 

	}

}
