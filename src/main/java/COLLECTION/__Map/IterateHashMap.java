package COLLECTION.__Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashMap {

    public static void main(String[] args) {

        HashMap<String,String> capitalMap = new HashMap<>();
        capitalMap.put("USA","DC");
        capitalMap.put("UK","London"); // Duplicate key - this will be ignored
        capitalMap.put("UK","Chelsea"); // Duplicate key - this will be considered
        capitalMap.put(null,"LA");  // null key - this will be ignored
        capitalMap.put(null,"Berlin"); // null key - this will be considered
        capitalMap.put("Russia",null);
        capitalMap.put("France",null);

        //1. Iterator - Over the keys by using Keyset
       Iterator<String> iterate1 = capitalMap.keySet().iterator();
       while (iterate1.hasNext()){
           String key = iterate1.next();
           String value = capitalMap.get(key);
           System.out.println("Key = " + key + " Value = "+ value);
       }

       //2. Iterate over set using entry set
     //   Set<Map.Entry<String, String>> iterate2 = capitalMap.entrySet();
        for (Map.Entry<String, String> entry : capitalMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }

        //3.  iterate hashmap using Java 8
        capitalMap.forEach((k,v) -> System.out.println("Key " + k + " and Value = " + v));




    }
}
