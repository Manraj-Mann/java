
// What is the use of this keyword in Java?

// this keyword in Java is a reference variable that refers to the current object.  (done)
// this keyword can be used to refer current class instance variable.  (done)
// this keyword can be used to invoke current class method (implicitly). (done)
// this keyword can be passed as an argument in the method call. (done)
// this keyword can be passed as argument in the constructor call.  (done)

// Example 1 : 
class Person {
    String name;

    Person(String name) {
        this.name = name; // Referring to current class instance variable
    }

    void introduceYourself() {
        System.out.println("Hello, my name is " + this.name); // Implicitly invoking current class method
    }

    void changeName(String newName) {
        this.name = newName; // Referring to current class instance variable
    }

    void displayInfo() {
        printInfo(this); // Passing 'this' as an argument in method call
    }

    static void printInfo(Person person) {
        System.out.println("Name: " + person.name);
    }
}

// Example 2 :
class Calculator {
    int result;

    Calculator() {
        result = 0;
    }

    void add(int num) {
        result += num;
    }

    void subtract(int num) {
        result -= num;
    }

    void displayResult() {
        System.out.println("Result: " + result);
    }

    void performOperations(int a, int b) {
        this.add(a); // Invoking 'add' method using 'this'
        this.subtract(b); // Invoking 'subtract' method using 'this'
        this.displayResult(); // Invoking 'displayResult' method using 'this'
    }
}

// Example 3 : 

class Student {
    int rollno;
    String name, course;
    float fee;

    Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    Student(int rollno, String name, String course, float fee) {
        this(rollno, name, course); // Reusing constructor
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}

// Example 4 : Using 'this' keyword as a constructor argument
class A {
    B b;

    A(B b) {

        this.b = b;
    }
    void display() {
        System.out.println(b.i);
    }
}
class B{

    int i;
    B(int i) {
        
        this.i = i;
        System.out.println("B is created");
    }
}

// Issue if we dont use this 
class temp{

    int age;
    temp(int age){

        // why age is not setting the class instance variable as value passed ?
        // because by default priority is given to local storage of method
        // age = age; // 
        // correct way : 
        this.age = age;
    }
}

public class thisKeyword {

    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.introduceYourself();
        person.changeName("Bob");
        person.displayInfo();

        Calculator calculator = new Calculator();
        calculator.performOperations(10, 5);

        Student student1 = new Student(111, "ankit", "java");
        Student student2 = new Student(112, "sumit", "java", 6000f);
        student1.display();
        student2.display();

        B b = new B(100);
        A a = new A(b);
        a.display();
        
    }

    
}
