
public class Loops {

    public static void main(String[] args) {
        
        // Loops = Used to repeat a process
        // Types : For, While, Do While, For Each

        // Example 1 - While Loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // Example 2 - For Loop
        
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
        
        // Example 3 - Do While Loop
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 10);

        // Example 4 - For Each Loop
        String[] animals = {"Cat", "Dog", "Lizard", "Bird", "Snake"};
        for (String animal : animals) {
            System.out.println(animal);
        }


        // Interview Questions 
        // 1. What is the difference between a while loop and a do while loop?
        // Ans : While loop checks the condition first and then executes the code
        // 2. What is the difference between a for loop and a for each loop?
        // Ans : For loop is used to iterate over a range of values, while for each loop is used to iterate over a collection of values
        // 3. What is the difference between a break and a continue?
        // Ans : Break is used to exit a loop, while continue is used to skip the current iteration and continue with the next iteration
        // Example :
        for (int l = 0; l < 10; l++) {
            if (l == 4) {
                continue;
            }
            System.out.print(l);
        }
        System.out.println();
        // Output : 0 1 2 3 5 6 7 8 9
        // Example :
        for (int m = 0; m < 10; m++) {
            if (m == 4) {
                break;
            }
            System.out.print(m);
        }
        // Output : 0 1 2 3
            


    }
    
}
