package COLLECTION._Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));

        //1.LinkedHashset

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(numbers);
        System.out.println(linkedHashSet);

        ArrayList<Integer> numbersWithoutDuplicates = new ArrayList<>(linkedHashSet);
        System.out.println(numbersWithoutDuplicates);

        //2. JDK - 8 - streams
        List<Integer> numbersWithoutDuplicatesJDK = numbers.stream()
                .distinct()
                .collect((Collectors.toList()));
        System.out.println(numbersWithoutDuplicatesJDK);


    }
}
