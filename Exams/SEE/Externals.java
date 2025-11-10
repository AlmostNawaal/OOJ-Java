package SEE;

import CIE.Personal;
import java.util.Scanner;


public class Externals extends Personal {

    private int[] seeMarks = new int[5];


    public Externals(String USN, String name, int sem) {
        super(USN, name, sem);
    }

    public void acceptSEEMarks(Scanner scanner) {
        System.out.println("\n--- Enter SEE Marks (Max 100) ---");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " SEE Marks (Max 100): ");
            seeMarks[i] = scanner.nextInt();
        }
    }

    public int[] getSEEMarks() {
        return seeMarks;
    }
}