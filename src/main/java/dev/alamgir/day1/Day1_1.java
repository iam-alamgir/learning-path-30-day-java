package dev.alamgir.day1;

// Data Types
public class Day1_1 {
    public static void main(String[] args) {
        // Primitive Data Types
        byte num1 = 42;
        short num2 = 12345;
        int num3 = 2_000_000;
        long num4 = 9_000_000_000_000L;

        float piApprox = 3.14f;
        double piAccurate = 3.141592653589793;

        boolean isRaining = false;
        char letter = 'A';

        // Reference Data Types
        // String
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;

        // Array
        // Declare and initialize an integer array
        int[] numbers = {1, 2, 3, 4, 5};

        // Declare and initialize a String array
        String[] names = {"Alice", "Bob", "Charlie"};

        // Access array elements
        int firstNumber = numbers[0]; // 1
        String firstPerson = names[0]; // "Alice"

        // Modify array elements
        numbers[2] = 7; // numbers becomes {1, 2, 7, 4, 5}
        names[1] = "Eve"; // names becomes {"Alice", "Eve", "Charlie"}

        // Class
        // Create an instance of the Circle class
        Circle circle1 = new Circle();
        circle1.radius = 5.0;
        double area1 = circle1.area(); // Calculate the area of the circle

        // Interface
        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.draw(); // This calls the draw() method defined in the Rectangle class
    }

    // Define a simple class
    public static class Circle {
        double radius;

        double area() {
            return Math.PI * radius * radius;
        }
    }

    // Define an interface
    public interface Drawable {
        void draw();
    }

    // Implement the interface in a class
    public static class Rectangle implements Drawable {
        int width, height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a rectangle with width: " + width + " and height: " + height);
        }
    }
}
