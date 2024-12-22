public class J11_Logical_Operator
{
    public static void main(String[] args) {

        // && operator
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false


        // or
        int a =4;
        int b= 8;
        if((a<b)&&(a==b))
        {
            System.out.println("(a<b)&&(a==b) is true");
        }
        if((a<b)||(a==b))
        {
            System.out.println("(a<b)||(a==b) is true");
        }
        if(!(a==b))
        {
            System.out.println("a is not equal to b ");
        }
    }
}
