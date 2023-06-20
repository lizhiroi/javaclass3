package class3;

import java.util.Scanner;

public class Act36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Num;
		Scanner kb = new Scanner (System.in);
		System.out.println("Type the year number:");
		Num = kb.nextDouble();
		
		
		if (Num%4==0) {
			System.out.println("This is a leap year");
		}
		else {
			System.out.println("This is not a leap year");
		}
		kb.close();

	}

}
