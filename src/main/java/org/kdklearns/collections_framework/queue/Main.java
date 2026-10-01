package org.kdklearns.collections_framework.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(0);
        queue.offer(5);
        queue.offer(3);
        System.out.println(queue);

        System.out.println("peeking -> " + queue.peek());
        System.out.println("polling ->" + queue.poll());
        System.out.println(queue);
        System.out.println("pollingFirst -> " + queue.pollFirst());
        System.out.println(queue);
        System.out.println("pollingLast -> " + queue.pollLast());
        System.out.println(queue);
        System.out.println("pop -> " + queue.pop());
        System.out.println(queue);
        queue.offer(12); queue.offer(8); queue.offer(7); queue.offer(0);
        System.out.println(queue);
        System.out.println("popping again -> " + queue.pop());
        System.out.println(queue);

        // I must be tripping
        System.out.println("\nSTACK");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10); stack.push(2); stack.push(4); stack.push(9);
        System.out.println(stack);
        System.out.println("pop -> " + stack.pop());
        System.out.println(stack);

        // Let's trip some more
        System.out.println("\n MIX");
        ArrayDeque<Integer> heavy = new ArrayDeque<>();
        heavy.offer(1);
        System.out.println(heavy);
        heavy.offer(0);
        System.out.println(heavy);
        heavy.offer(2);
        System.out.println(heavy);
        System.out.println(heavy.pollLast());
    }
}
