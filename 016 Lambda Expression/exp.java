// What is a lambda expression?
// A lambda expression is a short block of code that takes in parameters and returns a value.
// Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
// Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.
// Lambda expressions let you express instances of single-method classes more compactly.

// A lambda expression is a concise way to represent an anonymous function, also known as a lambda function or lambda. Lambda expressions were introduced in Java 8 to simplify the process of writing small, single-method interfaces (functional interfaces) by providing a more readable and expressive syntax.

// (parameters) -> expression
// (parameters) -> { statements; }


// Functional interface with a single abstract method
interface MyInterface {
    void performAction(int num);
}
// Functional interface with a single abstract method
interface MyFunction {
    int apply(int a, int b);
}

public class exp {
    
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyInterface myLambda = (num) -> System.out.println("Number: " + num);
        myLambda.performAction(42);

        // Using a lambda expression to implement the functional interface
        MyFunction add = (a, b) -> a + b;
        int result = add.apply(10, 20);
        System.out.println("Result: " + result);

    }
}
