// Types of interfaces - 
import java.io.Serializable;

// 1. Normal Interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// 2. Functional Interface
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

// public class Calculator {
//     public static void main(String[] args) {
//         MathOperation add = (a, b) -> a + b;
//         MathOperation subtract = (a, b) -> a - b;

//         System.out.println("Addition: " + add.operate(10, 5));
//         System.out.println("Subtraction: " + subtract.operate(10, 5));
//     }
// }

// 3. Marker Interface
class Person implements Serializable {
    // Class implementation here
}

// 4. Single Abstract Method (SAM) Interface
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

// public class GreetingExample {
//     public static void main(String[] args) {
//         Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");
//         greeting.sayHello("Alice");
//     }
// }

// 5. Default Methods Interface
interface Animal {
    void makeSound();

    default void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// 6. Static Methods Interface
interface MathHelper {
    static int square(int number) {
        return number * number;
    }
}

// public class MathExample {
//     public static void main(String[] args) {
//         int result = MathHelper.square(5);
//         System.out.println("Square: " + result);
//     }
// }


public class interf {
    
}
