package BASIC;
import java.util.*;
public class J06_Array
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int sz=sc.nextInt();
       int[] arr=new int[sz];
       for(int i=0;i<sz;i++)
       {
           arr[i]=sc.nextInt();
       }

       for(int i=0;i<sz;i++)
       {
           System.out.print(arr[i]+" ");
       }
       Arrays.sort(arr);

       System.out.println();
       System.out.print("After sorting : ");
       for(int it : arr)
       {
           System.out.print(it+" ");
       }
//       System.out.println(Arrays.toString(arr));  // print whole array like [3, 5, 6, 7, 9]


    }
}
