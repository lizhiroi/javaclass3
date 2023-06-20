package class3;

import java.util.Scanner;

public class Act312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

	        System.out.println("Enter the lengths of the three sides of the triangle:");
	        double side1 = kb.nextDouble();
	        double side2 = kb.nextDouble();
	        double side3 = kb.nextDouble();

	       
	        if (side1 == side2 && side2 == side3) {
	           System.out.println("equilateral"); 
	        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
	        	System.out.println("isosceles"); 
	        } else {
	        	System.out.println("scalene");
	        }

	     kb.close();
	}

}
