package COLLECTION.__Map;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization  {
    public static Map<String,Integer> marksMap;

    static {
        marksMap = new HashMap<>();
        marksMap.put("A",100);
        marksMap.put("B",200);
    }

    public static void main(String[] args) {

        //1. Initialization using Hashmap Class
        HashMap<String,String> hashMap = new HashMap<>();

        //2. Initialization using static
        System.out.println(HashMapInitialization.marksMap.get("A"));

        //3. Initialization as an immutable map with one single entry
        Map<String, Integer> singleMap = Collections.singletonMap("test", 100);
        System.out.println(singleMap.get("test"));

        //4. Initialization JDK 8 - creating one 2D array of string using stream and collecting in the form of a map
        Map<String, String> mapJDK8 = Stream.of(new String[][]{
                {"Tom", "A grade"},
                {"Kevin", "A= grade"},
        }).collect(Collectors.toMap(k -> k[0], k -> k[1]));
        System.out.println(mapJDK8.get("Tom"));
        //mutable
        mapJDK8.put("Lisa","A+= grade");

        //5. Initialization using simple entry - mutable map
        Map<String, String> simpleEntry = Stream.of(
                new AbstractMap.SimpleEntry<>("Kevin", "Joey"),
                new AbstractMap.SimpleEntry<>("Rachel", "Chandler")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(simpleEntry.get("Rachel"));
        // mutable
        simpleEntry.put("Lisa","Java");

        //6. Initialization using simple entry - immutable map
        Map<String, String> simpleImmuEntry = Stream.of(
                new AbstractMap.SimpleImmutableEntry<>("Kevin", "Java"),
                new AbstractMap.SimpleImmutableEntry<>("Rachel", "C#")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(simpleImmuEntry.get("Rachel"));
        // Immutable
        simpleEntry.put("Lisa","Python");
        System.out.println(simpleImmuEntry.get("Lisa")); // Null

        //7. Initialization using JDK 1.9
            /*
            Comment out section as the current compiler is @ 1.8
            Empty Map
               Map<String, String> emptyMap = Map.of()

           Singleton Map
                 Map<String, String> SingletonMap = Map.of("k1","v1");
                 System.out.println(SingletonMap.get("k1");
                 SingletonMap.put("k2","v2") - unsupported Operation Exception

           Multi value map
                  Map<String, String> SingletonMap = Map.of("k1","v1","k2","v2");
                 System.out.println(SingletonMap.get("k2");

           Of Entries methods : No Limitations on pairs ( key - Value )
                Map<String, String> simpleEntry = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Kevin", "A+"),
                new AbstractMap.SimpleEntry<>("Rachel", "C-")
                );
                System.out.println(simpleEntry.get("Kevin");
             */







    }
}
