package HashMap;

//A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
//One object is used as a key (index) to another object (value)


import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();//hashMap with String key and String value pair
        capitalCities.put("England", "London");//Countries used as key and cities as values
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println("HashMap=" +capitalCities);//printing whole hashmap

        System.out.println("HashMap Traversal...");
        for (String i : capitalCities.keySet())//print keys and values
        {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }

}