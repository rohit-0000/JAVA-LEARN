import java.sql.SQLOutput;

public class J4_String
{
    public static void main (String[] args)
    {
        //Strings

        //Concatenate :- add two strings

        String name1 = "Rohit ";
        String name2 = "Abhinav";
        String name3 = name1 + name2;
        System.out.println(name3);

        String name4 = name1 +"and "+  name2;
        System.out.println(name4);

        //charAt

        System.out.println("charAt(n) function");
        String name5 = "Aman";
        System.out.print(name5.charAt(0));
        System.out.print(name5.charAt(1));
        System.out.print(name5.charAt(2));
        System.out.println(name5.charAt(3));

        //length
        System.out.print("Length of name5(Aman) is ");      //name5 = Aman
        System.out.println(name5.length());

        //Replace
        String name6 = name5.replace('a','b');  //name5 = Aman
        System.out.println(name5);  // Original string can not be replaced
        System.out.println(name6);

        //substring

        String name7 = "Ram and Shyam";
        System.out.println(name7.substring(0,3));
        System.out.println(name7.substring(8,13));

     // String is immutable (unchanging over time or unable to be changed).

//     phufpha-->7043

    }
}
