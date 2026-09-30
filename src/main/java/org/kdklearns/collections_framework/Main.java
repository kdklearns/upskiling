package org.kdklearns.collections_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GenericList<String> names = new GenericList<>();
        names.add("Shree Ji"); names.add("Keshav"); names.add("Rahul"); names.add("Rishabh");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); numbers.add(2); numbers.add(3); numbers.add(4); numbers.add(5);

        // iterating using the for each loop
        for (int x: numbers) {
            System.out.println(x);
        }

        // Let this send shock waves to your brain :)
        List<Integer>[] arr = new List[12];
        arr[0] = new ArrayList<>();
        arr[0].add(12);
    }
}
