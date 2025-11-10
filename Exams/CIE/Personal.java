package CIE;

import java.util.Scanner;

public class Personal {
    public String USN;
    public String name;
    public int sem;

    public Personal(String USN, String name, int sem) {
        this.USN = USN;
        this.name = name;
        this.sem = sem;
    }

    public void displayPersonalDetails() {
        System.out.println("USN: " + USN);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
    }
}