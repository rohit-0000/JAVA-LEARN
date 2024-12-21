package OOPS;
//Single inheritance
public class j03_branch extends j02_college{
    String name;
    int avg_pkg; //branches
    int no_st; //no of students
    public j03_branch(){
        super();
        System.out.println("non-Parameterized contructor called for branches");
    }
    public j03_branch(String name,int avg_pkg,int no_st){
        System.out.println("Parameterized contructor called for branches");
        this.name=name;
        this.avg_pkg=avg_pkg;
        this.no_st=no_st;
    }

    public void print(j02_college obj)
    {
        super.print(obj);
        System.out.println("Name of branch is "+this.name);
        System.out.println("Average package for "+ this.name+ " branch is " + avg_pkg );
        System.out.println("No of students is " + no_st);
    }
    public void print(j03_branch obj)
    {
        System.out.println("Name of branch is "+obj.name);
        System.out.println("Average package for "+ obj.name+ " branch is " + obj.avg_pkg );
        System.out.println("No of students is " + obj.no_st);
    }
}
