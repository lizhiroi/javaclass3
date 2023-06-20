package class3;

import java.util.Scanner;

public class Act39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt;
		Scanner kb = new Scanner(System.in);
		System.out.println("Type the amount:");
		amt = kb.nextInt();
		int[] notes = {100, 50, 20, 10, 5, 2, 1};  
        int[] noteCount = new int[notes.length];  
        int totalNotes = 0;
        for (int i = 0; i < notes.length; i++) {
            if (amt >= notes[i]) {
                noteCount[i] = amt / notes[i];
                amt %= notes[i];
                totalNotes += noteCount[i];
            }
        }

        System.out.println("Total number of notes for amount " + amt + " is " + totalNotes);
        System.out.println("Note count: ");
        for (int i = 0; i < notes.length; i++) {
            if (noteCount[i] > 0) {
                System.out.println(notes[i] + " : " + noteCount[i]);
            }
        }
		kb.close();
		

	}

}
