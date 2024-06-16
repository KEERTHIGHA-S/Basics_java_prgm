public class Recursivenum {
    public static void main(String[] args) 
    {
        Recursivenum num=new Recursivenum();
        num.number(1);
        
    }

	private int number(int i) 
	{
		if(i>5)
		{
			return 1;
			
		}
		System.out.println(i);
		int k=number(i+1);
		return k;
		}
	
	}
