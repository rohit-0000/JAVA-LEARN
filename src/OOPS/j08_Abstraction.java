package OOPS;
// Abstraction :- Showing internal features and hiding internal detail.(implementation)
// Abstract class
abstract class Shape {
    // Abstract method
    abstract void draw();
}

// Concrete class
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class TestAbstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
//      here class circle and class rectangle is hidden and complete function is not there in shape class
        s1.draw();
        s2.draw();
    }
}

