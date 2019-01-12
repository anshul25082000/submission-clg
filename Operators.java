import java.util.Scanner;
public class Operators
{
	public static void main(String[] args)
	{
		int a=12;
		int b=6;
		int c;
		int d;
	    System.out.println("Value of a="+a+"Value of b="+b);
	    System.out.println("Press '1' for add");
	    System.out.println("Press '2' for subtraction");
	    System.out.println("Press '3' for multiplication");
	    System.out.println("Press '4' for division");
        Scanner s = new Scanner(System.in);
        if(s==1)
        {
        	c=a+b;
        	System.out.println("Sum is="+c);
        }
        else if(s==2)
        {
        	c=a-b;
        	System.out.println("Difference is="+c);
        }
        else if(s==3)
        {
        	c=a*b;
        	System.out.println("Product is="+c);
        }else if(s==4)
        {
        	c=a/b;
        	System.out.println("Quotient is="+c);
        }
        else
        {
        	System.out.println("Invalid INPUT");
        }
	}
}