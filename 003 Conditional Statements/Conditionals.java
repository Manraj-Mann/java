public class Conditionals {
    
    public static void main(String[] args) {
        
        // Conditional Statements = used to perform different actions based on different conditions
        // Ways to perform conditional statements:
        // 1. if statement = performs some block of code if a condition is true
        // 2. if...else statement = performs one block of code if a condition is true and another if it's false
        // 3. if...else if...else statement = performs one of many blocks of code for different conditions
        // 4. switch statement = selects one of many blocks of code to be executed
        // 5. ? : operator = short hand for if...else statement

        // Example 1: if statement

        int x = 1;
        int y = 2;
        if (x < y) {
            System.out.println("x is less than y");
        }

        // Example 2: if...else statement

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Example 3: if...else if...else statement

        int time2 = 22;
        if (time2 < 10) {
            System.out.println("Good morning.");
        } else if (time2 < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Example 4: switch statement
        switch (time2) {
            case 1:
                System.out.println("Good morning.");
                break;
            case 2:
                System.out.println("Good day.");
                break;
            default:
                System.out.println("Good evening.");
                break;
        }
    }
}
