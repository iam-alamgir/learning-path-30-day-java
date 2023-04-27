package dev.alamgir.day2;

// File I/O

import java.io.*;

public class Day2_2 {
    public static void main(String[] args) {
        // Reading a file
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing to a file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            String content = "Hello, World!";
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
