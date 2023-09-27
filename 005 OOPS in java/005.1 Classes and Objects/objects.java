// Classes and Objects

// Classes are the blueprint of an object - means they are the design of an object
// Classes are the logical entities - means they are not the physical entities
// Classes are the collection of objects means it is a group of objects that share common properties and behaviour 
// Classes are the template of an object - means it is the design of an object
// Classes are the compile time entities - means they are not in the memory until the object of the class is created


// Objects are the instances of a class 
// Objects are the real world entities 
// Objects are the runtime entities - means they are in the memory at runtime
// Objects are the basic unit of OOPs
// Objects are the physical entities

// What does a class contain?
// 1. Data members
// 2. Member functions

// What does an object contain?
// 1. State of an object
// 2. Behaviour of an object
// 3. Identity of an object

// Example : Class animal

class animal{

    // Default scope : by default, class members (fields) and methods in Java have package-private (also known as default) visibility. This means that they are accessible only within the same package (directory) where the class is defined.

    // Data members - Properties of an object
    // When the object is created the data members are allocated memory
    // by default the data members are private
    String name;
    int age;
    String color;

    // Member functions - Behaviour of an object
    // When the object is created the member functions are not allocated memory

    // by default the member functions are public
    void eat(){
        System.out.println("Eating");
    }

    void sleep(){
        System.out.println("Sleeping");
    }
    void details(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Color : " + color);
    }


}

// What will be the size of a empty class?

// The size of an empty class in Java isn't strictly zero. Every object in Java has some overhead due to the object header, which contains information required by the Java Virtual Machine (JVM) for managing the object. This overhead includes things like a reference to the class metadata and synchronization-related information.
// The exact size of this overhead depends on various factors, such as the JVM implementation, the platform, and the specific object layout strategies used by the JVM. On a typical 32-bit JVM, the object header overhead might be around 8 bytes, and on a 64-bit JVM, it might be around 12 to 16 bytes.
// Therefore, an empty class in Java would have a size that includes this overhead. The actual size of an empty class would be slightly larger than the object header size, which is around 8 to 16 bytes.
// It's important to note that the specific memory overhead can vary between JVM implementations and versions. If you're concerned about memory usage in your application, you can use Java profiling tools or memory profilers to get more accurate measurements of memory usage for different objects and classes.

class Computer{
    
    public void playMusic(){
        System.out.println("Playing music");
    }

    public void playVideo(){
        System.out.println("Playing video");
    }
    public int getPen(int cost){

        return cost+100;
    }


}

public class objects {
    
    public static void main(String[] args) {
        
        // Creating an object of class animal
        animal dog = new animal();
        // new keyword is used to allocate memory in the heap memory
        // dog is the reference variable to the object in the heap memory
        // dog is in the stack memory
        // instance variables of a class are created in the heap memory
        

        dog.details();
        dog.name = "Tommy";
        dog.age = 5;
        dog.color = "Black";
        dog.details();

        // size of an object
        System.out.println("Size of an object : " + dog.getClass().getDeclaredFields().length + " bytes");
        
        // If members are private how i am able to access them?
        // This means that the member is accessible within the same package but not outside of it. Since your objects class is in the same package as the animal class, it can access the package-private members of the animal class.
        
        // delete the object
        dog = null;

        // Creating an object of class Computer
        Computer c1 = new Computer();
        c1.playMusic();
        c1.playVideo();
        System.out.println("Cost of pen : " + c1.getPen(10));

    }


}

