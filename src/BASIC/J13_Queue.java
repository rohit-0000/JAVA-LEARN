package BASIC;
import java.util.*;
public class J13_Queue
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer> q1=new LinkedList<Integer>();
        for(int i=0;i<n;i++)
        {
            q1.add(sc.nextInt());
        }
        while(!q1.isEmpty())
        {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
