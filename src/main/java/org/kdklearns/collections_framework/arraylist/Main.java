package org.kdklearns.collections_framework.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2); list1.add(3);

        List<Integer> list2 = new ArrayList<>(list1);

        System.out.println(list1.equals(list2));
        System.out.println(list1 == list2);

        LinkedList list = new LinkedList<>();
        list.add(1); list.add(2); list.add(3);

        Object[] objects = new Object[5];
        objects[0] = 1;
        objects[1] = "Keshav";
        objects[2] = list;

        for (Object object: objects) {
            System.out.println(object);
        }
    }
}
