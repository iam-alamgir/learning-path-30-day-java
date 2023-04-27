package dev.alamgir.day1;

// Control Structures
public class Day1_2 {
    public static void main(String[] args) {
        // Conditionals
        int score = 75;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Keep trying.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        // Loop
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration " + i);
            i++;
        }

        i = 1;
        do {
            System.out.println("Iteration " + i);
            i++;
        } while (i <= 5);

        for (int j = 1; j <= 5; j++) {
            System.out.println("Iteration " + j);
        }

        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }

        // Branching Statements
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                // breaks out of the loop
                break;
            } else if (j == 4) {
                // skips the rest of the loop and moves to next iteration
                continue;
            }

            System.out.println("Iteration " + j);
        }
    }
}
