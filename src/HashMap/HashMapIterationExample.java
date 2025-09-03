package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapIterationExample {
    public static void main(String[] args) {
        // Create and populate the HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);
        map.put("Mango", 7);

        // 1. Using entrySet() with for-each loop
        System.out.println("Iterating using entrySet():");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 2. Using keySet() with for-each loop
        System.out.println("\nIterating using keySet():");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // 3. Using values() with for-each loop
        System.out.println("\nIterating using values():");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // 4. Using Iterator with entrySet()
        System.out.println("\nIterating using Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 5. Using forEach() (Java 8+)
        System.out.println("\nIterating using forEach:");
        map.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}
