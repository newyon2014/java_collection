package COLLECTION.__Map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConvertHashMapToArrayList {

    public static void main(String[] args) {

        HashMap<String,Integer> compMap = new HashMap<>();
        compMap.put("Google",10000);
        compMap.put("Walmart",20000);
        compMap.put("Amazon",30000);

        compMap.forEach((k,v) -> System.out.println("Key = " + k + "  Values = " + v));

        Iterator it = compMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Convert HashMap Keys to Arraylist
        ArrayList<String> convertToArrayList = new ArrayList<>(compMap.keySet());
        for (String s :convertToArrayList
             ) {
            System.out.println(s);
        }

        // Convert HashMap Keys to Arraylist
        ArrayList<Integer> convertToArrayList2 = new ArrayList<>(compMap.values());
        for (Integer i :convertToArrayList2
        ) {
            System.out.println(i);
        }


    }
}
