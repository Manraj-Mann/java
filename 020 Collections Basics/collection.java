// Difference between collection API , collection interface and collections class
// Collection API is a set of classes and interfaces that implement commonly reusable collection data structures.
// Collection interface is the root interface of the Java collections framework. It declares the core methods that all collections will have.
// Collections class is a utility class that consists of static methods that operate on or return collections.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class collection {

    public static void main(String[] args) {
        

        // Data Structures in Java are of two types:
        // 1. Primitive Data Structures: These data structures are predefined structures that are used for storing data in a program. For example, integer, character, etc.
        // 2. Non-primitive Data Structures: These data structures are user-defined data structures. For example, array, linked list, etc.

        // Collection is a framework that provides an architecture to store and manipulate the group of objects.


        // Collection c = new // here we use collection interface to create an object of collection class


        // 1. List
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(0);
        c.add(2);
        c.add(3);
        
        System.out.println(c);
        System.out.println(c.get(0));
        System.out.println(c.contains(2));
        System.out.println(c.isEmpty());
        System.out.println(c.indexOf(0));

        for(int o : c){
            System.out.println(o);
        }

        // 2. Set
        // Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.

        Set<Integer> s = new HashSet<Integer>();
        s.add(1);
        s.add(0);
        s.add(2);
        s.add(3);
        s.add(3);

        System.out.println(s);

        Set<Integer> s1 = new TreeSet<Integer>();
        s1.add(1);
        s1.add(0);
        s1.add(2);
        s1.add(3);
        s1.add(-1);

        System.out.println(s1);
        
        Iterator<Integer> i = s1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        // Map

        // Map is an interface which maps a key to value. A map cannot contain duplicate keys and each key can map to at most one value.
        Map<Integer, String> m = new java.util.HashMap<Integer, String>();
        m.put(1, "one");
        m.put(2, "two");
        m.put(3, "three");

        System.out.println(m);
        System.out.println(m.get(1));


        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(0);
        l.add(2);
        l.add(3);

        System.out.println(l);

        Collections.sort(l);

        System.out.println(l);

        Collections.reverse(l);
        
        System.out.println(l);
        
        // custom sort

        Collections.sort(l, (o1, o2) -> o1>o2?1:-1);

        Comparator<Integer> c1 = new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
               
                // 1 : swap
                return o1<o2?1:-1;
            }
            
        };
        Collections.sort(l, c1);

        System.out.println(l);

        // Compareable interface
        // Comparable interface is used to order the objects of the user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object).
        // It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else.

        




        
    }
    
}
