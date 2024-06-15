public class Extractoneno {
	public static void main(String args[])
	{
int res=365,pal=1;

for(int i = 1;i<=3;i++ )
{

	pal=res%10;
	
	res=res/10;

	System.out.println(pal);
}
}
}