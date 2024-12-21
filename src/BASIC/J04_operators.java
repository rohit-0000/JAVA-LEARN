//import org.w3c.dom.ls.LSOutput;
package BASIC;
public class J04_operators
{
    public static void main(String[] args)
    {
        //Operators
        //Arithmetic Operator
        double a = 1;
        double b = 2;
        double add = a+b;
        double sub = a-b;
        double prod = a*b;
        double div = a/b;
        double remain = a%b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(prod);
        System.out.println(div);
        System.out.println(remain);

        // Assignment operator
        int num001 = 23;
        System.out.println(num001);
        num001+=4;
        System.out.println(num001); // 27
        //increment
        System.out.println(++num001);   //28
        System.out.println(num001++); //28
        //decrement
        System.out.println(num001--); //29
        System.out.println(--num001);  //27

        // maths
        int num=4;
        int num1=5;
        System.out.println(Math.min(num,num1));
        System.out.println(Math.max(num,num1));
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*10000));
        System.out.println(Math.sqrt(num));

        //Comparision Operators
        // a == b      -->equal to
        // a != b      -->not equal to
        // a < b       -->less than
        // a > b       -->Greater than
        // a <= b       -->less than equal to
        // a >= b       -->Greater than equal to

        int ab=23,ba=34;
        System.out.println(ab == ba);
        System.out.println(ab != ba);
        System.out.println(ab <= ba);
        System.out.println(ab >= ba);
        System.out.println(ab < ba);
        System.out.println(ab > ba);

        //Logical Operators
        // && --> if both condition is true then only return true otherwise false
        // || --> if any one condition is true then return true , both condition is false then return false
        // != --> if both conditon is not equall then return true otherwise return false
        System.out.println((a == b) && (a < b));
        System.out.println((a <= b) || (a > b));
        System.out.println(a != b) ;

        //bitwise operator
        // & -> bitwise and
        // | -> bitwise or
        // ^ -> bitwise xor (same for 0 and different for 1)

        int x=1,y=2;
        System.out.println(x&y);  //01 & 10 =0
        System.out.println(x|y);  //01 | 10 =11
        System.out.println(x^y);  //01 ^ 10 =11

        //turnary operator
        System.out.println((5>3)? "True" : "False");
    }
}
