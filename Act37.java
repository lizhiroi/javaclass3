package class3;

import java.util.Scanner;

public class Act37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Day;
		Scanner kb = new Scanner (System.in);
		System.out.println("Type a number of day:");
		Day = kb.nextInt();
		switch (Day) {
			case 1 : System.out.println("Monday");
			break;
			case 2 : System.out.println("Tuesday");
			break;
			case 3 : System.out.println("Wednsday");
			break;
			case 4 : System.out.println("Thursday");
			break;
			case 5 : System.out.println("Friday");
			break;
			case 6 : System.out.println("Saturday");
			break;
			case 7 : System.out.println("Sunday");
			break;
			default : System.out.println("This is not a weekday number");
			
			
		}
		kb.close();

	}

}
