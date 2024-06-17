public class neonnumber 
{
    
public static void main(String[] args)
{
    neonnumber nn=new neonnumber();
   
    nn.multiply();
  
    
}
	
	public static void multiply()
	{
	    int a=25,n=0,mul=1;
	    int h=0;
	    if(a>0)
	{
		
		h=a*a;
	}
	 System.out.println(h); 
	 
	 int sum=0,k=0;
	    while(h>0)
	    {
	    k=h%10;
	    sum=sum+k;
	    h=h/10;
	        
	    }
	  System.out.println(sum);
	  
	  
	 
	  
	  if(sum==a)
	  {
	      System.out.println("crt");
	  }
	  else
	  {
	      System.out.println("No");
	  }
	}
	

	
}