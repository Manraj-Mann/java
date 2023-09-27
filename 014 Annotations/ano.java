// what is annotation?
// annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.

// Annotations are typically marked using the @ symbol followed by the annotation name, and they can include parameters or values as needed. Annotations can be applied to a variety of code elements, and they serve various purposes such as documentation, code generation, and runtime behavior customization.


// Here are a few common use cases of annotations in Java:

// 1. Documentation and Comments: Annotations can be used to generate API documentation. For example, the @Deprecated annotation marks a method or class as deprecated, indicating that it's no longer recommended for use.
// 2. Compile-Time Checks: Annotations can trigger compile-time checks or code generation. For instance, the @Override annotation is used to indicate that a method is intended to override a method in a superclass. If the method doesn't actually override a superclass method, the compiler will produce an error.
// 3. Framework Configuration: Many Java frameworks use annotations to configure and customize behavior. For example, in the Spring Framework, annotations are used to define beans, wire dependencies, and specify aspects of the application's behavior.
// 4. Testing and Quality Assurance: Testing frameworks like JUnit use annotations to mark methods as test cases. Annotations can also be used for defining code quality rules and generating reports using tools like Checkstyle or FindBugs.
// 5. Runtime Behavior: Some annotations affect the runtime behavior of the code. For example, the @SuppressWarnings annotation can be used to suppress compiler warnings, and the @Transactional annotation in Spring indicates that a method should be executed within a transactional context.
@Deprecated
class OldApi {
    // ...
}

class NewApi {
    @Override
    public String toString() {
        return "NewApi";
    }

    @SuppressWarnings("unused")
    public void unusedMethod() {
        // ...
    }
}

// Some common annotations in Java are:
// 1. @Override: Indicates that a method declaration is intended to override a method declaration in a superclass.
// 2. @Deprecated: Indicates that a method, class, or field is deprecated and should no longer be used.
// 3. @SuppressWarnings: Suppresses compiler warnings for the annotated element.
// 4. @SafeVarargs: Indicates that the elements of a varargs parameter are used safely, i.e. they won't be stored in a data structure that's shared between multiple threads.
// 5. @FunctionalInterface: Indicates that an interface is intended to be a functional interface, i.e. an interface with a single abstract method.
// 6. @Retention: Indicates how long annotations with the annotated type are to be retained. For example, the @Retention(RetentionPolicy.RUNTIME) annotation indicates that annotations with this type should be available at runtime via reflection.
// 7. @Target: Indicates the kinds of program element to which an annotation type is applicable. For example, the @Target(ElementType.METHOD) annotation indicates that the annotation can only be applied to methods.

// .... 

class A{

    void showk(){

        System.out.println("In A show");
    }
}
class B extends A{

    @Override
    void showk(){

        System.out.println("In B show");
    }
}
public class ano {

    public static void main(String[] args) {
        
        B obj = new B();
        obj.showk();
    }
    
}
