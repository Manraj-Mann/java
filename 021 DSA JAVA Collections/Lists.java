
// Lists
// Lists are Collections that maintain the ordering of their elements.
// Lists are ordered collections of elements, and they allow duplicate elements.
// Lists are position based, and they allow random access to their elements.

// Implementations of List Interface : 
// 1. ArrayList
// 2. LinkedList
// 3. Vector

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        // 1. ArrayList = Resizable array implementation of the List interface
        // ArrayList is a resizable array implementation of the List interface.
        // ArrayList is not thread-safe.
        // ArrayList is not synchronized.
        // ArrayList is faster than LinkedList.
        // ArrayList is a good choice if you want to do a lot of random access on the
        // list.

        // How ArrayList works internally?
        // ArrayList internally uses an array to store the elements.
        // When the array gets filled, ArrayList allocates a new array with a bigger
        // size (50% of its current capacity).
        // ArrayList uses the System.arraycopy() method to copy the elements from the
        // old array to the new array.
        // ArrayList uses the Arrays.copyOf() method to copy the elements from the old
        // array to the new array.
        // ArrayList uses the Arrays.copyOfRange() method to copy the elements from the
        // old array to the new array.

        // ArrayList VS Vector - ( Thread Safe means that it can be used by multiple
        // threads at the same time without any problem.)
        // 1. ArrayList is not synchronized.
        // Vector is synchronized.
        // 2. ArrayList is not thread-safe.
        // Vector is thread-safe.
        // 3. ArrayList is faster than Vector.
        // Vector is slower than ArrayList.
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        // Output: [1, 2, 3]

        numbers.set(0, 1000);
        System.out.println(numbers);
        // numbers.set(100, 0); out of bounds exception

        // copy the list in new list
        List<Integer> numbers2 = new ArrayList<>(numbers);
        System.out.println(numbers2);
 
        // 2. LinkedList = Doubly linked list implementation of the List and Deque
        // interfaces
        // LinkedList is a doubly linked list implementation of the List and Deque
        // interfaces.
        // LinkedList is not thread-safe.
        // LinkedList is not synchronized.
        // LinkedList is slower than ArrayList.
        // LinkedList is a good choice if you want to do a lot of add/remove operations
        // on the list.

        

        // 3. Vector = Resizable array implementation of the List interface
        // Vector is a resizable array implementation of the List interface.
        // Vector is thread-safe.
        // Vector is synchronized.
        // Vector is slower than ArrayList.
        // Vector is a good choice if you want to do a lot of random access on the list.

    }
}
