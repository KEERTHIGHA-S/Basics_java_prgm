public class Recursive {
	public static void main(String[] args)
	{
		Recursive res=new Recursive();
		res.print(546);
		System.out.println("end");
		
	}

	private static void print(int i) 
	{

		int n;
		int sum=0;
		int b=i;
		while(i>0)
    {
			n=i%10;
			System.out.println(n);
			i=i/10;
			sum=sum*10+n;
		}
		System.out.println(sum);
	
	}
}