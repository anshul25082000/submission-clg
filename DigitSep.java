import java.util.Scanner;
public class DigitSep
{
    public static void main(String[] args)
    {
     int a,b,c,d,e,f;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter a five digit number");
     a = s.nextInt();
     b = a%10;
     a = a/10;
     c = a%10;
     a = a/10;
     d = a%10;
     a = a/10;
     e = a%10;
     a = a/10;
     f = a%10;
     a = a/10;
     if(a==0)
     {
     	System.out.println("your output is");
     	System.out.print(f+"   "+e+"   "+d+"   "+c+"   "+b);
     }
    }

}