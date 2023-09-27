
// final class - restrict inheritance
final class finalClass{
    void show(){
        System.out.println("in A");
    }
}


// Error : can't extend it , stoping the inheritance 

// class newclass extends finalClass{


// }


// final method  - restrict behavioral change of parent class
class A{
    final void show(){
        System.out.println("in A");
    }
}

class B extends A{

    // this will give an error as we cannot override a final method
    // @Override
    // public void show(){
    //     System.out.println("in B");
    // }
}
public class fin {



    // what is final keyword ?
    // final keyword is used to restrict the user to change the value of variable
    //  or to extend the class or to override a method
    // final keyword can be used with variables, methods and classes

    public static void main(String[] args) {
        
        // final variable - restrict chnage of data members
        final int i = 10;
        // i = 20; // this will give an error
        System.out.println(i);

    }

    
}
