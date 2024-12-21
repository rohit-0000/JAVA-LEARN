package OOPS;
//base class
class j02_college
{
    String name;
    String type; //eng , medical , normal
    int rank;
     //no of branches
    j02_college(){
        System.out.println("non-parametrize constructor for college called 😁");
    }
    public j02_college(String name,String type)
    {
        this();
        System.out.println("parametrize constructor for college called 😄");
        this.name=name;
        this.type=type;
    }
    //    constructor overloading
    public j02_college(String name,String type,int rank){
        System.out.println("parametrize constructo for college called 😊");
        this.name=name;
        this.type=type;
        this.rank=rank;
    }
    public void print()
    {
        System.out.println("Name of the college is " + name );
        System.out.println(" it is "+ type + " college");
        System.out.println("its rank is "+ rank);
    }
    public void print(j02_college obj)
    {
        System.out.println("Name of the college is " + obj.name );
        System.out.println(" it is "+ obj.type + " college");
        System.out.println("its rank is "+ obj.rank);
    }
    //methods overloading
    public void print(String name,String type)
    {
        System.out.println("Name of the college is " + name );
        System.out.println(" it is "+ type + " college");
    }
}
