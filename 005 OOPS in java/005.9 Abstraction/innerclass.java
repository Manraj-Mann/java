// Inner classes and anonymous inner classes are concepts in Java that allow you to define classes within other classes. These classes can have various access levels and provide a way to encapsulate and organize code. Let's discuss inner classes, anonymous inner classes, and the combination of abstract and anonymous inner classes.

// 1. Inner Class:
// An inner class is a class defined within another class. It has access to the members (including private members) of the enclosing class. Inner classes are useful for implementing encapsulation, composition, and a clear separation of concerns.

// Inner classes are divided into the following two categories:
// a. Non-static inner classes
// b. Static inner classes

// In Java, there are several types of inner classes, each with its own characteristics and use cases. Inner classes are classes defined within other classes. Let's explore the different types of inner classes:

// 1. **Member Inner Class:**
//    - A member inner class is a non-static inner class that is defined within another class.
//    - It has access to all members (fields and methods) of the outer class, including private members.
//    - It is associated with an instance of the outer class and cannot be instantiated without an instance of the outer class.

// 2. **Static Nested Class:**
//    - A static nested class is a nested class that is defined as a static member of another class.
//    - It is similar to a regular top-level class but is logically nested within the outer class for better organization.
//    - It cannot directly access non-static members of the outer class.

// 3. **Local Inner Class:**
//    - A local inner class is a class defined within a method or a code block (such as a loop or if statement).
//    - It has access to local variables of the enclosing method, but those variables must be effectively final or final.

// 4. **Anonymous Inner Class:**
//    - An anonymous inner class is an inner class defined without a class name.
//    - It is typically used to provide a one-time-use implementation of an interface or a class.
//    - It is often defined inline at the point where it is needed.

// 5. **Inner Class within an Interface:**
//    - Starting from Java 8, you can define an inner class within an interface.
//    - This inner class is implicitly static and public.

// Here's an example illustrating these different types of inner classes:


class Outer {
    private int outerValue = 10;

    // Member Inner Class
    class Inner {
        void display() {
            System.out.println("Inner class value: " + outerValue);
        }
    }

    // Static Nested Class
    static class StaticNested {
        void display() {
            System.out.println("Static nested class");
        }
    }

    void outerMethod() {
        int localVar = 20;

        // Local Inner Class
        class LocalInner {
            void display() {
                System.out.println("Local inner class, local variable: " + localVar);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }
}

interface Greeting {
    void greet();
    
    // Inner Class within an Interface (implicitly static and public)
    class InnerInInterface {
        void display() {
            System.out.println("Inner class within an interface");
        }
    }
}

// Abstract and Anonymous Inner Class Combination:

// You can combine abstract and anonymous inner classes to provide a one-time-use implementation of an abstract class. Here's an example:
abstract class Calculator {
    abstract int performCalculation(int a, int b);
}




public class innerclass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        
        // Member Inner Class
        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Static Nested Class
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.display();

        // Local Inner Class
        outer.outerMethod();

        // Anonymous Inner Class
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous inner class");
            }
        };
        greeting.greet();

        // Inner Class within an Interface
        Greeting.InnerInInterface innerInInterface = new Greeting.InnerInInterface();
        innerInInterface.display();

        // Abstract and Anonymous Inner Class Combination
        Calculator addition = new Calculator() {
            @Override
            int performCalculation(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Result: " + addition.performCalculation(5, 3));
    }
}


// In this example, each type of inner class is demonstrated within the `Outer` class and also within an interface (`Greeting`), where an inner class within an interface is implicitly static and public.

