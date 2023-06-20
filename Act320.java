package class3;

import java.util.Scanner;

public class Act320 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

	        System.out.println("Enter the employee's salary:");
	        double salary = kb.nextDouble();

	        double hra, da;

	        if (salary < 1500) {
	            hra = 0.10 * salary; 
	            da = 0.90 * salary; 
	        } else {
	            hra = 500; 
	            da = 0.98 * salary;
	        }

	        double grossSalary = salary + hra + da;

	        System.out.println("Gross Salary: " + grossSalary);

	        kb.close(); 
	}

}
