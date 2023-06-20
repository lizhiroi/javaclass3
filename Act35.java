package class3;

import java.util.Scanner;

public class Act35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Num;
		Scanner kb = new Scanner (System.in);
		System.out.println("Type a number:");
		Num = kb.nextDouble();
		
		
		if (Num%2==0) {
			System.out.println("This number is even");
		}
		else {
			System.out.println("This number is odd");
		}
		kb.close();

	}

}
