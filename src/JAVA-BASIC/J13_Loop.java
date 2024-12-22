import java.util.Scanner;

public class J13_Loop
{
    public static void main(String[] args)
    {
        //for loop
        // Print the table of any number

        Scanner sk =new Scanner(System.in);
        System.out.println("Enter the number ");
        int num =sk.nextInt();

        for (int i = 1 ;i<11;i++)
        {
            System.out.println(i*num);
        }

        //while loop
        //Print factorial of any number

        System.out.println("Enter number for factorial");
        int num1 = sk.nextInt();
        int i=num1,pro=1;
        while(i>0)
        {
            {
                pro=pro*i;
                i--;
            }
        }
        System.out.println("The factorial of "+num1+" is "+pro);

        // do- while loop
        // write a fibbonacci series of any number

        System.out.println("Enter the number for fibbbonacci series");
        int num2 = sk.nextInt();
        int first_num= 0 , sec_num = 1 , next_num,j=0;
        System.out.println("The fibbonacci series upto "+num2+" Term is :");
        do
        {
            if(j==0){
                System.out.println(0);
            }
            if(j==1){
                System.out.println(1);
            }
         next_num=first_num+sec_num;
         first_num=sec_num;
         sec_num=next_num;
            System.out.println(next_num);
         j++;
        }
        while (j<num2-1);

    }
}