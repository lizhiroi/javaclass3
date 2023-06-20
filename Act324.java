package class3;

import java.util.Scanner;

public class Act324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter the age of Ram:");
        int ramAge = kb.nextInt();

        System.out.println("Enter the age of Shyam:");
        int shyamAge = kb.nextInt();

        System.out.println("Enter the age of Ajay:");
        int ajayAge = kb.nextInt();

        int youngestAge = ramAge;

        if (shyamAge < youngestAge) {
            youngestAge = shyamAge;
        }

        if (ajayAge < youngestAge) {
            youngestAge = ajayAge;
        }

        if (youngestAge == ramAge) {
            System.out.println("Ram is the youngest.");
        } else if (youngestAge == shyamAge) {
            System.out.println("Shyam is the youngest.");
        } else {
            System.out.println("Ajay is the youngest.");
        }

        kb.close();
	}

}
