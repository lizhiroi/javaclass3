package class3;

import java.util.Scanner;

public class Act311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double L1, L2, L3;
		Scanner kb = new Scanner (System.in);
		System.out.println("Put the three length of triangle:");
		L1 = kb.nextDouble();
		L2 = kb.nextDouble();
		L3 = kb.nextDouble();
		
		if ( L1+L2 > L3 && L2 + L3 > L1 && L3 + L1 > L2) {
			System.out.println("this triangle is valid");
		}
		else {
			System.out.println("this triangle is invalid");
		}
	kb.close();

	}

}
