package class3;

import java.util.Scanner;

public class Act32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double Num1, Num2, Num3, Num4;
		
		System.out.println("Please type four numbers:");
		Num1 = kb.nextDouble();
		Num2 = kb.nextDouble();
		Num3 = kb.nextDouble();
		Num4 = kb.nextDouble();
		
		
		if (Num1 > Num2 && Num1 > Num3 && Num1 > Num4) {
			System.out.println("The greatest number is: " + Num1);
			
		}
		else if (Num2 > Num3 && Num2 > Num4) {
			System.out.println("The greatest number is: " + Num2);
		}
		else if (Num3 > Num4) {
			System.out.println("The greatest number is: " + Num3);
			
		}
		else {
			System.out.println("The greatest number is: " + Num4);
		}
		
		
		
	kb.close();

	}

}
