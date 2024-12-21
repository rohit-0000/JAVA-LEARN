package OOPS;

public class j05_object {
    public static void main(String[] args)
    {
//        j02_college dsce=new j02_college();
        j02_college dsce=new j02_college("dsce","Engineering",100);
        dsce.print();
        System.out.println("----------------------------------------------------------------");
//        //single level
        j03_branch cse=new j03_branch("CSE",1900000,120);
        cse.print(dsce);
        System.out.println("----------------------------------------------------------------");
//        //multi-level-inheritance
        j04_section A=new j04_section("A",80,"Kavita gowda");
        A.print(cse);
        System.out.println("----------------------------------------------------------------");
//        Hierarchical inheritance
        j04a_section B=new j04a_section("B",90,"Ganesh Sir");
        B.print(dsce);
    }
}
