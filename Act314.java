package class3;

import java.util.Scanner;

public class Act314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the cost price of the item:");
        double costPrice = kb.nextDouble();

        System.out.println("Enter the selling price of the item:");
        double sellingPrice = kb.nextDouble();

        double profitLoss = sellingPrice - costPrice;

        if (profitLoss > 0) {
            System.out.println("Profit: " + profitLoss);
        } else if (profitLoss < 0) {
            System.out.println("Loss: " + Math.abs(profitLoss));
        } else {
            System.out.println("No Profit, No Loss");
        }
        
        kb.close();
    

	}

}
