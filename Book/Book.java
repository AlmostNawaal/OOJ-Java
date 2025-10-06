import java.util.Scanner;

/*Create a class Book which contains four members: name,
author, price, num_pages. Include a constructor to set the
values for the members. Include methods to set and get the
details of the objects. Include a toString( ) method that
could display the complete details of the book. Develop a
Java program to create n book objects

Hint:Book[] books = new Book[n]; // array of Book objects

// To Create a Book object and store it in array

books[i] = new Book(name, author, price, pages);  

Explore : // toString() method to display complete details in the lab*/


public class Book 
{
    String name;
    String author;
    double price;
    int num_pages;
    
    void takeDetails()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name of the book:");
        this.name = input.nextLine();
        
        System.out.print("Enter author of the book:");
        this.author = input.nextLine();
        
        System.out.print("Enter price of the book:");
        this.price = input.nextFloat();
        
        System.out.print("Enter number of pages of the book:");
        this.num_pages = input.nextInt();
        
    }
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.print("Enter the number of books:");
        n = input.nextInt();
        
        Book[] books = new Book[n];
        
        for (int i =0; i<n; i++)
        {
            books[i] = new Book();
            books[i].takeDetails();
        }
        for (int i =0; i<n; i++)
        {
            System.out.println(books[i]);
        }
        
    }    
    
    public String toString()
    {
        return
        "\nName of the book:"+ this.name + '\n' +
        "Name of the Author:" + this.author +'\n' +
        "Number of pages in the book:" + this.num_pages + '\n' +
        "Price:"+ this.price;
    }
    }
    