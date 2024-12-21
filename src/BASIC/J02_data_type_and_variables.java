package BASIC;
class J02_data_type_and_variables
{
    public static void main(String[] args)
    {
        // Java is statically types programming language therefore we have to initialise first data type before variable
        /*
            Two types of data type is there
            1.Primitive data type /Inbuilt data type :- byte(8 bits),short(16 bits),int(32 bits),long(64 bits),float(32 bits),double(64 bits),char(16 bits),boolean(1 bit)
            2.Non-Primitive data type/Reference Data Types/User defined Data Types :- String , Array
         */
        byte a=4;
        short b=45;
        int c=456;
        long d=4567;
        float e = 456.67f;
        double f=4567.678d;
        char g='*';
        boolean h= true;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);
        System.out.println("f = "+f);
        System.out.println("g = "+g);
        System.out.println("h = "+h);

    }
}