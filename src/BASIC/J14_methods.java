package BASIC;
import java.util.*;
public class J14_methods
{
    ArrayList<Integer> fibb(int num)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(0);
        ans.add(1);
        for(int i=2;i<num;i++)
        {
            ans.add(ans.get(i-2)+ans.get(i-1));
        }
        return ans;
    }
    public static void main(String[] s)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        J14_methods obj=new J14_methods();
        ArrayList<Integer> ans=obj.fibb(n);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
}
