package org.kdklearns.collections_framework.min_heap;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.offer(1); heap.offer(10); heap.offer(5); heap.offer(3); heap.offer(7);
        System.out.println(heap);
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.peek());
    }
}
