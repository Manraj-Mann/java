// What is encapsulation in Java?
// Encapsulation is a mechanism where you bind your data(variables) and code(methods) together as a single unit.
// Here, variables are referred to as properties and methods as behaviors.
// It is one of the four fundamental OOP concepts.
// The other three are inheritance, polymorphism, and abstraction.

// why encapsulation?
// 1. To achieve data hiding - hide variables from other classes, cant be accessed directly
// 2. To increase reusability - can be used by other classes by providing public getter and setter methods

// Difference between abstraction and encapsulation
// Abstraction hides the implementation details whereas encapsulation hides the data.
// In encapsulation, the data in a class is hidden from other classes, which can use it through methods.
// In abstraction, implementation complexities are hidden using abstract classes and interfaces.


class Human{

    private int age; // private = restricted access , cant be accessed outside the class
    String name = "Default"; // default = accessible within the package

    public void introduce(){
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }

    // how to access private variables outside the class?
    // use getters and setters

    public void setAge(int age){
        if(age > 30){
            System.out.println("You are too old to be a student.");
        }
        else{
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

}
public class encapsulate {
    
    public static void main(String[] args) {
        
        Human obj = new Human();
        // obj.age = 20; // error
        obj.setAge(20);
        System.out.println(obj.getAge());

        obj.introduce();

    }
}
