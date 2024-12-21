package OOPS;
    /*
    -->Encapsulation is the technique of bundling the data (fields) and methods (functions) that operate on the data
        into a single unit or class, and restricting access to some of the object's components.
    --> Private fields restrict direct access using the private keyword.
    -->Public getter and setter methods provide controlled access and updates.
    -->This maintains data integrity and enables validation.
     */

class Person {
    // Private fields
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) { // Basic validation
            this.age = age;
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person();

        // Setting values using setter methods
        person.setName("John Doe");
        person.setAge(25);

        // Getting values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}