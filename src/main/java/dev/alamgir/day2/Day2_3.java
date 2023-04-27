package dev.alamgir.day2;

// Collections Framework

import java.util.*;

public class Day2_3 {
    public static void main(String[] args) {
        // List
        // - Represents an ordered collection of elements.
        // - Allows duplicates and supports indexing of elements.
        // - Common implementations: ArrayList, LinkedList.
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.remove(1);
        System.out.println(names.get(0)); // Alice
        System.out.println(names.size()); // 3

        // Set
        // - Represents an unordered collection of unique elements.
        // - Does not allow duplicates and does not support indexing.
        // - Common implementations: HashSet, LinkedHashSet, TreeSet.
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(1);
        uniqueNumbers.add(2);
        uniqueNumbers.add(1);
        System.out.println(uniqueNumbers.size()); // Output: 2

        // Map
        // - Represents a collection of key-value pairs, where each key is mapped to a single value.
        // - Keys are unique, but values can be duplicates.
        // - Common implementations: HashMap, LinkedHashMap, TreeMap.
        Map<String, Integer> wordCounts = new HashMap<>();
        wordCounts.put("hello", 5);
        wordCounts.put("world", 3);
        System.out.println(wordCounts.get("hello")); // 5
        System.out.println(wordCounts.size()); // 2

        // Queue
        // - Represents a collection that holds elements prior to processing, typically in a First-In-First-Out (FIFO) order.
        // - Allows insertion of elements at the end of the queue and removal from the front.
        // - Common implementations: LinkedList, ArrayDeque, PriorityQueue.
        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("banana");

        System.out.println(queue.poll()); // "apple" is retrieved and removed
        System.out.println(queue.size()); // 1

        // Deque
        // - Represents a double-ended queue, allowing elements to be added or removed from both the front and the rear.
        // - Can be used as a stack (Last-In-First-Out) or a queue (First-In-First-Out).
        // - Common implementations: ArrayDeque, LinkedList.
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("apple");
        deque.addLast("banana");

        System.out.println(deque.removeFirst()); // "apple"
        System.out.println(deque.size()); // 1

        // Sorted Collections
        // - Some collection implementations maintain their elements in sorted order, such as TreeSet and TreeMap.
        // - These collections use the natural ordering of their elements or a custom comparator for sorting.
        // Using natural ordering
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("orange");
        sortedSet.add("banana");
        sortedSet.add("apple");
        System.out.println(sortedSet);

        // Using a custom comparator
        SortedMap<String, Integer> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        sortedMap.put("apple", 5);
        sortedMap.put("banana", 3);
        sortedMap.put("orange", 2);
        System.out.println(sortedMap);

        // `Collections` Utility Class
        List<Integer> numbersList = Arrays.asList(5, 2, 8, 1, 9);

        Collections.sort(numbersList); // Sorts the list in ascending order
        Collections.reverse(numbersList); // Reverses the order of elements in the list
        Collections.shuffle(numbersList); // Randomly rearranges the order of elements in the list
        int min = Collections.min(numbersList); // Finds the minimum element in the list
        int max = Collections.max(numbersList); // Finds the maximum element in the list

        // `Arrays` Utility Class
        int[] numbersArray = {5, 2, 8, 1, 9};

        Arrays.sort(numbersArray); // Sorts the array in ascending order
        int index = Arrays.binarySearch(numbersArray, 8); // Searches for the specified element in the sorted array
        List<Integer> numberList = Arrays.asList(5, 2, 8, 1, 9); // Converts an array to a List
    }
}
