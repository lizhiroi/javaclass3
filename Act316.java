package class3;

import java.util.Scanner;

public class Act316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter the basic salary of the employee:");
        double salary = kb.nextDouble();

        double hra, da;

        if (salary <= 10000) {
            hra = 0.2 * salary;  
            da = 0.8 * salary;   
        } else if (salary <= 20000) {
            hra = 0.25 * salary; 
            da = 0.9 * salary;   
        } else {
            hra = 0.3 * salary;  
            da = 0.95 * salary;  
        }

        double grossSalary = salary + hra + da;

        System.out.println("Gross Salary: " + grossSalary);

	}

}
