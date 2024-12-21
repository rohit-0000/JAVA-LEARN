package BASIC;
public class J03_Typecasting
{
    public static void main(String[] args)
    {
        /*
            Typecasting : conversion of data from one data type to other
            two types:
            1. Automatically by JVM -> Implicit Type casting
            2. Forcefully by Programmer -> Explicit Type casting
         */

        int num=45;
        float no = num; //Implicit Type casting
        System.out.println(num);
        System.out.println(no);

        float value=34.56f;
        int val=(int)value; //Explicit type casting
        System.out.println(value);
        System.out.println(val);

    }
}
