package BASIC;
import java.util.*;
public class J09_ArrayList
{
    public static void main(String[] args)
    {
       ArrayList<Integer> v1=new ArrayList<>();
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           int x=sc.nextInt();
           v1.add(x);
       }
       for(int i=0;i<n;i++)
       {
           System.out.print(v1.get(i)+" ");
       }
        System.out.println();

       // sorting of arraylist
        Collections.sort(v1);
//        Collections.sort(v1,Collections.reverseOrder());  //descening order
        for(int i=0;i<n;i++)
        {
            System.out.print(v1.get(i)+" ");
        }
        System.out.println();

        //reverse of string
        Collections.reverse(v1);
        for(int i=0;i<n;i++)
        {
            System.out.print(v1.get(i)+" ");
        }
        System.out.println();
        //find in arraylist
        System.out.println(v1.indexOf(110));
        System.out.println(v1.contains(110));

        //count
        int ct=Collections.frequency(v1,5);
        System.out.println(ct);
    }
}
