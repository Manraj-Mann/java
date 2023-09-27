public class demo {

    public static void main(String[] args) {

        // Strings in java
        String name = "John";
        System.out.println(name);

        // String is a class in java which is used to store text data
        // String is not a primitive data type in java
        // String is a sequence of characters
        // String is immutable in java
        // String is a reference data type in java

        String nname = new String("John");
        System.out.println(nname);
        
        // Difference between name and nname ?
        // name is a string literal stored in string pool
        // What is a string constant pool ?
        // Example : 
        String s1 = "Hello";
        String s2 = "Hello";
        // s1 and s2 are string literals stored in string constant pool

        // Therefore s1 and s2 both are refrencing to the same object in the string constant pool
        System.out.println(s1 == s2); // true

        // String constant pool is a memory area in heap memory where all the string literals are stored
        // nname is a string object stored in heap memory

        // Important methods of String class : 
        // 1. length() : returns the length of the string
        // 2. charAt(index) : returns the character at the specified index
        // 3. substring(startIndex, endIndex) : returns the substring from startIndex to endIndex - 1
        // 4. toUpperCase() : returns the string in uppercase
        // 5. toLowerCase() : returns the string in lowercase
        // 6. trim() : removes the leading and trailing spaces from the string
        // 7. equals() : compares two strings
        // 8. equalsIgnoreCase() : compares two strings ignoring the case
        // 9. startsWith() : checks if the string starts with the specified string
        // 10. hashCode() : returns the hashcode of the string - hashcode is a unique integer value associated with every object in java
        // 11. indexOf() : returns the index of the first occurence of the specified character
        // 12. lastIndexOf() : returns the index of the last occurence of the specified character
        // 13. replace() : replaces the old character with the new character
        // 14. replaceAll() : replaces the old string with the new string
        // 15. split() : splits the string into an array of strings based on the specified delimiter
        
        String s = "Hello World";
        System.out.println( "Length - " + s.length());
        System.out.println( s.charAt(0));
        System.out.println( s.substring(0, 5));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.equals("Hello World"));
        System.out.println(s.equalsIgnoreCase("hello world"));
        System.out.println(s.startsWith("Hello"));
        System.out.println(s.hashCode());
        System.out.println(s.indexOf('o'));
        System.out.println(s.lastIndexOf('o'));
        System.out.println(s.replace('o', 'a'));
        System.out.println(s.replaceAll("Hello", "Hi"));
        System.out.println(s.split(" ")[0]);
        System.out.println(s.split(" ")[1]);
        

        // appending in string
        s1 += s2; // s1 will be updated to "Hello World" in the string constant pool and old "Hello" will be garbage collected
        // Garbage collection is a process in java which is used to destroy the unused objects in the heap memory
        // It is done automatically by the JVM
        System.out.println(s1 + " " + s2);

        // Example of immutable strings - we call a string immutable because we cannot change the value of a string once it is created but we can change the reference of it to new string
        String s3 = "Hello"; // 
        s3 += " World"; // s3 will be updated to "Hello World" in the string constant pool and old "Hello" will be garbage collected
        System.out.println(s3);


        // String Buffer and String Builder
        // String Buffer and String Builder are mutable strings

        // String Buffer is thread safe which implies that it is synchronized with the threads and hence it is slow in performance
        // String Builder is not thread safe which implies that it is not synchronized with the threads and hence it is fast in performance

        // String Buffer and String Builder are used when we need to perform a lot of string operations

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

        // String k  = sb.toString(); else it will give error

        // Example of thread safe :
        // Suppose we have two threads t1 and t2
        // t1 is appending "Hello" to the string buffer
        // t2 is appending "World" to the string buffer
        // t1 will append "Hello" to the string buffer and then t2 will append "World" to the string buffer
        // Hence the final string will be "HelloWorld"
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                sb.append("Hello");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sb.append("World");
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println(sb);

        // String Builder 
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println(sb2);

        // Example of not thread safe :
        // Suppose we have two threads t1 and t2
        // t1 is appending "Hello" to the string builder
        // t2 is appending "World" to the string builder
        // t1 and t2 will append "Hello" and "World" to the string builder simultaneously
        // Hence the final string will be "HelloWorld" or "WorldHello"
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                sb2.append("Hello");
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                sb2.append("World");
            }
        });
        t3.start();
        t4.start();
        try {
            t3.join();
            t4.join();
        }
        catch(Exception e) {
            System.out.println(e);
        }


    }
    
}
