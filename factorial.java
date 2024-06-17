import java.util.*;
public class factorial
{
	public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number for factorial:");
    int fact=1;
    int i=sc.nextInt();
    while(i>=1)
    {
        fact=fact*i;
        i=i-1;
    }
	System.out.println(fact);
	 
}
}