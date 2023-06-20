package class3;

import java.util.Scanner;

public class Act321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner kb = new Scanner(System.in);

	        System.out.println("Enter the marks obtained in 5 subjects:");
	        int[] marks = new int[5];
	        for (int i = 0; i < marks.length; i++) {
	            marks[i] = kb.nextInt();
	        }

	        int totalMarks = 0;
	        for (int mark : marks) {
	            totalMarks += mark;
	        }

	        double percentage = (totalMarks / 5); 

	        String division;

	        if (percentage >= 60) {
	            division = "First Division";
	        } else if (percentage >= 50 && percentage < 60) {
	            division = "Second Division";
	        } else if (percentage >= 40 && percentage < 50) {
	            division = "Third Division";
	        } else {
	            division = "Fail";
	        }

	        System.out.println("Division: " + division);

	        kb.close(); 

	}

}
