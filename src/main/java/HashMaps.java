import sun.util.resources.cldr.zh.CalendarData_zh_Hans_SG;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        HashMap<String, String> favouriteFruits = new HashMap<String, String>();

        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");

        System.out.println(favouriteFruits.get("Alice"));
        System.out.println(favouriteFruits);

        HashMap<String, Integer> ages = new HashMap<String, Integer>();

        ages.put("Alice", 52);
        ages.put("Sarah", 42);
        ages.put("Bob", 32);

        Integer aliceAge = ages.get("Alice");

        String output = "Alice's age is " + aliceAge.toString();
        System.out.println(output);

        HashMap<String, Integer> populations = new HashMap<String, Integer>();

        populations.put("UK", 64100000);
        populations.put("Germany", 80620000);
        populations.put("France", 66030000);
        populations.put("Japan", 127300000);
        System.out.println(populations);

        Integer ukPop = populations.get("UK");

        String output2 = "The UK population is " + ukPop.toString();
        System.out.println(output2);
        

    }

    // favouriteFruits.put(key, value) // inserts a new entry into the HashMap
//        favouriteFruits.get(key) // gets the value for the given key
//        favouriteFruits.size() // returns the size of the HashMap as an integer
//        favouriteFruits.clear() // clears all entries from the HashMap
//        favouriteFruits.containsValue(value) // returns true if the HashMap contains the value
//        favouriteFruits.remove(key) //removes the entry with the given key
//        favouriteFruits.forEach((k ,v) {})

}
