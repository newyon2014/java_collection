package COLLECTION._Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    public static void main(String[] args) {

        //1. Scenario 1 - Synchronized list

        List<String> nameList = Collections.synchronizedList(new ArrayList<String>());

        nameList.add("Java");
        nameList.add("Python");
        nameList.add("Ruby");

        //add / remove - no synchronization needed
        // Fetch / traverse the value from this list - use explict synchronization as below.

        synchronized (nameList) {
            Iterator<String> nameIterator = nameList.iterator();
            while (nameIterator.hasNext()) {
                System.out.println(nameIterator.next());
            }
        }
        //2. Scenario 2 - copyOnArrayList - a thread safe class
        CopyOnWriteArrayList<String> emList = new CopyOnWriteArrayList<>();
        emList.add("Tom");
        emList.add("Kevin");
        emList.add("steve");
          // We don't need explicit synchronization for any operation. add/traverse/remove

        for (String s : emList) {
            System.out.println(s);
        }


    }
}
