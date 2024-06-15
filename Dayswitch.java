public class Dayswitch
{
    public static void main(String[] args)
    {
        String s="Tuesday";
        switch(s)
        {
            case "Monday":
                System.out.println("It is working day");
                break;
            case "Tuesday":
                System.out.println("It is working day\t" +s);
                break;
            case "Wednesday":
                System.out.println("It is working day");
                break;
            case "Thursday":
                System.out.println("It is working day");
                break;
            case "Friday":
                System.out.println("It is working day");
                break;
            case "Saturday":
                System.out.println("It is holiday");
                break;
            case "Sunday":
                System.out.println("It is holiday");
                break;
            default:
                System.out.println("Give crt data");
            
        }
    }
}