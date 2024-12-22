import java.util.Scanner;

public class J12_switch
{
    public static void main(String[] args)
    {
        Scanner ck = new Scanner(System.in);
        System.out.println("Enter your 1 to 7 according to day like 1 is monday,2 is tuesday ");
        int day = ck.nextInt();
        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Enter only 1 to 7 ");
        }
    }
}
