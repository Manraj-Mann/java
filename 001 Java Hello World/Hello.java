// How to compile a java file ?

// 1. javac Hello.java => generates the class file which is the compiled file in form of byte code
// 2. java Hello => executes the class file


// How java works ?

// JVM - Java Virtual Machine
// JRE - Java Runtime Environment
// JDK - Java Development Kit

// JDK = JRE + Development Tools

// Java is a platform independent language
// Our machine have hardware , OS controls the access to the hardware 
// JRE is a software which is installed on the OS which provides the environment to run the java program 
// JVM is a part of JRE which converts the byte code into machine code and then OS executes the machine code

// javacode (.java) -----> compiler (javac) -----> byte code (.class file ) -----> JVM (runs .class file ) -----> JRE ------> OS -----> Hardware

// 2. Java is a strongly typed language which means we need to add datatype to the variables



public class Hello{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}