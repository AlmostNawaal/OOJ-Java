package SEE;

import java.util.Scanner;

import CIE.Internals;

public class Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students (n): ");
        int n = scanner.nextInt();
        
        // Arrays to hold objects for n students
        Externals[] studentsExternal = new Externals[n];
        Internals[] studentsInternal = new Internals[n];

        // --- 1. Data Entry ---
        for (int i = 0; i < n; i++) {
            System.out.println("\n==================================");
            System.out.println("Entering details for Student " + (i + 1));
            System.out.println("==================================");
            
            // Accept Personal details
            scanner.nextLine(); // Consume newline
            System.out.print("Enter USN: ");
            String usn = scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Semester: ");
            int sem = scanner.nextInt();
            
            // Create Externals object (which is also a Personal object)
            studentsExternal[i] = new Externals(usn, name, sem);
            
            // Accept Internals marks (using the Internals class from CIE)
            studentsInternal[i] = new Internals();
            studentsInternal[i].acceptInternalMarks(scanner);
            
            // Accept SEE marks (using the Externals class from SEE)
            studentsExternal[i].acceptSEEMarks(scanner);
        }

        // --- 2. Calculate and Display Final Marks ---
        System.out.println("\n\n##################################");
        System.out.println("        FINAL RESULTS");
        System.out.println("##################################");

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            studentsExternal[i].displayPersonalDetails();
            
            int[] internal = studentsInternal[i].getInternalMarks();
            int[] see = studentsExternal[i].getSEEMarks();
            
            System.out.println("\n| Subject | Internal (50) | SEE (100) | Final (150) |");
            System.out.println("|---------|---------------|-----------|-------------|");
            
            for (int j = 0; j < 5; j++) {
                int finalMarks = internal[j] + see[j];
                
                System.out.printf("| %-7s | %-13d | %-9d | %-11d |\n", 
                                  "Sub " + (j + 1), internal[j], see[j], finalMarks);
            }
        }
        
        scanner.close();
    }
}