package class3;

import java.util.Scanner;

public class Act33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a)
		Scanner kb = new Scanner (System.in);
		double WCa, WOn, WMe, TLbs, Total;
		System.out.println("How many lbs of carrots do you want:");
		WCa = kb.nextDouble();
		System.out.println("How many lbs of onions do you want:");
		WOn = kb.nextDouble();
		System.out.println("How many lbs of meat do you want:");
		WMe = kb.nextDouble();
		
		TLbs = WCa + WOn + WMe;
		System.out.println("Total lbs is: " + TLbs);
		
		//b) and c)
		
		int ans;
		System.out.println("Do you want to pay cash? 1 for Cash, 2 for Card, type 1 or 2");
		
		ans = kb.nextInt();
		
		
		if (ans == 1) {
			Total = 2 * WCa + 4 * WOn + 10 * WMe;
			System.out.println("The total amount is: " + Total + "$");
		}
		else if (ans == 2) {
			Total = (2 * WCa + 4 * WOn + 10 * WMe) * 1.13;
			System.out.println("The total amount is: " + Total + "$");
			
		}
		
		
		kb.close();

	}

}
