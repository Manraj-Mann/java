
// What is Generic ? 
// Generic means parameterized types. The idea is to allow type (Integer, String, … etc, and user-defined types) to be a parameter to methods, classes, and interfaces. For example, classes like HashSet, ArrayList, HashMap, etc use generics very well. We can use them for any type. They work only for objects and not for the primitive types (int, char, … etc). For those, we use wrapper classes.

// What is a wrapper class ?
// A Wrapper class is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. In other words, we can wrap a primitive value into a wrapper class object.

// Why do we need Generic ?
// Generics add stability to your code by making more of your bugs detectable at compile time.
// Generics provide compile-time type safety that allows programmers to catch invalid types at compile time.
// Using generics, programmers can implement generic algorithms that work on collections of different types, can be customized, and are type safe and easier to read.
// Generics eliminate the need for casting the object to the correct type.

import java.util.Iterator;

class OurGenericList<T> implements Iterable<T> {

    private T[] items;
    private int size;

    public OurGenericList() {
        items = (T[]) new Object[100]; // This is how we create an array of generic type
        size = 0;
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T get(int index){

        return items[index];
    }

    // how to make the array iterable by keeping it private
    // Solution : Use Iterable interface
    @Override
    public Iterator<T> iterator() {

        // here we return the iterator object of current object
        return new OurGenericListIterator(this);
    }

    // Making the inner class private so that it can't be accessed from outside
    private class OurGenericListIterator implements Iterator<T> {

        // to iterate over the list using iterator we will first need to have the list
        private OurGenericList<T> list;
        // we will also need to keep track of the index
        private int index = 0;
        // we will pass the list to the constructor
        OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            System.out.println("hasNext called");
            return index < list.size;
        }

        @Override
        public T next() {
            System.out.println("next called");
            return list.items[index++];
        }
    }






    
    
}

public class Collections_test{

    public static void main(String[] args) {
        

        // Create a list of integers and invoke the constructor
        OurGenericList<Integer> list = new OurGenericList<>();

        // Add some integers to the list
        list.add(1);
        list.add(2);
        list.add(3);

        // Get the first item in the list
        int number = list.get(0);
        System.out.println(number);

        // create an iterator object

       Iterator<Integer> it = list.iterator();
       while(it.hasNext()){
            System.out.println(it.next());
       }

       // alternate - equivalent to above while loop , compiler converts the below code to the above one
       for (int x : list) {

            System.out.println(x);
       }

 



    }
}