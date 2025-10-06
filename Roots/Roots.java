import java.util.Scanner;


public class Roots
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a:");
        double a = input.nextFloat();

        System.out.print("enter b:");
        double b = input.nextFloat();

        System.out.print("enter c:");
        double c = input.nextFloat();


        if ( a == 0.0)
        {
            System.out.print("this is not a quadratic equation.");
            input.close();
            return;
        }

        double d = b*b - 4*a*c;
        
        if (d < 0)
        {
            System.out.print("No real roots exist.");
            input.close();
            return;
        }
        else if (d>0)
        {
            double r1 = (-b+Math.pow(d,0.5))/2*a;
            double r2 = (-b-Math.pow(d,0.5))/2*a;
            
            System.out.print("the roots of the equation are: ");
            System.out.print(r1);
            System.out.print(" and ");
            System.out.print(r2);
        }
        else if(d == 0)
        {
            double r = (-b+Math.pow(d,0.5))/2*a;
            System.out.print("the root of the equation is:");
            System.out.print(r);

        }
        //System.out.print(a);
        input.close();

        
    }
}