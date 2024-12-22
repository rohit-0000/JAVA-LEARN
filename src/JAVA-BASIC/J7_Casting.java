public class J7_Casting
{
    public static void main(String[] args)
    {
//        implicit casting
        double price = 100.00;
        double finalprice = price + 18  ;
        System.out.println(finalprice);
//      Explicit casting
        int p = 100;
        int fp = p + (int)18.180 ;
        System.out.println(fp);
    }
}

