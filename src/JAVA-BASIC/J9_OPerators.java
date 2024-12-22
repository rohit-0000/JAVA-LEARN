public class J9_OPerators
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
        System.out.println(ab==ba);
        System.out.println(ab!=ba);
        System.out.println(ab<=ba);
        System.out.println(ab>=ba);
        System.out.println(ab<ba);
        System.out.println(ab>ba);

    }
}
