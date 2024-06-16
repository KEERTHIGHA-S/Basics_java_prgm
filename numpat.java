//Using function
public class numpat{
    public static void main(String[] args)
    {
        numpat p=new numpat();
        p.display(1);
    }
    public int display(int i)
    {
        if(i>9)
        {
            return 1;
        }
        if(i%3==1)
        {
            System.out.println();
        }
        System.out.print(i);
        int b=display(i+1);
        return b;
    }
}