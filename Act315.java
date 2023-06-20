package class3;

import java.util.Scanner;

public class Act315 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner kb = new Scanner(System.in);

	        System.out.println("Enter the marks obtained in Physics:");
	        int physicsMarks = kb.nextInt();

	        System.out.println("Enter the marks obtained in Chemistry:");
	        int chemistryMarks = kb.nextInt();

	        System.out.println("Enter the marks obtained in Biology:");
	        int biologyMarks = kb.nextInt();

	        System.out.println("Enter the marks obtained in Mathematics:");
	        int mathematicsMarks = kb.nextInt();

	        System.out.println("Enter the marks obtained in Computer:");
	        int computerMarks = kb.nextInt();

	        int totalMarks = 500; 
	        int obtainedMarks = physicsMarks + chemistryMarks + biologyMarks + mathematicsMarks + computerMarks;
	        double percentage = (obtainedMarks * 100.0) / totalMarks;

	        String grade;
	        if (percentage >= 90) {
	            grade = "A";
	        } else if (percentage >= 80) {
	            grade = "B";
	        } else if (percentage >= 70) {
	            grade = "C";
	        } else if (percentage >= 60) {
	            grade = "D";
	        } else if (percentage >= 40) {
	            grade = "E";
	        } else {
	            grade = "F";
	        }

	        System.out.println("Percentage: " + percentage);
	        System.out.println("Grade: " + grade);
	        kb.close();

	}

}
