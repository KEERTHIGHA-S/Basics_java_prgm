public class fibonacciseries
{
    public static void main(String[] args)
    {
        int fn=0;
        int sn=1;
        int i=5;
        int c=0;
        while(i>=0)
        {
            c=fn+sn;
            
            fn=sn;
            sn=c;
            System.out.println(c);
            i=i-1;
        }
        
    }
}