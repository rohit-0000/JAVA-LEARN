/*
    OOPS-Object oriented programming system
    it includes class and object.
    --> class in Java is a blueprint or template that determines the structure and behavior of objects.
    --> object is an instance of a class that represents a real-world entity
    --> Constructor is used to initialize the data of the object automatically when we create constructor.
            --> it have same name as class
            --> it does not have return type
            --> it is of two type i) parameterized Constructor   ii) non-Parameterized Constructor
            --> by default it have default constructor which is similar to non-parameterized constructor
    --> if a class have different constructor with different arguments then it is called constructor overloading
    -->if two or more constructor have same name but different arguments as a parameter then it is called method overloading
    -->"this" keyword is referred as current invoking object.
    -->"this()" function is used for calling current class constructor from inside the different constructor of same class.
    --> inheritance :- it is the mechanism in Java by which one class is allowed to inherit the features
            --> it is invoked by using "extends"
            --> class dog extends animal , here animal is parent class and dog is child class.
            --> Types:-
                        Single Inheritance :- a sub-class is derived from only one super class
                        Multi-level Inheritance :- a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes.
                        Hierarchical Inheritance :- one class serves as a superclass (base class) for more than one subclass.
                        Multiple Inheritance :- a derived class have more than one base class ,which is not supported by java using classes, we can impliment this using interfaces.
                        Hybrid Inheritance :- It is a mix of two or more of the above types of inheritance
    -->The " super" keyword in Java is a reference variable that is used to refer to parent class.
    -->the "super()" used to call parent class constructor from inside child class constructor. it must be the first statement.

 */
