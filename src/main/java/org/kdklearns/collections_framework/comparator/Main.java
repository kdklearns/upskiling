package org.kdklearns.collections_framework.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static Comparator getComparator() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        };
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3); numbers.add(0); numbers.add(10); numbers.add(2); numbers.add(8);
        System.out.println("List1\n" + numbers);
//        Collections.sort(numbers);
//        Collections.reverse(numbers);
//        System.out.println(numbers);
        Collections.sort(numbers, getComparator());
        System.out.println(numbers);

        List<Integer> digits = new ArrayList<>();
        digits.add(8); digits.add(6); digits.add(10); digits.add(12); digits.add(2);
        System.out.println("\nList2\n" + digits);
        Collections.sort(digits, new CustomComparator());
        System.out.println(digits);
    }

    // We may also define a private inner class
    private static class CustomComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer num1, Integer num2) {
            return num2 - num1;
        }
    }
}
