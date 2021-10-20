package COLLECTION._Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListMethods {


    public static void main(String[] args) {

        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("java");
        ar1.add("python");
        ar1.add("ruby");
        ar1.add("javascripts");

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("Testing");
        ar2.add("Dev-Ops");

        // Scenario #1  - addAll

        //  ar1.addAll(ar2);
        //  System.out.println(ar1);

        // add all from index 2
        ar1.addAll(2, ar2);
        System.out.println(ar1);

        // Scenario #2  - clear()

        // Clear out Array List
        //   ar1.clear();

        // Scenario #2  - Clone array list
        //ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();

        // Scenario #4  - contains()
        System.out.println(ar1.contains("python"));

        ///Scenario #5 - indexOf()
        System.out.println(ar1.indexOf("ruby") > 0);

        //Scenario #6 - lastIndexOf()
        ArrayList<String> ar3 = new ArrayList<>(Arrays.asList("N", "L", "S", "Lis", "N"));
        System.out.println(ar3.lastIndexOf("N"));

        //Scenario #7 - remove by index
        ar3.remove(1);
        System.out.println(ar3);

        //Scenario #8 - remove by object
        ar3.remove("S");
        System.out.println(ar3);

        //Scenario #9 - removeIf()
        ArrayList<String> ar4 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));
        ar4.removeIf(num -> Integer.parseInt(num) % 2 == 0);
        System.out.println(ar4);

        //Scenario #10 - retainAll()
        ArrayList<String> ar5 = new ArrayList<>(Arrays.asList("4", "2", "3", "4", "5", "6", "8", "8", "9", "10"));
        System.out.println(ar5);
        //System.out.println(ar5.retainAll(Collections.singletonList("4")));

        //Scenario #11 - subList()
        ArrayList<String> ar5SubList = new ArrayList<>(ar5.subList(2, 4));
        System.out.println(ar5SubList);

        // Object Array
        Object[] arr = ar5SubList.toArray();
        System.out.println(Arrays.toString(arr));


    }
}
