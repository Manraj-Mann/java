// what is a functional interface?
// A functional interface is a concept introduced in Java to represent a single abstract method (SAM) interface. In other words, it's an interface that has exactly one abstract method, along with potentially some default or static methods. Functional interfaces are a key component of Java's support for functional programming and the use of lambda expressions.

// Here are a few key points about functional interfaces:

// 1. Single Abstract Method (SAM) Interface: A functional interface must have only one abstract method. However, it can also have any number of default or static methods without violating the functional interface rules.

// 2. @FunctionalInterface Annotation: While not strictly required, using the @FunctionalInterface annotation is a good practice for indicating that an interface is intended to be a functional interface. The Java compiler will enforce that the interface adheres to the functional interface rules.

// 3. Lambda Expressions: Functional interfaces are most commonly used with lambda expressions. A lambda expression allows you to define a concise representation of a method that can be used as an argument to a higher-order function or assigned to a functional interface variable.

// 4. Built-In Functional Interfaces: Java provides several built-in functional interfaces in the java.util.function package, such as Predicate, Consumer, Function, and Supplier. These interfaces cover common use cases for functional programming, making it easier to work with lambda expressions.

import java.util.function.*;

// 1. Single Abstract Method (SAM) Interface
// A functional interface must have only one abstract method.
// It can have default or static methods without violating the functional interface rules.
interface MathOperation {
    int operate(int a, int b);
    // int operate2(int a, int b); // Uncommenting this line will cause a compilation error.
    // Default methods are allowed in functional interfaces.
    // What is a default method? How do you use it?
    // Default methods are methods that have a default implementation in the interface.
    // They are declared using the default keyword.
    // Can be overridden in the implementing class.

    default void sayHello() {
        System.out.println("Hello!");
    }
    // Static methods are allowed in functional interfaces.
    static void sayBye() {
        System.out.println("Bye!");
    }
}

// 2. @FunctionalInterface Annotation
// Using @FunctionalInterface indicates that an interface is intended to be a functional interface.
// The Java compiler enforces adherence to the functional interface rules.
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class func {
    public static void main(String[] args) {
        // 3. Lambda Expressions
        // Functional interfaces are commonly used with lambda expressions.
        // Lambda allows concise representation of methods for higher-order functions or assignments.
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Result: " + addition.operate(10, 5));

        // Lambda expression with Greeting functional interface
        Greeting greet = (name) -> System.out.println("Hello, " + name);
        greet.sayHello("Alice");

        // 4. Built-In Functional Interfaces
        // Java provides built-in functional interfaces for common use cases.
        // Example: Predicate, Consumer, Function, Supplier from java.util.function package.
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");

        Function<Integer, String> intToString = num -> "Number: " + num;
        System.out.println(intToString.apply(42));

        Supplier<Double> randomDouble = () -> Math.random();
        System.out.println("Random number: " + randomDouble.get());
    
    }


}
