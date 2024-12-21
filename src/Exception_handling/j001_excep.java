package Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class j001_excep {
    /*
    Exception : - Abnormal Condition during Runtime .
    >>> keywords : Try , catch , finally , throw , throws
     */
    public static void main(String[] args)
    {
        System.out.println("Program Started .....");
        Scanner sc=new Scanner(System.in);

        try {
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            if(n1<10) throw new greator("n1 is less than  10");
            if(n2>100) throw new greator();
            int div = n1 / n2;
            System.out.println(n1 + " / " + n2 +" = "+ div);
        }
        catch(ArithmeticException e)
        {
            System.out.println("n2 can not be 0");
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid number");
            System.out.println(e.getMessage());
        }
        //if we get unknown error
        catch(Exception e)
        {
            System.out.println("ERROR ..");
            System.out.println(e.getMessage());
        }
        //  it will always execute either got exception on not
        finally
        {
            System.out.println("i am in final block");
        }

        System.out.println("Program End .....");
    }
    /*
        45 0  :-  ArithmeticException
        45 ab :- InputMismatchException

        >> Try : if any line can produce an error for a paticular testcase then we put that portion in try Block
     */
}

//creating new exception
class greator extends Exception
{
    greator()
    {
        super("no is greator than 100");
    }
    greator(String s)
    {
        super(s);
    }
}