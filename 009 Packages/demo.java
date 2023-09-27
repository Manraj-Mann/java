// Purpose: To test the adv class


import Codes.adv; // IMPORTING THE adv CLASS FROM THE Codes PACKAGE
import java.util.ArrayList; // IMPORTING THE ArrayList CLASS FROM THE java.util PACKAGE

// by default the java.lang.* package is imported
// * means all the classes in the package
// for example in Codes package we have 2 classes calc and adv so we can import both of them using Codes.*
// Note : * only imports the classes in the package not the sub-packages of the package
public class demo {
    
    public static void main(String[] args) {
        
        adv c = new adv();
        System.out.println(c.add(5, 4));
        System.out.println(c.sub(5, 4));
        System.out.println(c.mul(5, 4));
        System.out.println(c.div(5, 4));

        // using ArrayList from java.util package
        ArrayList arr = new ArrayList();
        arr.add(1);
    }
}
