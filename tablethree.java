public class tablethree
{
    public static void main(String args[])
    {
        tablethree tt=new tablethree();
        tt.table();
    }
    int i=1;
    int n=3;
    int m=0;
    public void table()
    {
      while(i<=10)
      {
        m=i*n;
        System.out.println(i + "*" + n +"=" + m);
        i=i+1;  
      }
      
    }
}