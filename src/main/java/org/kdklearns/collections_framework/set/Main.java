package org.kdklearns.collections_framework.set;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 1. HashSet
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(-1);
        numbers.add(-1);
        numbers.add(2);
        numbers.add(0);
        System.out.println(numbers);

        Set<Integer> numbers1 = new HashSet<>();
        numbers1.add(0);
        numbers1.add(1);
        numbers1.add(-1);
        numbers1.add(2);
        numbers1.add(-1);
        numbers1.remove(10);
        System.out.println(numbers1);

        List<Integer> list = new LinkedList<>();
        list.add(-1); list.add(0); list.add(1); list.add(2);
        System.out.println(list);

        numbers1.removeAll(list);
        System.out.println(numbers1);

        System.out.println(numbers.equals(numbers1));
        System.out.println(numbers.equals(list));

        // 2. TreeSet
        TreeSet<Integer> sorted = new TreeSet<>();
        sorted.add(-3); sorted.add(-5); sorted.add(-2); sorted.add(3);
        System.out.println(sorted);
        System.out.println(sorted.floor(-6));
        System.out.println(sorted.higher(3));
    }
}
