
// 1. Abstract classes can have abstract and regular methods, while interfaces can only have abstract methods.
// 2. The abstract class AbstractShape provides a common constructor and regular method (moveTo) for its subclasses but interfaces cannot have constructors or regular methods.
// 3. The interface Drawable defines a contract with just the abstract method draw.
// 4. Both Circle and Square classes provide their own implementations of the draw method based on the interface or abstract class contract.
// 5. Subclasses of an abstract class extend it using the extends keyword (Circle extends AbstractShape), while classes implement an interface using the implements keyword (Square implements Drawable).

// These examples highlight some key differences between abstract classes and interfaces in terms of constructors, regular methods, and implementation inheritance.


// Abstract Class Example

abstract class AbstractShape {
    int x, y;

    AbstractShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Abstract method
    abstract void draw();

    // Regular method
    void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}

class Circle extends AbstractShape {
    int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

// Interface Example

interface Drawable {
    
    // All methods in an interface are implicitly abstract and public
    void draw();
}

class Square implements Drawable {
    int sideLength;

    Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side length " + sideLength);
    }
}

public class Abs_VS_interface {
    public static void main(String[] args) {
        // Abstract class example
        AbstractShape circle = new Circle(10, 20, 5);
        circle.draw(); // Output: Drawing a circle at (10, 20) with radius 5

        // Interface example
        Drawable square = new Square(15);
        square.draw(); // Output: Drawing a square with side length 15

        // Abstract class method
        circle.moveTo(30, 40);
        System.out.println("Circle moved to (" + circle.x + ", " + circle.y + ")"); // Output: Circle moved to (30, 40)
    }
}

