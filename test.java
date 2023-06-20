package class3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int amount = 4567;
	        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};  // Array of available notes
	        int[] noteCount = new int[notes.length];  // Array to store the count of each note

	        int totalNotes = 0;
	        for (int i = 0; i < notes.length; i++) {
	            if (amount >= notes[i]) {
	                noteCount[i] = amount / notes[i];
	                amount %= notes[i];
	                totalNotes += noteCount[i];
	            }
	        }

	        System.out.println("Total number of notes for amount " + amount + " is " + totalNotes);
	        System.out.println("Note count: ");
	        for (int i = 0; i < notes.length; i++) {
	            if (noteCount[i] > 0) {
	                System.out.println(notes[i] + " : " + noteCount[i]);
	            }
	        }
		

	}

}
