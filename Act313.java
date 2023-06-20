package class3;

import java.util.Scanner;

public class Act313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation:");
        double a = kb.nextDouble();
        double b = kb.nextDouble();
        double c = kb.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("The quadratic equation has no real roots.");
        }
        kb.close();
    }

	}


