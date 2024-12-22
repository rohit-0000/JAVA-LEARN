import java.util.Scanner;

public class J9_Input_in_Java {
public static void main(String[] args)
{
    // How to take INPUT?
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Age ");
    int age = sc.nextInt();
    System.out.println("Age = "+age);

    System.out.println("Enter your marks ");
    float marks = sc.nextFloat();
    System.out.println("marks = "+marks);

    System.out.println("Enter your name ");
    String name = sc.next();
    System.out.println("name = "+name);

    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter your Adress ");
    String adress = sc1.nextLine();
    System.out.println("My adress is "+adress);
}
}
