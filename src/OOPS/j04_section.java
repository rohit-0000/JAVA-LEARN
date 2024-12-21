package OOPS;
//Hierarchical inheritance
// multilevel inheritance
public class j04_section extends j03_branch {
    String name;
    int capacity;
    String cs_teacher;
    j04_section(){
        super();
        System.out.println("Non-Parameterized constructor called" );
    }
    j04_section(String name,int capacity,String cs_teacher){
        System.out.println("Parameterized constructor called" );
        this.name=name;
        this.capacity=capacity;
        this.cs_teacher=cs_teacher;
    }
    public void print(j03_branch obj)
    {
        super.print(obj);
        System.out.println("name of branch is "+obj.name);
        System.out.println("Section name = "+ this.name);
        System.out.println("Total Capacity = " +capacity);
        System.out.println("Class teacher name = "+ cs_teacher);
    }
}
class j04a_section extends j02_college {
    String name;
    int capacity;
    String cs_teacher;
    j04a_section(){
        super();
        System.out.println("Non-Parameterized constructor called" );
    }
    j04a_section(String name,int capacity,String cs_teacher){
        System.out.println("Parameterized constructor called" );
        this.name=name;
        this.capacity=capacity;
        this.cs_teacher=cs_teacher;
    }
    public void print(j02_college obj)
    {
        super.print(obj);
//        System.out.println("name of branch/college is "+super.name);
        System.out.println("Section name = "+ this.name);
        System.out.println("Total Capacity = " +capacity);
        System.out.println("Class teacher name = "+ cs_teacher);
    }
}