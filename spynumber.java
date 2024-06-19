import java.util.*;
public class spynumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int i=sc.nextInt();
        int b,pro=1;
        int c=0;
        while (i>0)
        {
            b=i%10;
            pro=pro*b;
            i=i/10;
            c=c+b;
        }
        System.out.println("The product of the given number:" + pro);
        System.out.println("The sum of the given number:" + c);
        if (pro==c)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not a Spy Number");
        }
    }
}