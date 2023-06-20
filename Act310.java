package class3;

import java.util.Scanner;

public class Act310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ang1, ang2, ang3;
		Scanner kb = new Scanner (System.in);
		System.out.println("Put the three angles:");
		ang1 = kb.nextInt();
		ang2 = kb.nextInt();
		ang3 = kb.nextInt();
		
		if (ang1+ang2+ang3 == 180) {
			System.out.println("this triangle is valid");
		}
		else {
			System.out.println("this triangle is invalid");
		}
	kb.close();

	}

}
