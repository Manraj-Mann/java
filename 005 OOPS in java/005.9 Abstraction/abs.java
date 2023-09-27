
// Abstraction is a fundamental concept in object-oriented programming (OOP) that allows you to model real-world objects and their behaviors in a simplified and organized manner. 
// It provides a way to hide complex implementation details while exposing only the essential features and functionalities. 
// In Java, abstraction is achieved through abstract classes and interfaces. 

// Here's an overview of abstraction in Java:

// 1. Abstract Classes : Abstract classes in Java are the classes that are declared with the abstract keyword.

// a. An abstract class is a class that cannot be instantiated on its own and may have abstract methods (methods without a body) as well as regular methods with implementations.
// b. Abstract classes serve as a blueprint for other classes to inherit from. They define a set of common attributes and behaviors that subclasses can share.
// c. Subclasses of an abstract class are required to provide implementations for all abstract methods defined in the parent abstract class.
// d. Abstract classes can have instance variables, constructors, and other regular class members.


// 2. Abstract Methods : Abstract methods are the methods that are declared
// without any implementation.

// a. Abstract methods are declared with the abstract keyword and no method body.
// b. Abstract methods can only be declared inside abstract classes and interfaces.
// c. Subclasses of an abstract class are required to provide implementations for all abstract methods defined in the parent abstract class.


// Example:

abstract class Shape {
    int x, y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void draw(); // Abstract method without implementation
}

class Circle extends Shape // Concrete subclass
{
    int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

// why use abstract classes?
// a. Abstract classes allow you to define common behavior that can be shared by multiple subclasses.
// b. Abstract classes allow you to achieve polymorphism in Java.
// c. Abstract classes allow you to decouple your code from implementation details of your subclasses.


// 3. Interfaces : Interfaces in Java are the blueprint of a class. It is a collection of abstract methods and static constants.

// An interface is a contract that defines a set of abstract methods that a class implementing the interface must provide.
// Unlike abstract classes, a class can implement multiple interfaces, allowing for greater flexibility in designing class hierarchies.
// Interfaces can also include constants (public, static, final fields) and default methods (methods with a default implementation in Java 8 and later).

// why use interfaces?
// a. Interfaces allow you to define common behavior that can be implemented by multiple classes.
// b. Interfaces allow you to achieve polymorphism in Java.
// c. Interfaces allow you to decouple your code from implementation details of your classes.


interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}

// 4. Abstract Classes vs. Interfaces : Abstract classes and interfaces are both used to achieve abstraction in Java, but they are not the same.

// Why need interfaces if we have abstract classes?

// Interfaces and abstract classes serve distinct purposes in Java, and each has its own advantages and use cases. While abstract classes provide a way to share common implementation among subclasses, interfaces offer a more flexible and comprehensive approach to achieve multiple inheritance and define contracts. Here are some reasons why interfaces are still needed even when abstract classes exist:

// 1. Multiple Inheritance:
// Java supports single inheritance, meaning a class can extend only one superclass (abstract class). However, a class can implement multiple interfaces.
// Interfaces allow you to inherit behavior from multiple sources, enabling you to compose classes with various functionalities from different interfaces.

// 2. Contractual Obligations:
// Interfaces define a contract that classes must adhere to. By implementing an interface, a class commits to providing specific methods with particular signatures and behaviors.
// Abstract classes can provide default implementations, but interfaces enforce that all implementing classes provide their own implementations.

// 3. Loose Coupling:
// Interfaces promote loose coupling between components by focusing on what a class can do rather than how it does it. This enhances modularity and allows for more flexible system design.

/*

abstract class Computer
{
//	public void code()
//	{
//		
//	}
	public abstract void code();
}

class Laptop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class Demo {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();
        
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer navin=new Developer();
        navin.devApp(lap);
        
    }
}
*/


interface Computer
{
	 void code();
}

class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

// public class Demo {
//     public static void main(String[] args) {
// //        Laptop lap=new Laptop();
// //        Desktop desk=new Desktop();
        
//         Computer lap=new Laptop();
//         Computer desk=new Desktop();
        
//         Developer navin=new Developer();
//         navin.devApp(lap);
        
//     }
// }


// If i extends an abstract class is it compulsory to override all its methods ?

// Yes, when you extend an abstract class in Java, it is compulsory to override all its abstract methods in the subclass. Abstract methods are methods declared in the abstract class without an implementation (i.e., without a method body). Subclasses that extend an abstract class must provide concrete implementations for these abstract methods.
// Failure to override all abstract methods in the subclass will result in a compilation error, indicating that the subclass itself is also abstract and therefore cannot be instantiated.


// If i implement an interface  is it compulsory to implement all its methods 

// Yes, when you implement an interface in Java, it is compulsory to provide concrete implementations for all the methods declared in that interface. An interface defines a contract that classes implementing it must adhere to, which means that any class implementing an interface must provide definitions for all the methods specified by that interface.
// Failure to implement all the methods of an interface in the implementing class will result in a compilation error.