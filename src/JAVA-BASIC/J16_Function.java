import java.util.Scanner;

public class J16_Function
{
    public static void name (String name){
        System.out.println("name is "+name);
    }
    public static void printhello()
    {
        System.out.println("Hello java");
    }
    public static void sum(int a, int b)
    {
        System.out.println(a+" + "+b+" = "+(a+b));
    }
    public static void main (String[] args)
    {
        printhello();
        printhello();
        printhello();
        sum(5,8);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.nextLine();
        name(name);
    }
}
