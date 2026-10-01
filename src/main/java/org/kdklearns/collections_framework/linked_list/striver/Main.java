package org.kdklearns.collections_framework.linked_list.striver;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // add operation
        ll.add(1); ll.add(2); ll.add(3); ll.add(4); ll.add(5);
        // add at the start
        ll.addFirst(0);
        // add at the end
        ll.addLast(6);

        // printing
        System.out.println(ll);

        // remove from start
        ll.removeFirst();

        // remove from last
        ll.removeLast();

        // printing
        System.out.println(ll);

        // contains check
        System.out.println(ll.contains(6));
    }
}
