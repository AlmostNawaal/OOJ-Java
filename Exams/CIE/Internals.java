package CIE;

import java.util.Scanner;

public class Internals {
    
    protected int[] internalMarks = new int[5];

    public void acceptInternalMarks(Scanner scanner) {
        System.out.println("\n--- Enter Internal Marks (Max 50) ---");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " Internal Marks (Max 50): ");
            internalMarks[i] = scanner.nextInt();
        }
    }

    public int[] getInternalMarks() {
        return internalMarks;
    }
}