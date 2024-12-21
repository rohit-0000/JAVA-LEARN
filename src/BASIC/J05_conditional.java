package BASIC;
import java.sql.SQLOutput;
import java.util.Scanner;
public class J05_conditional
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18)
        {
            System.out.println("You are adult and you are eligible for vote");
        }
        else if(age==18) {
            System.out.println("You became an adult you can vote if you have voter card");
        }
        else if(age<=0){
            System.out.println("You are not born yet");
        }
        else{
            System.out.println("You are kids go and study ");
        }
    }
}
class swtich_case
{
    public static void main(String[] args)
    {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the number between 1 to 8");
        int days=sca.nextInt();
        switch(days)
        {
            case 1 :
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("Its Thrusday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.print("Its Monaday");
                break;
            default:
                System.out.println("Envalid Entry");
                break;
        }
    }
}

