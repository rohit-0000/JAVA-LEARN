import java.util.Arrays;

public class J5_Array
{
    public static void main(String[] args)
    {
    // Array is a non-primitive data-types. hence we have to use new keyword.
        int marks[]=new int[4];
//        int []marks=new int[3];    // same
        marks[0]=97;
        marks[1]=93;
        marks[2]=95;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        // If we not set the value then compiler returns 0 or false.
        boolean[] adult = new boolean[2];
        System.out.println(adult[0]);       //return false
        //length
        System.out.println(marks.length);

        //sort    :- it use to arrange arrays in  ascending order.
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        //without new keywords
        int[] id ={23,45,98};
        System.out.println(id[0]);
        System.out.println(id[1]);
        System.out.println(id[2]);

    }
}
