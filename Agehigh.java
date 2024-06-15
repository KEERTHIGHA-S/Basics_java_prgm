class Agehigh {
    public static void main(String[] args) {
        int a=4;
        int b=7;
        int c=2;
        int d=1;
        if (a>b && a>c && a>d)
        {
            System.out.println(a + "\ta is greater");
        }
        else if (b>c && b>d)
        {
            System.out.println(b + "\tb is greater");
        }
        else if(c>d)
        {
            System.out.println(c + "\tc is greater");
        }
        else
        {
            System.out.println(d + "\td is greater");
        }
        
    }
}