// Exception handling in Java is a mechanism that allows you to gracefully handle unexpected or exceptional situations that can occur during the execution of a program. These situations, known as exceptions, can include runtime errors, invalid input, file I/O errors, network failures, and more. Java provides a robust and structured way to manage exceptions using a combination of try, catch, and finally blocks.

// Types of Exceptions : - 

// 1. Checked Exceptions: These are exceptions that the Java compiler requires you to handle explicitly using try-catch blocks or declare with the throws keyword in the method signature. Examples include IOException, SQLException, and ClassNotFoundException.
// 2. Unchecked Exceptions (Runtime Exceptions): These exceptions do not require explicit handling, although you can still handle them if desired. They are subclasses of the RuntimeException class and include cases like NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class MyException extends Exception {
    public MyException(String message) {
        
        super(message);
    }
}

public class exec {

    public static void main(String[] args) {

        // 1. Try-Catch Blocks : 
        // The try block encloses the code that might throw an exception. If an exception occurs within the try block, the corresponding catch block(s) can handle and process the exception. A single try block can be followed by one or more catch blocks to handle different types of exceptions

        // try {
        //     // Code that might throw an exception
        // } catch (ExceptionType1 e1) {
        //     // Handle exception of type ExceptionType1
        // } catch (ExceptionType2 e2) {
        //     // Handle exception of type ExceptionType2
        // } finally {
        //     // Optional block that is executed regardless of whether an exception occurred
        // }

        // 2. Throwing Exceptions : You can throw exceptions explicitly using the throw keyword. This is useful when you want to indicate that a particular exceptional condition has occurred in your code.

        // if (condition) {
        //     throw new MyException("Custom exception message");
        // }

        // 3. Creating Custom Exceptions : You can create your own custom exceptions by extending the built-in exception classes. This is useful when you want to represent specific types of errors in your application.

        // class MyException extends Exception {
        //     public MyException(String message) {
        //         super(message);
        //     }
        // }
        
        // 4. Using finally Block: The finally block is used to specify code that should be executed regardless of whether an exception was thrown. This is often used for releasing resources or performing cleanup actions.
        
        // try {
        //     // Code that might throw an exception
        // } catch (Exception e) {
        //     // Handle the exception
        // } finally {
        //     // Code that will be executed no matter what
        // }

        // 5. try-with-resources Statement: Introduced in Java 7, the try-with-resources statement simplifies resource management by automatically closing resources like files, sockets, etc., when they are no longer needed.

        // try (ResourceType resource = new ResourceType()) {
        //     // Code that uses the resource
        // } catch (Exception e) {
        //     // Handle the exception
        // }

        // 6. Propagation of Exceptions: When a method throws an exception, it must either handle the exception using a try-catch block or declare the exception in its method signature using the throws keyword. This is important when you want to propagate exceptions up the call stack.

        // public void myMethod() throws MyException {
        //     // Code that might throw MyException
        // }
        
        // Example

        int i  = 0;

        int j = 2;

        try {
            // int k = j/i; // exec.java:100: error: integer division result is 0
            int nums [] = {1,2,3,4,5};
            // System.out.println(nums[6]); // exec.java:102: error: array index out of bounds: 6

            String s = null;
            System.out.println(s.length()); // exec.java:104: error: variable s might not have been initialized

        } catch (ArithmeticException e) {

            System.out.println("Error : " + e.getLocalizedMessage() + " occured");


        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Error : " + e.getLocalizedMessage() + " occured");
        }
        catch (Exception e){

            System.out.println("Error : " + e.getLocalizedMessage() + " occured");
        }


        // Throwables :
        // 1. Error : These are exceptional conditions that are external to the application, and that the application usually cannot anticipate or recover from. For example, OutOfMemoryError, StackOverflowError, etc.
        // 2. Exception : These are exceptional conditions that are internal to the application, and that the application usually can anticipate and recover from. For example, FileNotFoundException, ParseException, etc.
    
        // throw v/s throws :
        // 1. throw is used to explicitly throw an exception.
        // 2. throws is used to declare an exception. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.

        // Example :
        int m = 1;
        int k ;

        try{
            
            k = 18/m;
            if (k == 0){

                throw new ArithmeticException("This is an exception");
            }

        }
        catch (ArithmeticException e){

            k = 18/1;
            System.out.println("Error : " + e.getLocalizedMessage() + " occured");
        }
        catch (Exception e){

            System.out.println("This is finally block");
        }

        // custom exception

        try {
            throw new MyException("This is my custom exception");
        } catch (MyException e) {
            System.out.println("Error : " + e.getLocalizedMessage() + " occured");
        }

        // throws example - see readFromFile() method

        
    }
    public static void readFromFile(String filename) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader(filename);
        int character;

        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }

        reader.close();
    }
    
}
