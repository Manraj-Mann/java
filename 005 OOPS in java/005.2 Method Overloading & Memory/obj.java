class Calculator {

    // Method overloading - same method name but different parameters
    // Method overloading is not possible by changing return type of method only

    // Rules : 
    // 1. Number of parameters - different
    // 2. Data type of parameters - different
    // 3. Sequence of data type of parameters - different
    // 4. Return type - can be same or different


    public int add(int n, int m) {
        return n + m;
    }

    public int add(int n, int m, int q) {
        return n + m + q;
    }
    public double add(double n, int m, int q, int r) {
        return n + m + q + r;
    }

    // Local variable - variable declared inside a method and have scope only inside that method
    // Instance variable - variable declared inside a class and have scope inside all methods of that class
    // Static variable - variable declared inside a class and have scope inside all methods of that class and can be accessed using class name 



};

public class obj {

    public static void main(String[] args) {

        // here c1 is the reference variable of Calculator class
        // new Calculator() is the object of Calculator class inside the heap memory
        // c1 is pointing to the object inside the heap memory
        // Refrence Variable : These are the variables which stores the address of the object

        Calculator c1 = new Calculator();
        System.out.println(c1.add(2, 3));
        System.out.println(c1.add(2, 3, 4));
        System.out.println(c1.add(2.0, 3, 4, 5));

        // Heap memory - memory which is allocated at runtime
        // Stack memory - memory which is allocated at compile time

        // The heap memory is only allocated to the object of the class but the methods inside the class are stored inside the stack memory
        // The pointer of the method is stored inside the heap memory
        // what about instance variables ? - they are stored inside the heap memory
        
        
        // Example in main : 
        // c1 is the reference variable of Calculator class and it is stored inside the stack memory
        // new Calculator() is the object of Calculator class inside the heap memory
        // c1 is pointing to the object inside the heap memory
        // Now if i will call add method it will be executed inside the stack memory and the pointer of the method will be stored inside the heap memory


    }

};
