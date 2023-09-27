// What is an enum? How do you use it?
// Enums are used to represent a fixed number of possible values. 
// For example, the days of the week, months of the year, etc.


// In Java, an enum (short for "enumeration") is a special data type that represents a set of constants. It's used to define a collection of related named values, making code more readable and maintainable by providing meaningful names to values rather than using plain integers or strings.

// Declaring an enum
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// Enums can also be declared inside a class or interface.
// Example:
class Week {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
}

// Enums can also have methods, fields, and constructors, just like regular classes. This allows you to attach additional information to each enum value if needed. Here's an example:
enum Color {

    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");

    private String hexCode;

    Color(String hexCode) {
        System.out.println("Constructor called for : " + this.name());
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}

public class enums {

    public static void main(String[] args) {
        
        // Using enum values
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);

        // Enum in switch statement
        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("It's a weekday.");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend.");
                break;
        }

        // using enum in inside a class
        Week.Day day = Week.Day.MONDAY;
        System.out.println("Today is: " + day);


        // Using enum methods

        // Accessing enum values and methods
        Color myColor = Color.RED;
        System.out.println("Color: " + myColor);
        System.out.println("Hex Code: " + myColor.getHexCode());

        // Iterating over enum values
        for (Color color : Color.values()) {
            System.out.println(color + " - " + color.getHexCode());
        }

        // ordinal() method

        // The ordinal() method returns the position of an enum constant in the enum declaration, starting from zero. For example, the ordinal of RED is 0, and the ordinal of BLUE is 2. 
        System.out.println("RED ordinal: " + Color.RED.ordinal());


    }
    
}

