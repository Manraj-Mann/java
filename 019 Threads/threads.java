// What are threads?
// Threads are a way to run multiple tasks at the same time.

// What is the difference between a process and a thread?
// A process is a program that is being executed. A thread is a task that is being executed.

// What is the difference between a thread and a task?
// A thread is a task that is being executed. A task is a unit of work.

// Use of threads ?
// Threads are used to run multiple tasks at the same time.

class A extends Thread{

    @Override
    public void run() {
        
        show();
    }
    public void show() {

        for (int i = 0; i < 10; i++) {
            
            System.out.println("hii");
            try{

                Thread.sleep(10);
            }
            catch (Exception e) {
                    
                    System.out.println(e);
            }
        }
    }
}
class B extends Thread{

    @Override
    public void run() {
        
        show();
    }
     public void show() {

        for (int i = 0; i < 10; i++) {
            
            System.out.println("hello");
            try{

                Thread.sleep(10);
            }
            catch (Exception e) {
                    
                    System.out.println(e);
            }

        }
    }
}

// Use the Runnable interface when you want to access the class members and when you are extending some other class.

class p {

    void show() {

        System.out.println("in p");
    }

}
class q extends p implements Runnable{

    @Override
    public void run() {
        
        super.show();
        show();
    }
    public void show() {

        System.out.println("in q");
    }
}

// yield() method useage

class YieldExample {

    public static void main(String[] args) {
        Thread producerThread = new ProducerThread();
        Thread consumerThread = new ConsumerThread();

        producerThread.start();
        consumerThread.start();
    }
}

class ProducerThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Producing item " + i);
            Thread.yield(); // Yield to allow other threads to run
        }
    }
}

class ConsumerThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Consuming item " + i);
            Thread.yield(); // Yield to allow other threads to run
        }
    }
}

class Counter{

    int count;
    public synchronized void increment() {

        count++;
    }
}
public class threads {
    
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        // start() is a method of Thread class which is used to start a thread which executes the run() method
        obj1.start();
        obj2.start();

        // what is a scheduler?
        // A scheduler is a part of the operating system that decides which thread to run.
        
        // how does a scheduler work?
        // A scheduler works on the basis of priority. It runs the thread with the highest priority first.

        // how to set priority of a thread?
        // We can set the priority of a thread by using the setPriority() method of Thread class.

        // what is the range of priority?
        // The range of priority is 1 to 10.

        // what is the default priority of a thread?
        // The default priority of a thread is 5.

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        obj1.setPriority(1);
        obj2.setPriority(10);

        
        // what is the use of sleep() method?
        // The sleep() method is used to pause the execution of the current thread for a specified time.
        
        // using Runnable interface
        
        q obj3 = new q(); 
        Thread t1 = new Thread(obj3);
        t1.start();

        // using runnable interface

        Runnable obj4 = new Runnable() {
            
            @Override
            public void run() {
                
                System.out.println("in runnable");
            }
        };
        Thread t2 = new Thread(obj4);
        t2.start();

        // using it as lambda expression
        Runnable obj5 = () -> System.out.println("in runnable");
        Thread t3 = new Thread(obj5);
        t3.start();
        
        // what is the use of yield() method?
        // The yield() method is used to pause the execution of the current thread temporarily so that other threads can execute.


        // what is the use of join() method?
        // The join() method is used to wait for a thread to die.

        // usage of join() method 

        Thread t4 = new Thread(() -> {

            for (int i = 0; i < 5; i++) {
                
                System.out.println("in t4");
                try{

                    Thread.sleep(1000);
                }
                catch (Exception e) {
                        
                        System.out.println(e);
                }
            }
        });
        
    

        Thread t5 = new Thread(() -> {

            for (int i = 0; i < 5; i++) {
                
               
                System.out.println("in t5");
                try{

                    Thread.sleep(1000);
                }
                catch (Exception e) {
                        
                        System.out.println(e);
                }
            }
        });
        t4.start();
        try{

            t4.join();
        }
        catch (Exception e) {
                
                System.out.println(e);
        }
        t5.start();
        // t4 will complete its execution first and then t5 will start its execution.

        Counter c = new Counter();
        Thread t6 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                
                c.increment();
            }
        });
        Thread t7 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                
                c.increment();
            }
        });
        t6.start();
        t7.start();

        try {
            t6.join();
            t7.join();
           
        } catch (Exception e) {

            System.out.println(e);
        }
        
        System.out.println(c.count); // may or may not give correct answer if we don't use synchronized keyword

        // what is synchronization?
        // Synchronization is the capability to control the access of multiple threads to any shared resource.

        // what is the use of synchronized keyword?
        // The synchronized keyword is used to perform synchronization in Java.

        // What is race condition ? 
        // A race condition is a concurrency-related software defect that occurs when two or more threads or processes attempt to modify shared data concurrently without proper synchronization, leading to unexpected and unpredictable outcomes. Race conditions can result in data corruption, program crashes, incorrect calculations, and other unexpected behaviors. They are particularly common in multithreaded or parallel programs.
        // Race conditions arise due to the interleaved execution of threads or processes. When multiple threads access and modify shared resources (such as variables, data structures, or files) simultaneously and at least one of them performs a write operation, the final state of the resource becomes unpredictable and depends on the timing and order of thread execution.

        // States of Threads : 
        
      
        

    }
}


// 1. **What is a Thread in Java?**
//    - A thread is the smallest unit of execution in a Java program. It allows for concurrent execution of tasks within a single process.

// 2. **How do you create a thread in Java?**
//    - You can create a thread by either extending the `Thread` class or implementing the `Runnable` interface.

// 3. **What's the difference between extending the `Thread` class and implementing the `Runnable` interface?**
//    - When you extend the `Thread` class, your class can't extend any other class due to Java's single inheritance. Implementing `Runnable` allows better code organization and reusability.

// 4. **How can you start a thread in Java?**
//    - Call the `start()` method on the thread instance. This initiates the thread's execution, and the `run()` method will be invoked.

// 5. **What is the `run()` method in a Java thread?**
//    - The `run()` method contains the code that the thread will execute when started. It's the entry point for the thread's logic.

// 6. **What is the difference between a `Thread` and a `Process`?**
//    - A thread is a unit of execution within a process, while a process is an independent program with its own memory space.

// 7. **Explain the Thread States in Java.**
//    - Thread states include `NEW`, `RUNNABLE`, `BLOCKED`, `WAITING`, `TIMED_WAITING`, and `TERMINATED`, representing different stages of thread execution.

// 8. **What is synchronization in Java threads?**
//    - Synchronization ensures that only one thread can access a critical section of code or a shared resource at a time, preventing data corruption or race conditions.

// 9. **How do you achieve synchronization in Java?**
//    - You can use the `synchronized` keyword, locks, or synchronized blocks to ensure that only one thread can access a synchronized block of code at a time.

// 10. **What is a race condition? How can you prevent it?**
//     - A race condition occurs when multiple threads access shared data simultaneously, leading to unpredictable results. It can be prevented by using synchronization mechanisms.

// 11. **Explain the concept of deadlock in threads.**
//     - Deadlock occurs when two or more threads are blocked, each waiting for a resource held by the other, resulting in a standstill. Avoiding circular wait and acquiring locks in a consistent order can prevent deadlock.

// 12. **What is a thread pool? Why is it useful?**
//     - A thread pool is a collection of worker threads that can be reused to execute tasks. It avoids the overhead of creating and destroying threads for every task.

// 13. **What are daemon threads?**
//     - Daemon threads are background threads that don't prevent the program from exiting if they're still running. They are typically used for auxiliary tasks.

// 14. **What is the purpose of the `join()` method in Java threads?**
//     - The `join()` method blocks the calling thread until the thread it's called on completes its execution.

// 15. **Explain the concept of thread starvation. How can it be avoided?**
//     - Thread starvation occurs when a thread is unable to access a resource due to the continuous allocation of the resource to other threads. It can be avoided by using fair locks, ensuring proper scheduling, and considering thread priorities.

// These questions cover a range of important topics related to threads in Java. Remember to provide clear and concise explanations during your interview and demonstrate a solid understanding of multithreading concepts and best practices.
