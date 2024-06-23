public class addingone
{
    public static void main(String[] args)
    {
       int a[] = {1,2,3,4,5};
       int lenn=a.length;
     
       int b[] = new int[lenn+1];
       int no=66;
       int len=b.length;
       b[len-1]=no;
       for (int i=0; i<a.length; i++)
       {
           b[i]=a[i];
       }
        for (int i=0; i<b.length; i++)
        {
           System.out.println(b[i]); 
        }
           
      
       }
    }
