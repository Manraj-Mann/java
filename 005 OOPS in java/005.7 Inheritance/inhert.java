// What is Inheritance ? 
// Ans : Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.
// It is an important part of OOPs (Object Oriented programming system).
// The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.
// When you inherit from an existing class, you can reuse methods and fields of the parent class.
// Moreover, you can add new methods and fields in your current class also.

// Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

// Why use inheritance in Java ? 
// 1. For Method Overriding (so runtime polymorphism can be achieved).
// 2. For Code Reusability.

// Types of inheritance in java - 
// 1. Single Inheritance
// 2. Multilevel Inheritance
// 3. Hierarchical Inheritance
// 4. Multiple Inheritance (Through Interfaces)
// 5. Hybrid Inheritance (Through Interfaces)


// Does child class call parent class constructor?
// Ans : Yes, child class constructor implicitly calls the default no-arg constructor of the parent class.

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class A{

    public A(){
        System.out.println("In A");
    }
    A(int i){
        System.out.println("In A parameterized");
    }
}
class B extends A{

    public B(){
        System.out.println("In B");
    }
    public B(int m ){

        super(m);
        System.out.println("In B parameterized");
    }

}
class C extends A{

    C(){

        super();
        System.out.println("default constructor of c");
        
    }
    C(int i ){

        
        this();
        System.out.println("Constructor of c int");
    }
}

// What is a superclass and subclass?
// A superclass (or base class) is the class whose properties and behaviors are inherited by another class. A subclass (or derived class) is the class that inherits from the superclass.

// Can a subclass inherit from multiple superclasses in Java?
// No, Java supports single inheritance only, meaning a class can inherit from only one superclass. However, a class can implement multiple interfaces, which provides a form of multiple inheritance through interface implementation.

// What is method overriding?
// Method overriding is a feature in Java that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. The method in the subclass must have the same name, return type, and parameters as the method in the superclass.

// How can you prevent a method from being overridden in a subclass?
// You can use the final keyword to prevent a method from being overridden. When a method is marked as final, it cannot be overridden by any subclass.

// Can you inherit a constructor from the superclass?
// Constructors are not inherited, but a subclass constructor can call a constructor of its superclass using the super() keyword.

// What is the concept of constructor chaining in inheritance?
// Constructor chaining refers to the process of calling a constructor from another constructor, either in the same class (this()) or in the superclass (super()).

// Explain the instanceof operator.
// The instanceof operator is used to test whether an object is an instance of a particular class or interface. It returns true if the object is an instance of the specified type, otherwise false.

// What is the "is-a" relationship in inheritance?
// The "is-a" relationship is a fundamental principle in inheritance. It means that a subclass is a specialized version of its superclass. For example, if you have a Dog subclass and a Mammal superclass, you can say that a Dog is-a Mammal.

// What is the "has-a" relationship in inheritance?
// The "has-a" relationship is a fundamental principle in inheritance. It means that a class has-a relationship with the objects it creates. For example, if you have a Car class, it has-a Engine object.

// What is the difference between inheritance and composition?
// Inheritance is an "is-a" relationship between a subclass and its superclass. Composition is a "has-a" relationship between a class and the objects it creates.

// Can you override a private method from the superclass in a subclass?
// No, private methods are not accessible to subclasses and cannot be overridden. Method overriding requires the overridden method to be accessible to the subclass.

// What is the significance of the protected access modifier in inheritance?
// The protected access modifier allows members (fields and methods) of a superclass to be accessed by subclasses within the same package or in different packages, but only if there is an "is-a" relationship between the classes.

// 1. Single inheritance = A class inherits from a single class only.
class SbkaParent {

    public SbkaParent(){
        System.out.println("In parent");
    }
    public void show(){
        System.out.println("In show");
    }
}
class child1 extends SbkaParent // this is single inheritance
{

    public child1(){
        System.out.println("In child1");
    }
    public void show(){
        System.out.println("In show child1");
    }
}
// 2. Multilevel inheritance = A class inherits from a class, which in turn inherits from another class.

class grandchild1 extends child1 // this is multilevel inheritance
{

    public grandchild1(){
        System.out.println("In grandchild1");
    }
    public void show(){
        System.out.println("In show grandchild1");
    }
}

// 3. Hierarchical inheritance = In hierarchical inheritance, multiple subclasses inherit from a single superclass.

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}


// 4. Multiple inheritance = A class inherits from more than one class. Java does not support multiple inheritance with classes, but it can be achieved with interfaces.

// what are interfaces ?
// Ans : An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.

// Interfaces in Java provide a way to achieve abstraction and define a contract that classes must adhere to. An interface defines a set of method signatures (without method bodies) that any class implementing the interface must provide concrete implementations for. It allows you to achieve a form of multiple inheritance in Java through implementing multiple interfaces.

// Here's some key information about interfaces :-

// 1. Declaration                     : An interface is declared using the interface keyword. It defines a set of abstract methods that any implementing class must override.
// 2. Method Signatures               : Interfaces only provide method signatures (method name, return type, and parameter list), but they don't provide the actual implementation.
// 3. Multiple Inheritance            : A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.
// 4. Abstract Classes vs. Interfaces : Abstract classes can have both method declarations and concrete methods with implementations, while interfaces only have method declarations. A class can extend only one abstract class, but it can implement multiple interfaces.
// 5. Default and Static Methods      : Java 8 introduced the ability to have default and static methods in interfaces. Default methods provide a default implementation for the method, which can be overridden by implementing classes. Static methods are shared among all classes that implement the interface.
// 6. Purpose                         : Interfaces are used to define common behavior that can be shared among different classes, regardless of their hierarchical relationship.

interface Mammal {
    void eat();
}

interface Bird {
    void fly();
}

class Bat implements Mammal, Bird {
    public void eat() {
        System.out.println("Bat is eating insects.");
    }

    public void fly() {
        System.out.println("Bat is flying in the night sky.");
    }
}

// 5. Hybrid inheritance = A class inherits from more than one class. Java does not support multiple inheritance with classes, but it can be achieved with interfaces.

interface X {
    void methodX();
}

interface Y {
    void methodY();
}

class Z {
    void methodZ() {
        System.out.println("Method Z");
    }
}

class W extends Z implements X, Y {
    public void methodX() {
        System.out.println("Method X");
    }

    public void methodY() {
        System.out.println("Method Y");
    }
}


// Method Overriding in Java

class Parent {

    public void show(){
        System.out.println("In parent");
    }
    // use of final keyword in inheritance
    final public void show1(){
        System.out.println("In parent");
    }
}
class Child extends Parent{

    // Method Overriding in Java
    public void show(){
        System.out.println("In child");
    }
    // Method overloading in java - overloading is compile time polymorphism it is also called static binding and is a type of polymorphism in which more than one method with same name is present in class but with different signatures.
    // Method overriding in java - overriding is run time polymorphism it is also called dynamic binding and is a type of polymorphism in which a child class has the same method as declared in the parent class.
    
    // is below method overloading or overriding ?
    // Ans : Overloading why ? because method name is same but signature is different
    public void show(int i){
        System.out.println("In child");
    }

    // use of final keyword in inheritance
    // public void show1(){
    //     System.out.println("In child");
    // }
    // code will give error
}


public class inhert {

    public static void main(String[] args) {
        
        B obj = new B(); // calls both A and B constructor
        B on = new B(0); 
        C ob = new C();
        C onh = new C(0); // use of super in inheritance 

        // Method Overriding in Java
        Parent obj1 = new Parent();
        obj1.show(); // will call parent class show method
        Child obj2 = new Child();
        obj2.show(); // will call child class show method

        // use of instanceof operator in inheritance
        System.out.println(obj1 instanceof Parent); // true - parent class is also a parent class
        System.out.println(obj2 instanceof Parent); // true - child class is also a parent class
        System.out.println(obj1 instanceof Child); // false - parent class is not a child class
        System.out.println(obj2 instanceof Child); // true - child class is also a child class

        // difference between overriding and overloading
        // 1. Overloading is a compile-time polymorphism while Overriding is a run time polymorphism.
        // 2. Static methods can be overloaded which means a class can have more than one static method of same name but
        //    Static methods cannot be overridden, even if you declare a same static method in child class it has nothing to do with the same method of parent class.
        // 3. Private methods can be overloaded but they cannot be overridden.
        // 4. Return type of method does not matter in case of method overloading, it can be same or different.
        //    But in case of method overriding the overriding method can have more specific return type (meaning if parent class method returns an object then child class method can return a more specific type object).
        // 5. Argument list should be different while doing method overloading. Argument list should be same in method Overriding.
        // 6. Access modifier can be same or more restrictive in method overriding but it should not be less restrictive.
        // 7. Final and static methods can be overloaded but they cannot be overridden.
        // 8. Constructors can be overloaded but they cannot be overridden.


    }
    
}
