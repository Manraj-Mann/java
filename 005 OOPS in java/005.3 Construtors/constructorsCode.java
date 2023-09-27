
// what is constructor?
// constructor is a special method that is used to initialize the object.
// constructor is called when an object of a class is created.
// it is called constructor because it constructs the value of data member of the class.

// rules for creating constructor - 
// 1. constructor name must be same as its class name.
// 2. constructor must have no return type.
// 3. constructor can not be abstract, static, final and synchronized.
// 4. constructor can not be inherited.
// 5. we can use access modifiers in constructor declaration to control its access.

// do we have destructors in java?
// no, java does not support destructors. why ?
// Correct, Java does not have destructors like some other programming languages such as C++ do. The absence of destructors in Java is due to the way Java manages memory and object lifecycle through its built-in garbage collection mechanism.

// Java's approach ensures that objects are automatically deallocated when they are no longer referenced, which helps prevent common memory-related issues like memory leaks. The Java Virtual Machine (JVM) tracks object references and manages memory efficiently. When an object is no longer reachable or referenced, the garbage collector will eventually reclaim the memory occupied by the object and perform any necessary cleanup.

// Types of constructors -
// 1. default constructor (no-arg constructor)
// 2. parameterized constructor
// 3. copy constructor
 
// what is default constructor?
// constructor which has no parameter is known as default constructor.

// what is parameterized constructor?
// constructor which has parameters is known as parameterized constructor.

// what is copy constructor?
// constructor which initializes the object using another object of the same class is known as copy constructor.

// what is constructor overloading?
// constructor overloading is a technique in java in which a class can have any number of constructors that differ in parameter list.

// what is constructor chaining?
// constructor chaining is the process of calling one constructor from another constructor with respect to current object.

// what is super keyword?
// super keyword is used to refer immediate parent class instance variable.

// Can a constructor be private? If so, why would you make a constructor private?
// Answer: Yes, a constructor can be made private in Java. This is often done to implement the Singleton design pattern, where only one instance of a class is allowed. By making the constructor private, you prevent direct instantiation of the class from outside and ensure that the class controls the creation of its instances.


// Can a constructor call another constructor?
// Answer: Yes, a constructor can call another constructor of the same class. This is called constructor chaining. It can be done in two ways:
// 1. Within same class: this()
// 2. From base class: super()

// Can a constructor be final?
// Answer: No, a constructor can not be final in Java. A final method cannot be overridden by any subclasses. As mentioned above, constructors are not inherited. So, making constructor final does not make any sense. In fact, it will result in a compile-time error.

// Can a constructor be static?
// Static constructor is a constructor that is used to initialize static data members. It is automatically invoked before the first object of the class is created. It is used to initialize the static data members of the class. It is declared using the static keyword.

// Can a constructor be synchronized?
// Answer: No, a constructor cannot be synchronized in Java. Synchronization is used to prevent concurrent access of a shared resource. Constructors are not shared so synchronization is not needed in constructors. In fact, making a constructor synchronized will result in a compile-time error.

// Can a constructor be abstract?
// Answer: No, a constructor cannot be abstract in Java. Abstract means incomplete. A constructor is used to initialize instance variables. If a constructor is abstract, then instance variables will not get initialized and will remain uninitialized. So, making a constructor abstract does not make any sense. In fact, it will result in a compile-time error.

class A {
    int a;
    // default constructor
    A() {
        System.out.println("A's constructor called");
    }
    // parameterized constructor
    A(int a) {
        this.a = a;
        System.out.println("A's parameterized constructor called");
    }
    // copy constructor
    A(A obj) {
        a = obj.a;
        System.out.println("A's copy constructor called");
    }
    // constructor overloading
    A(int a, int b) {
        System.out.println("A's constructor overloading called");
    }
    // constructor chaining
    A(int a, int b, int c) {
        this(a, b);
        System.out.println("A's constructor chaining called");
    }
    // super keyword
    A(int a, int b, int c, int d) {
        super();
        System.out.println("A's super keyword called");
    }
    // private constructor
    // where to use private constructor?
    // 1. singleton class - singleton class is a class that can have only one object (instance of the class) at a time.
    // 2. factory method - factory method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
    // 3. to prevent object creation - private constructor is used to prevent object creation of a class.

    private A(int a, int b, int c, int d, int e) {
        System.out.println("A's private constructor called");
    }
    // static constructor
    static {
        System.out.println("A's static constructor called");
    }
    /* final constructor = Error: modifier final not allowed here
        
        final A(int a, int b, int c, int d, int e, int f) {
        System.out.println("A's final constructor called");
        }
    */
    /*synchronized constructor = Error: modifier synchronized not allowed here
        
        synchronized A(int a, int b, int c, int d, int e, int f, int g) {
        System.out.println("A's synchronized constructor called");
        }
    */

    /* abstract constructor = Error: modifier abstract not allowed here
        
        abstract A(int a, int b, int c, int d, int e, int f, int g, int h) {
        System.out.println("A's abstract constructor called");
        }

    */

}
// Example of singleton class having private constructor
// singleton class is a class that can have only one object (instance of the class) at a time.
class Singleton {

    private static Singleton obj;
    private Singleton() {
        // private constructor
    }
    public static Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }
}
// output: can we now create object of Singleton class?
// Singleton obj = new Singleton(); // Error: Singleton() has private access in Singleton


// Example of factory method having private constructor
class Factory {
    private Factory() {
        // private constructor
    }
    public static Factory getInstance() {
        Factory obj = new Factory();
        return obj;
    }
}
// output: can we now create object of Factory class?
// Factory obj = new Factory(); // Error: Factory() has private access in Factory


// Example of private constructor to prevent object creation
// class PreventObjectCreation {
//     private PreventObjectCreation() {
//         // private constructor
//     }
//     public static void main(String[] args) {
//         // PreventObjectCreation obj = new PreventObjectCreation(); // Error: PreventObjectCreation() has private access in PreventObjectCreation
//     }
// }


// Actual example of super keyword

// parent class 
class Parent {
    // instance variable
    int a;
    // default constructor
    Parent() {
        System.out.println("Parent's default constructor called");
    }
    // parameterized constructor
    Parent(int a) {
        this.a = a;
        System.out.println("Parent's parameterized constructor called");
    }
}
// child class which inherits Parent class 
// inheritence is a mechanism in which one object acquires all the properties and behaviors of a parent object.
class Child extends Parent {
    // instance variable
    int b;
    // default constructor
    Child() {
        System.out.println("Child's default constructor called");
    }
    // parameterized constructor
    Child(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("Child's parameterized constructor called");
    }
    void display() {
        System.out.println("a = " + a + " b = " + b);
    }
}



// Deep copy vs shallow copy IN JAVA

// what is shallow copy?
// shallow copy is a bit-wise copy of an object. a new object is created that has an exact copy of the values in the original object. if any of the fields of the object are references to other objects, just the reference addresses are copied i.e., only the memory address is copied.

// what is deep copy?
// deep copy is a process in which the copying process occurs recursively. it means first constructing a new object in memory and then recursively populating it with copies of the child objects found in the original object. in case of deep copy, a copy of object is copied in other object. it means that any changes made to a copy of object do not reflect in the original object.

// Example : Shallow copy in Java
class Course {
    String subject1;
    String subject2;
    String subject3;
    public Course(String sub1, String sub2, String sub3) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
    }
}

// Now see main function having Shallow copy example
// It print Mathematics for both science and maths object
// because both science and maths object refer to same object
// and any changes made to a copy of object do reflect in the original object.

// Example : Deep copy in Java
class Course1 {
    String subject1;
    String subject2;
    String subject3;
    public Course1(String sub1, String sub2, String sub3) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
    }
    // copy constructor implementation to create a deep copy

    public Course1(Course1 course) {
        this.subject1 = course.subject1;
        this.subject2 = course.subject2;
        this.subject3 = course.subject3;
    }

    // another way to create a deep copy is using clone() method
    // @Override
    // protected Object clone() throws CloneNotSupportedException { 
    //     return super.clone();
    // }
    // how to use clone() method?
    // Course1 science = new Course1("Physics", "Chemistry", "Biology");
    // Course1 maths = (Course1) science.clone();

}
// Now see main function having Deep copy example
// It print Physics for science object
// and Mathematics for maths object
// because both science and maths object refer to different object


public class constructorsCode {
    
    public static void main(String[] args) {
        
        A obj1 = new A(); // default constructor called
        A obj2 = new A(10); // parameterized constructor called
        A obj3 = new A(obj2); // copy constructor called
        A obj4 = new A(10, 20); // constructor overloading called
        A obj5 = new A(10, 20, 30); // constructor chaining called
        A obj6 = new A(10, 20, 30, 40); // super keyword called

        Child obj7 = new Child(); // Parent's default constructor called
        Child obj8 = new Child(10, 20); // Parent's parameterized constructor called
        obj8.display(); // a = 10 b = 20

        // Shallow copy in Java
        Course science = new Course("Physics", "Chemistry", "Biology");
        Course maths = science;
        maths.subject1 = "Mathematics";
        System.out.println(science.subject1); // Mathematics
        System.out.println(maths.subject1); // Mathematics

        // Deep copy in Java
        Course1 science1 = new Course1("Physics", "Chemistry", "Biology");
        Course1 maths1 = new Course1(science1);
        maths1.subject1 = "Mathematics";
        System.out.println(science1.subject1); // Physics
        System.out.println(maths1.subject1); // Mathematics

        // Example of singleton class having private constructor
        Singleton obj9 = Singleton.getInstance();
        Singleton obj10 = Singleton.getInstance();
        System.out.println(obj9); // Singleton@1b6d3586
        System.out.println(obj10); // Singleton@1b6d3586
        
        
    }
}
