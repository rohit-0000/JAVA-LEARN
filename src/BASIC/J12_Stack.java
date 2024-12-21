package BASIC;
import java.util.Scanner;
import java.util.Stack;

public class J12_Stack
{
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }

        while(!st.isEmpty())
        {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
