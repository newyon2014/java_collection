package COLLECTION.__Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<>();
        map1.put(3, "C");
        map1.put(1, "A");
        map1.put(2, "B");

        HashMap<Integer, String> map3 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");

        //1. On the baasis of Key value : use equals method
        System.out.println(map1.equals(map2)); // False
        System.out.println(map1.equals(map3)); // False

        //2. Compare HashMap for the same keys
        System.out.println(map1.keySet().equals(map2.keySet())); // False
        System.out.println(map1.keySet().equals(map3.keySet())); // False

        //3. Find out the extra key set ( Map1 vs Map 4)
        HashMap<Integer, String> map4 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");

        // Combine the keys from both hashmaps: Using hashset
        HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
        // Add key set from map4
        combineKeys.addAll(map4.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);

        //4. Compare maps by values

        HashMap<Integer, String> map5 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map6 = new HashMap<>();
        map1.put(4, "A");
        map1.put(5, "B");
        map1.put(6, "C");

        HashMap<Integer, String> map7 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "C");

        //4.1 Duplicates are not allowed : using array list
        System.out.println(new ArrayList<String>(map5.values()).equals(new ArrayList<>(map6.values()))); // true
        System.out.println(new ArrayList<String>(map5.values()).equals(new ArrayList<>(map7.values())));  // true
        //4.2 Duplicates are allowed: using HashSet
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); // true
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));  // true



    }
}
