package BASIC;
public class J07_loop
{
    public static void main(String[] args)
    {
        //for loop
        //print 1 to 10
        for(int i=0;i<=10;i++)
        {
            System.out.print(i+" ");
        }
        //While loop
        System.out.println();
        int i=0;
        while(i<=10)
        {
            System.out.print(i++ + " ");
        }
        // do-while loop
        System.out.println();
        int j=0;
        do {
            System.out.print(j+++" ");
        }while(j<=10);
    }
}
