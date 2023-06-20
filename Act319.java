package class3;

import java.util.Scanner;

public class Act319 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter the current year:");
        int currentYear = kb.nextInt();

        System.out.println("Enter the year of joining the organization:");
        int joiningYear = kb.nextInt();

        int yearsOfService = currentYear - joiningYear;

        if (yearsOfService > 3) {
            double bonus = 2500; 
            System.out.println("Congratulations! You are eligible for a bonus of Rs. " + bonus);
        }

        kb.close(); 

	}

}
