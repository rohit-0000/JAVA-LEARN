package OOPS;
/*
--> The interface in Java is a mechanism to achieve abstraction
--> A class can implement multiple interfaces i.e multiple inheritance is possible
--> 100% abstraction possible
--> Classes implement interfaces using the implements keyword
--> All methods in an interface are abstract and public by default
-->All fields in an interface are implicitly public, static, and final.
 */
interface shape1 {
    int pi=22/7;// it is automatically public static and final
//    public static final int pi=22/7;
    void area1(int side);//public and abstract
}
class circle1 implements shape1
{
    public void area1(int side)
    {
        System.out.println("Area of circle is "+ pi*side*side);
    }
}
class square implements shape1
{
    public void area1(int side)
    {
        System.out.println("Area of square is "+ side*side);
    }
}
class main
{
    public static void main(String[] args)
    {
        shape1 c1=new circle1();
        c1.area1(2);
        shape1 s1=new square();
        s1.area1(6);
    }
}
