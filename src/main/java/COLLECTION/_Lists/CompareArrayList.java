package COLLECTION._Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {

    public static void main(String[] args) {

        //1. Sort and then equals
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("B", "A", "C", "D", "F"));

        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);
        Collections.sort(l1, Collections.reverseOrder());

        System.out.println(l1.equals(l2)); //False
        System.out.println(l1.equals(l3)); //True

        //2. Compare tow list - find out additional elements
        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l5 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        l4.removeAll(l5);
        System.out.println(l4);

        //3. Find the missing element
        ArrayList<String> l6 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l7 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        l7.removeAll(l6);
        System.out.println(l7);

        //4. Find out the common element
        ArrayList<String> l8 = new ArrayList<>(Arrays.asList("Java", "Python", "Ruby", "C#", "JS"));
        ArrayList<String> l9 = new ArrayList<>(Arrays.asList("Java", "Python", "Ruby", "C#", "PHP"));

        l8.retainAll(l9);
        System.out.println(l8);
    }
}
