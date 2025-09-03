package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);
        map.put("Mango", 7);

        // Display the HashMap
        System.out.println("HashMap: " + map);

        // Accessing a value using a key
        int appleCount = map.get("Apple");
        System.out.println("Apple count: " + appleCount);

        // Checking if a key exists
        boolean hasBanana = map.containsKey("Banana");
        System.out.println("Contains Banana? " + hasBanana);

        // Removing a key-value pair
        map.remove("Orange");
        System.out.println("HashMap after removing Orange: " + map);

        // Checking the size of the HashMap
        int size = map.size();
        System.out.println("Size of HashMap: " + size);
    }
}
