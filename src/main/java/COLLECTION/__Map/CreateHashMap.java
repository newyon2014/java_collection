package COLLECTION.__Map;

import java.util.HashMap;

public class CreateHashMap {

    public static void main(String[] args) {

        /*
          No order
          No Indexing
          Key Can't be duplicated
          Can store n number of Null values' ut only one NUll key
        */

        HashMap<String,String> capitalMap = new HashMap<>();
        capitalMap.put("USA","DC");
        capitalMap.put("UK","London"); // Duplicate key - this will be ignored
        capitalMap.put("UK","Chelsea"); // Duplicate key - this will be considered
        capitalMap.put(null,"LA");  // null key - this will be ignored
        capitalMap.put(null,"Berlin"); // null key - this will be considered
        capitalMap.put("Russia",null);
        capitalMap.put("France",null);

        System.out.println(capitalMap.get("USA")); //DC
        System.out.println(capitalMap.get("UK")); //Chelsea
        System.out.println(capitalMap.get(null)); //Berlin
        System.out.println(capitalMap.get("France")); //France




    }
}
