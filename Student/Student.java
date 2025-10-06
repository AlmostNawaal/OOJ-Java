import java.util.Scanner;

/*Develop a Java program to create a class Student with
members usn, name, an array credits and an array marks.
Include methods to accept and display details and a
method to calculate SGPA of a student.*/


public class Student
{
    String USN;
    String name;
    int[] marks;
    int[] credits;
    int n;

    void takeDetails()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter USN:");
        this.USN = input.nextLine();
        System.out.print("Enter name:");
        this.name = input.nextLine();
        System.out.print("Enter number of subjects:");
        this.n = input.nextInt();

        this.marks = new int[n];
        this.credits = new int[n];


        for (int i = 0; i<n; i++)
        {
            System.out.print("Enter marks in subject");
            System.out.print(i+1);
            System.out.print(":");
            this.marks[i] = input.nextInt();
            
            System.out.print("Enter credits of subject");
            System.out.print(i+1);
            System.out.print(":");
            this.credits[i] = input.nextInt();
        }
    }

    void showDetails()
    {
        System.out.print("Student Details:");
        System.out.print("USN:"+this.USN+"\n");
        System.out.print("name:"+this.name+"\n");
        for (int i = 0; i<n; i++)
        {
            System.out.print("marks in subject "+(i+1)+" are:");
            System.out.println(this.marks[i]);
        }
    }

    double SGPA() 
    {
        double totalGradePoints = 0;
        int totalCredits = 0;
        
        for (int i = 0; i < n; i++) 
        {
            totalCredits += this.credits[i];

            int gradePoints;
            if (this.marks[i] >= 90) {
                gradePoints = 10;
            } else if (this.marks[i] >= 80) {
                gradePoints = 9;
            } else if (this.marks[i] >= 70) {
                gradePoints = 8;
            } else if (this.marks[i] >= 60) {
                gradePoints = 7;
            } else if (this.marks[i] >= 50) {
                gradePoints = 6;
            } else {
                gradePoints = 0;
            }
            totalGradePoints += (double) gradePoints * this.credits[i];

        }
        return totalGradePoints/totalCredits;

    }
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.takeDetails();
        s1.showDetails();
        System.out.println(s1.SGPA());

    }
}