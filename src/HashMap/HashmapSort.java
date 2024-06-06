package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashmapSort {

        // This map stores unsorted values
        static HashMap<String, Integer> map = new HashMap<>();

        // Function to sort map by Key
        public static void sortbykey()
        {
            ArrayList<String> sortedKeys = new ArrayList<String>(map.keySet());
            Collections.sort(sortedKeys);

            for (String x : sortedKeys)
                System.out.println("Key = " + x + ", Value = " + map.get(x));
        }

        // Driver Code
        public static void main(String[] args)
        {
            map.put("Jayant", 80);
            map.put("Abhishek", 90);
            map.put("Anushka", 80);
            map.put("Amit", 75);
            map.put("Danish", 40);

            sortbykey();
        }
}
