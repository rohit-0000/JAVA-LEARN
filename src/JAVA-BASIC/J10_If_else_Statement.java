import java.util.Scanner;

public class J10_If_else_Statement
{
    public static void main(String[] args)
    {
        boolean isSunUP = false;
//        if(isSunUP==true)        // same as below
        if(isSunUP)
        {
            System.out.println("day");
        }
        else{
            System.out.println("night");

        int age;
        Scanner ck =new Scanner(System.in);
            System.out.println("Enter your age.");
            age = ck.nextInt();
            if ((age < 18)&&(age>0))
            {
                System.out.println("you are teen");
            }
            else if (age>=18)
            {
                System.out.println("You are now adult");
            }
            else
            {
                System.out.println("Your are not yet born");
            }
        }
    }
}
