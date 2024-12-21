package BASIC;
import java.util.*;
public class J08_string
{
    public static void main(String[] args)
    {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.next(); // for a word
//        String s=sc.nextLine(); // whole line
        String s= "Rohit";
        s.concat("Kumar");  // it will not affect the original string because string is immutable in nature
        System.out.println(s);
        System.out.println(s.length());  // it will print lenght of string
        System.out.println(s.charAt(2));

        s=s.concat(" Kumar");
        System.out.println(s);

        //substring

        String st=new String("I am rohit");
//        String sub=st.substring(0); // it will print whole string
        String sub=st.substring(2,5); // it will print 'am'
        System.out.println(sub);

        //replacement of char at string
        //StringBuilder is mutable
        StringBuilder s1=new StringBuilder(s);
        s1.setCharAt(0,'M');
        System.out.println(s1);
        s1.append('m');  // add char to string
        System.out.println(s1);

    }
}
