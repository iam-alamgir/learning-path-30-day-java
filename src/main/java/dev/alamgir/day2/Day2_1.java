package dev.alamgir.day2;

// Error Handling
public class Day2_1 {
    public static void main(String[] args) throws InvalidAgeException {
        try {
            // Code that might throw an exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: Division by zero.");
        } finally {
            // This block is always executed, regardless of whether an exception was thrown or not
            System.out.println("Cleaning up resources.");
        }

        // Custom Exceptions
        int age = 2;
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }
    }

    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
}
