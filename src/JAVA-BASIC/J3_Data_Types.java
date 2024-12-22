public class J3_Data_Types {
    public static void main(String args[])
    {
        /*
        1. Primitive type
            byte - 1 byte [-128 to 127]
            short - 2 bytes
            int - 4 bytes - stores integers
            long - 8 bytes
            float - 4 bytes -  stores decimal value
            double - 8 bytes - stores decimal value
            char - 2 bytes - stores character
            boolean - 1 bytes - true/false
        */
        byte age = 30;
        int phone = 1234567890;
//        int phone1 = 12345678901;  due to int can not store more than 4 bytes of memory.
        long phone2 = 12345678901L;
        float pie = 3.14F;
        char letter = '@';
        boolean is_adult = true;
        System.out.println(age);
        System.out.println(phone);
        System.out.println(phone2);
        System.out.println(pie);
        System.out.println(letter);
        System.out.println(is_adult);
/*
        2. Non-Primitive types
        - it has not fixed size.like primitive(i.e. int has 4 bytes of memory.)
        - non-primitive size can be declared with the help of 'new' keyword.
*/
        String name = "Rohit";
        System.out.println(name);
        System.out.println(name.length());  // length()-> it is function which give size of string.

        String name1 = new String("Ram");
        String friend = new String("Ram");
        System.out.println(name1);
        System.out.println(name1.length());
        System.out.println(friend);
        System.out.println(friend.length());


    }
}
