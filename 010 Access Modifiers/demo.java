import others.*;

// Access Modifiers - public, private, protected, default

// public - can be accessed from anywhere
// private - can be accessed only from the same class
// protected - can be accessed from the same package and from the child/subclass of other package  
// default - can be accessed from the same package

// Note: If we don't specify any access modifier, then it is by default default

class C {

    private int marks = 80;
}
class D extends temp{ 

    public void show() {
        System.out.println(marks2); // can access marks2 as it is protected
    }

}

public class demo {

    public static void main(String[] args) {
        
        // temp t = new temp();
        // System.out.println(t.marks); // can't access marks as it is private to package others

        B b = new B();
        System.out.println(b.marks); // access marks as it is in same package

        // Now if we make the marks public in temo.java, then we can access it from anywhere   

        temp t = new temp();
        System.out.println(t.marks); // now accesible

        C c = new C();
        // System.out.println(c.marks); // can't access marks as it is private to class C

        
        // t.marks2 = 300; // can't access marks2 as it is protected in other package
        // System.out.println(t.marks2); // can't access marks2 as it is protected in other package
        
        // but can be accessed from the child/subclass of other package
        D d = new D();
        d.show(); // can access marks2 as it is protected

    }
    

}
