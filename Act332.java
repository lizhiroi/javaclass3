package class3;

import java.util.Scanner;

public class Act332 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int number = kb.nextInt();

        int count = 0;
        int temp = number;

   
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);

        kb.close(); 

	}

}
