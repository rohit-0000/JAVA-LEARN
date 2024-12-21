package BASIC;
import java.util.*;

public class J10_set
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Set<Integer> st=new TreeSet<Integer>();
//        Set<Integer> st=new TreeSet<Integer>(); // it store element in sorted order
//        Set<Integer> st=new LinkedHashSet<Integer>();  // it store element as it is
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            st.add(sc.nextInt());
        }

        for(int it:st)
        {
            System.out.print(it+" ");
        }
        System.out.println();
        System.out.println(st.contains(110));

        if(st.contains(5))
        {
            st.remove(5); //removing element from arrayList
        }
        Iterator <Integer> it= st.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

    }
}
