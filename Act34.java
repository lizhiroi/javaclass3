package class3;

import java.util.Scanner;

public class Act34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Num;
		Scanner kb = new Scanner (System.in);
		System.out.println("Type a number:");
		Num = kb.nextDouble();
		
		
		if (Num%5==0 && Num%11==0) {
			System.out.println("This number is divisible by 5 and 11");
		}
		else {
			System.out.println("This number is not divisible by 5 and 11");
		}
		kb.close();

	}
	

}

