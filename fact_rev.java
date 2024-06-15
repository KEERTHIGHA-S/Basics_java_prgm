package basics;

public class Factorialrev {

	public static void main(String[] args) {
		Factorialrev f=new Factorialrev();
		int result=f.Fact(5);
	
System.out.println(result);
	}

	private int Fact(int i) {
		
		if(i==1)
			{
			return 1;
			}
		int k=Fact(i-1);
		return i*k;
	}

}