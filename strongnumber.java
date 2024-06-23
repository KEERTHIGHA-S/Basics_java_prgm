public class strongnumber
{
    public static void main(String[] args)
    {
        
        int i=145;
        int c;
        int sum=0;
        int temp;
        temp=i;
        while(temp>0)
        {
            c=temp%10;
            temp=temp/10;
          
            int fact=1;
            
            while(c>=1)
            {
                fact=fact*c;
                
                c=c-1;
                
                
            }
            System.out.println("the fact value" + fact);
            sum=sum+fact;
        
            
        }
        System.out.println(sum);
        
         if(sum==i)
         {
             System.out.println("This is strong number");
         }
         else
         {
             System.out.println("This is not a strong number");
         }
    }
   
}