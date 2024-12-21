/*
 --> Overriding is a feature that allows a subclass or child class to provide a
    specific implementation of a method that is already provided by one of its
    super-classes or parent classes.
  --> a method of a subclass should be  the same name, the same parameters or signature, and the same return
    type(or sub-type) as a method in its super-class, then only the method in the subclass is said to override the method
    in the super-class.
 */
package OOPS;
    // Base Class
    class Parent {
        void show() { System.out.println("Parent's show()"); }
    }

    // Inherited class
    class Child extends Parent {
        // This method overrides show() of Parent
        @Override void show()
        {
            System.out.println("Child's show()");
        }
    }

    class Main {
        public static void main(String[] args)
        {
            Parent obj1 = new Parent();
            obj1.show();
            Parent obj2 = new Child();
            obj2.show();
        }
    }