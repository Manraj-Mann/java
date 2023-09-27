
// what is polymorphism?
// poly means many and morphism means forms
// polymorphism is the ability of an object to take on many forms

// why polymorphism ?
// polymorphism allows us to perform a single action in different ways
// polymorphism is considered as one of the important features of object oriented programming

// types of polymorphism
// 1. compile time polymorphism - method overloading
// 2. run time polymorphism - method overriding

// what is compile time polymorphism?
// compile time polymorphism is also known as static polymorphism as the binding happens at compile time
// method overloading is an example of compile time polymorphism as the binding of method call to its definition happens at compile time
// binding means = linking of a method call to its definition

// what is run time polymorphism?
// run time polymorphism is also known as dynamic polymorphism as the binding happens at run time
// method overriding is an example of run time polymorphism as the binding of method call to its definition happens at run times
// binding means = linking of a method call to its definition

// what is dynamic method dispatch?
// dynamic method dispatch is a mechanism by which a call to an overridden method is resolved at run time
// this is how java implements run time polymorphism

// Dynamic method dispatching, also known as runtime polymorphism, is a fundamental concept in object-oriented programming where the appropriate method implementation is determined at runtime based on the actual object type, rather than the reference type. This is achieved through method overriding and inheritance. Here's an example in Java:

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}


class A{

    public void show(){
        System.out.println("in A");
    }

}
class B extends A{

    @Override
    public void show(){
        System.out.println("in B");
    }
}


public class poly { 


    public static void main(String[] args) {
        

        B obj1 = new B();
        obj1.show();

        // As B extends A, we can store reference of B in A
        A obj2 = new B();
        obj2.show();
        // if we don't create show() method in B, then it will call show() method of A
        // why ? because obj2 is of type A and it will call show() method of A

        // Example of dynmaic method dispatching

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Output: Dog barks
        animal2.makeSound(); // Output: Cat meows
        
        //  appropriate method implementation is determined at runtime based on the actual object type, rather than the reference type. 
        
    }


    
}
