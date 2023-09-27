/*
 * 
 * Data Types in java are of two types -
 * 
 * 1. Primitive Data Types
 * 2. Non-Primitive Data Types
 * 
 * 
 * 1. Primitive Data Types : 
 *    - Integer - byte, short, int, long
 *    - Character - char
 *    - Boolean - boolean
 *    - Floating Point - float, double
 * 
*/

public class Datatypes {

    public static void main(String[] args) {
        
        int a = 10;
        char b = 'A';
        float c = 10.5f;
        double d = 10.5;
        boolean e = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        /*
         * Size of data types
         * 
         * int     - 4 bytes     range = -2^31 to 2^31 - 1
         * char    - 2 bytes     range = 0 to 2^16 - 1
         * float   - 4 bytes     range = 1.4E-45 to 3.4E+38
         * double  - 8 bytes     range = 4.9E-324 to 1.7E+308
         * boolean - 1 byte      range = true or false
         * short   - 2 bytes     range = -2^15 to 2^15 - 1
         * byte    - 1 byte      range = -2^7 to 2^7 - 1
         * long    - 8 bytes     range = -2^63 to 2^63 - 1
         * 
        */

        System.out.println("Size of int = " + Integer.SIZE/8 + " bytes");
        System.out.println("Size of char = " + Character.SIZE/8 + " bytes");
        System.out.println("Size of float = " + Float.SIZE/8 + " bytes");
        System.out.println("Size of double = " + Double.SIZE/8 + " bytes");
        System.out.println("Size of boolean = " + Byte.SIZE/8 + " bytes");
        System.out.println("Size of short = " + Short.SIZE/8 + " bytes");
        System.out.println("Size of byte = " + Byte.SIZE/8 + " bytes");
        System.out.println("Size of long = " + Long.SIZE/8 + " bytes");
        

        /*
         * JAVA uses unicode system not ASCII
         * 
         * Difference between ASCII and Unicode 
         * is that ASCII is a 7-bit code,
         * but Unicode uses 16 bits to represent each character.
         * Therefore , Unicode can represent many more characters than ASCII.
         * 
        */

        char ch = 'A';
        System.out.println((int)ch);

        /*
         * Strings in JAVA
         * 
         * In java , string is an object that represents a sequence of characters.
         * How to use strings ? 
         * Make an object of String class and use it.
         * Example : String str = new String("Hello World");
        */

        String str = "Hello World";
        System.out.println(str);

        /*
         * 
         * Type Casting
         * 
         * 1. Implicit Type Casting - done by compiler
         * 2. Explicit Type Casting - done by user
         * 
         * 
         * 1. Implicit Type Casting - We can perform the widening type casting implicitly
         * because the compiler does it for you. Why ? Because the compiler knows that
         * the value will fit in the type.
         * 
         * byte -> short -> int -> long -> float -> double
         * 
         * 2. Explicit Type Casting - We can perform the narrowing type casting explicitly
         * only when we are sure that the value will fit in the type.
         * 
         * double -> float -> long -> int -> short -> byte
         * 
         * How to do the explicit type casting ? 
         * There are two ways to do it.
         * 1. By using parenthesis
         * 2. By using type conversion functions
         * 
         * 1. By using parenthesis : We can just put the required type in the parenthesis
         * before the value to be converted.
         * Example : int a = (int) 10.5;
         * 2. By using type conversion functions : We can use the type conversion functions
         * to convert the value.
         * 
         * Example 1 : int a = (int) Math.round(10.5);
         * Example 2 : int a = Integer.parseInt("10");
         * Example 3 : int a = Integer.valueOf("10");
         * Example 4 : int a = Integer.valueOf("10").intValue();
         * Example 5 : int a = Integer.valueOf("10").floatValue();
         * Example 6 : int a = Integer.valueOf("10").doubleValue();
         * 
         * Examples with changing the base of number : 
         * 
         * Example 1 : int a = Integer.parseInt("1010", 2);
         * Example 2 : int a = Integer.parseInt("A", 16);
         * Example 3 : int a = Integer.parseInt("12", 8);
         * 
         * Examples changing the data type :
         * 
         * Example 1 : int a = Integer.parseInt("10");
         * Example 2 : float a = Float.parseFloat("10.5");
         * Example 3 : double a = Double.parseDouble("10.5");
         * Example 4 : long a = Long.parseLong("10");
         * 
         * All type conversion functions :
         * 1. Integer.parseInt() - converts string to integer
         * 2. Integer.valueOf() - converts string to integer
         * 3. Integer.valueOf().intValue() - converts string to integer
         * 4. Integer.valueOf().floatValue() - converts string to float
         * 5. Integer.valueOf().doubleValue() - converts string to double
         * 6. Integer.parseInt("1010", 2) - converts string to integer with base 2
         * 7. Integer.parseInt("A", 16) - converts string to integer with base 16
         * 8. Integer.parseInt("12", 8) - converts string to integer with base 8
         * 9. Float.parseFloat() - converts string to float
         * 10. Double.parseDouble() - converts string to double
         * 11. Long.parseLong() - converts string to long
         * 12. Byte.parseByte() - converts string to byte
         * 13. Short.parseShort() - converts string to short
         * 14. Boolean.parseBoolean() - converts string to boolean
         * 15. Character.toString() - converts character to string
         * 16. String.valueOf() - converts any data type to string
         * 
        */

        // Logical operators :
        // && - AND
        // || - OR
        // ! - NOT

        System.out.println(10 > 5 && 10 > 20);
        System.out.println(10 < 5 || 10 > 20);
        System.out.println(!(10 > 5));

        // Bitwise operators :
        // & - AND - 2 & 1 = 0
        // | - OR - 2 | 1 = 3
        // ^ - XOR - 2 ^ 1 = 3
        // ~ - NOT - ~2 = -3
        // << - Left Shift - 2 << 1 = 4
        // >> - Right Shift - 2 >> 1 = 1
        // >>> - Unsigned Right Shift - 2 >>> 1 = 1

        System.out.println(2 & 1);
        System.out.println(2 | 1);
        System.out.println(2 ^ 1);
        System.out.println(~2);
        System.out.println(2 << 1);
        System.out.println(2 >> 1);
        System.out.println(2 >>> 1);

        // Assignment operators :
        // = - Simple Assignment Operator
        // += - Add AND Assignment Operator
        // -= - Subtract AND Assignment Operator
        // *= - Multiply AND Assignment Operator
        // /= - Divide AND Assignment Operator
        // %= - Modulus AND Assignment Operator
        // <<= - Left Shift AND Assignment Operator
        // >>= - Right Shift AND Assignment Operator
        // &= - Bitwise AND Assignment Operator
        // ^= - Bitwise XOR Assignment Operator
        // |= - Bitwise OR Assignment Operator

        int x = 10;
        x += 5;
        System.out.println(x);

        // Ternary Operator :
        // ? : - Ternary Operator

        int y = 10;
        int z = 20;
        int max = (y > z) ? y : z;
        System.out.println( "max - "+ max);

        // What is short circuiting ?
        // Short circuiting is a concept in which the second argument is executed only if the first argument is true. 
        // For example, in the expression (a > b) && (c > d), if a > b evaluates to false, then c > d is not evaluated.

        int a1 = 10;
        int b1 = 20;
        int maxi = (a1 > b1) ? a1 : b1;
        System.out.println( "maxi - "+ maxi);


        // What is the difference between & and && ?
        // & is a bitwise operator and && is a logical operator.
        // & evaluates both sides of the operation.
        // && evaluates the left side of the operation, if it is true, then it evaluates the right side.

        // What is autoboxing and unboxing in Java?
        // Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
        // For example, converting an int to an Integer, a double to a Double, and so on.
        // If the conversion goes the other way, this is called unboxing.

        // Example of autoboxing :
        Integer i = 10; // autoboxing
        // Example of unboxing :
        int j = i; // unboxing
        System.out.println(i + " " + j);
        
        // What is a wrapper class in Java?
        // A wrapper class is a class whose object wraps or contains a primitive data types.
        // When we create an object to a wrapper class, it contains a field and in this field, we can store a primitive data types.
        // In other words, we can wrap a primitive value into a wrapper class object.
        // Example : Integer, Long, Double, etc.
        Character ch1 = 'a';
        System.out.println(ch1);
        
        // Need of wrapper classes ?
        // They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
        // The classes in java.util package handles only objects and hence wrapper classes help in this case also.
        // Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.


        // What is the difference between equals() and == in Java?
        // equals() method is defined in Object class in Java and used for checking equality of two objects defined by business logic.
        // == operator is one of the comparison operators, which is used for checking equality of two variables or objects.
        // equals() method is meant for comparing the contents of two objects.
        // == operator is used for comparing primitives and objects. It compares values of two objects in the memory.

        // Example of equals() method :
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1.equals(s2)); // true
        // Example of == operator :
        String s3 = new String("HELLO");
        String s4 = new String("HELLO");
        System.out.println(s3 == s4); // false
        // Why s1.equals(s2) is true but s3 == s4 is false ?
        // Because equals() method compares the values of two objects.
        // == operator compares the references of two objects.

        // Correct way of using == operator :
        String s5 = new String("HELLO");
        String s6 = s5;
        System.out.println(s5 == s6); // true , now s5 and s6 are pointing to the same object

        // How can you prevent a loss of data during narrowing type casting?
        // Narrowing type casting can cause loss of data. For example, converting a double value to an int value will result in loss of data.
        // To prevent data loss during narrowing type casting, you can use appropriate techniques like range checking, rounding, or truncating.
        // Example 1 - round off - round = round to nearest integer:
        int a2 = (int) Math.round(10.5);
        System.out.println(a2);
        // Example 2 - floor = round down:
        int a3 = (int) Math.floor(10.5);
        System.out.println(a3);
        // Example 3 - ceil = round up:
        int a4 = (int) Math.ceil(10.5);
        System.out.println(a4);
        // Example 4 - truncate = remove decimal part:
        int a5 = (int) 10.5;
        System.out.println(a5);
        // Example 5 - range checking = check if value is in range:
        int a6 = (int) 10.5;
        if (a6 < Integer.MAX_VALUE && a6 > Integer.MIN_VALUE) {
            System.out.println(a6);
        } else {
            System.out.println("Out of range");
        }


        
    }
    
}
