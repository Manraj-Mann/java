
class A{

    public A(){

        System.out.println("Object created");

    }
    public void show(){

        System.out.println("called show");
    }
}

public class ano {
    
    // why made it static ?
    // Because main is a static method and a static method can onlyc all other static methods
    public static void printMessage(A a){

        System.out.println("got obeject A");
    }

    // In Java, an anonymous object refers to an object that is created and used without assigning it to a variable. 
    // Instead, it is usually used for a single, immediate purpose, and its reference is not retained. 
    // Anonymous objects are often employed to perform a quick task without the need to store the object's reference for future use.

    public static void main(String[] args) {
        
        // Creating and using an anonymous object of the String class
        int length = new String("Hello, World!").length();
        System.out.println("Length of the string: " + length);

        // more on anonymous objects
        new A().show(); // anonymous object

        // Properties of anonymous objects :
        // 1. Anonymous objects are created at the time of object creation itself.
        // 2. Anonymous objects do not have any reference variable to refer to it.
        // 3. Anonymous objects are used when we want to call a method of a class only once.
        // 4. Anonymous objects are passed as arguments to methods.
        // 5. Anonymous objects are created inside the argument list of the method.

        // Example of anonymous object passed as an argument to a method
        printMessage(new A()); // anonymous object passed as an argument to a method

    }





    
}
