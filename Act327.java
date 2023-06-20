package class3;

import java.util.Scanner;

public class Act327 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner kb = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length = kb.nextDouble();

        System.out.println("Enter the breadth of the rectangle:");
        double breadth = kb.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        if (area > perimeter) {
            System.out.println("The area of the rectangle is greater than its perimeter.");
        } else if (area < perimeter) {
            System.out.println("The perimeter of the rectangle is greater than its area.");
        } else {
            System.out.println("The area and perimeter of the rectangle are equal.");
        }

        kb.close();

	}

}
