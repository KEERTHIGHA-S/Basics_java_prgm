public class neonnumber 
{
    
public static void main(String[] args)
{
    neonnumber nn=new neonnumber();
   
    nn.multiply();
  
    
}
	
	public static void multiply()
	{
	    int m=9,a=9,n=0,mul=1;
	    while(a>0)
	{
		
		n=a%10;
		mul=mul*n;
		a=a/10;
	}
	 System.out.println(mul); 
	 
	 int sum=0,k=0;
	    while(mul>0)
	    {
	    k=mul%10;
	    sum=sum+k;
	    mul=mul/10;
	        
	    }
	  System.out.println(sum);
	  
	  
	  sum=sum%10;
	  m=m%10;
	  System.out.println(sum);
	  System.out.println(m);
	  if(sum==m)
	  {
	      System.out.println("crt");
	  }
	  else
	  {
	      System.out.println("No");
	  }
	}
	

	
}