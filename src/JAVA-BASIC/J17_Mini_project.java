import java.util.Scanner;

public class J17_Mini_project
{
    public static void puzzle(/* set_number */){Scanner sc = new Scanner(System.in);
        int puz = 54,num,chance=10,ch=chance;
        System.out.println("\n\nWelcome to the puzzle");
        System.out.println("Guess the num . (Hints: Number is between 1 to 100 ) ");
        for(int i = 1 ; i <= ch ; i++)
        {
            System.out.println("Enter the number");
            num= sc.nextInt();
            if((num<puz)&&(num>0))
            {
                System.out.println("wrong guess");
                System.out.println("Hints: Puzzle number is greator than "+num);
                System.out.println("Your remaining chance is "+--chance);
            }
            else if ((num>puz)&&(num<=100))
            {
                System.out.println("wrong guess");
                System.out.println("Hints: Puzzle number is less than "+num);
                System.out.println("Your remaining chance is "+--chance);
            } else if ((num<0)||(num>100))
            {
                System.out.println("Oops you are unable to guess :)");
                System.out.println("The correct num is "+puz);
                break;

            } else
            {
                System.out.println("Congratulation!!\n your guess is totally correct");
                break;
            }
        }
    }




    public static void main(String[] args)
    {
//     Scanner set=new Scanner(System.in);
//        System.out.println("Set the NUMBER for puzzle which has been guessed b/w 1 to 100 ");
//        int set_num=set.nextInt();
//        puzzle(set_num);

        puzzle();
        System.out.println("The End");
    }
}
