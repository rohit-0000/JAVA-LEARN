package OOPS;
/*
The word polymorphism means having many forms.
it is of two type
1.Compile time polymorphism :- it is also known as static binding
    -->it include overloading
2.run time polymorphism :- it is also known as dynamic binding
    -->it include overridding

 */
//compile time polymorphism
class Printer {
    void print(int num) {
        System.out.println("Printing number: " + num);
    }

    void print(String str) {
        System.out.println("Printing string: " + str);
    }
}

class compile_time {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(123);     // Calls print(int)
        printer.print("Hello"); // Calls print(String)
    }
}

//runtime polymorphism
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class run_time {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Calls Dog's makeSound() method
    }
}


