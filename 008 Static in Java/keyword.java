class Mobile {

    // instance variable - every object will have its own copy of instance variable
    // instance variable is also called non-static variable
    // instance variable is declared inside the class but outside the method

    String brand; // instance variable
    String model; // instance variable
    String color; // instance variable
    int price; // instance variable
    int memory; // instance variable

    // i want to make a variable which will be common for all the objects
    // i.e. all the objects will have same value for this variable
    static int screenSize; // static variable
    // static variable is declared inside the class but outside the method

    public void call() {
        System.out.println("Calling...");
    }

    public void sms() {
        System.out.println("Sending sms...");
    }

    public void playGame() {
        System.out.println("Playing game...");
    }

    // static method is a method which can be accessed without creating an object of
    // the class
    // static methods can only access static variables
    // static methods can only call other static methods
    // static methods cannot call non-static methods
    // static methods cannot use this keyword
    // static methods cannot use super keyword
    // static methods cannot be overridden
    // static methods can be overloaded
    // static methods can be declared inside a non-static class

    public static void showScreenSize() {
        System.out.println("Screen Size: " + screenSize);
    }

    public void showDetails() {
        System.out.println("**********Mobile Details**********");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Memory: " + memory);
        System.out.println("Screen Size: " + screenSize);
    }

    // To initialize instance variable we use constructor
    // Constructor is a special method which has same name as that of class
    // But in case of static variable we don't need constructor to initialize it

    // Static block is used to initialize static variable
    // Static block is executed before main method
    // Static block is executed only once
    // Static block is executed before constructor
    // Static block is executed before object creation

    static {
        screenSize = 5;
        System.out.println("Static block is executed");
    }

    Mobile() {
        System.out.println("Constructor is executed");
    }

}

public class keyword {

    static {
        System.out.println("Static block in keyword is executed");
    }

    keyword() {
        System.out.println("Constructor in keyword is executed");
    }

    public static void main(String[] args) {

        // Static execution is done before main method
        // WHy ? the class is loaded first and then main method is executed , also
        // objects are created after main method

        System.out.println("Main method is executed");

        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.model = "Galaxy S10";
        m1.color = "Black";
        m1.price = 50000;
        m1.memory = 128;
        m1.screenSize = 6;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.model = "iPhone 11";
        m2.color = "White";
        m2.price = 100000;
        m2.memory = 256;
        m2.screenSize = 100;

        m1.showDetails();
        m2.showDetails();

        // We can also access static variable using object name
        // But it is not a good practice as static variable is common for all the
        // objects
        // So we should access static variable using class name

        System.out.println(Mobile.screenSize);
        Mobile.screenSize = 10;
        System.out.println(Mobile.screenSize);

        // Static Method is a method which can be accessed without creating an object of
        // the class
        Mobile.showScreenSize();

        // What if we don't make objects of class having static methods and variables ?
        // Will we have execution of the static block ?
        // No as class will be loaded
        // comment above code and try
        // Result : Static block is executed will not be there but
        // Static block in keyword is executed will be there
        // Why ? because we are creating object of keyword class

        // What if we want to initialize static variable without creating object of
        // class ?
        try {
            Class.forName("Mobile");
        } catch (Exception e) {

        }

        // Why we make main as static ?
        // because main is the entry point of the program
        // and we don't need to create object of class to call main method
        // so main method should be static

        // Who calls the main method ?
        // JVM calls the main method at runtime when we run the program from the given
        // class

        // What if we don't make main method as static ?
        // Result : Error: Main method not found in class keyword, please define the
        // main method as:

    }

}
