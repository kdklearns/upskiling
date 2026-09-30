package org.kdklearns.collections_framework.linked_list;

public class Main {

    private static <T> GenericNode convertListIntoLinkedList(GenericArray<T> list) {
        GenericNode<T> head = new GenericNode<>(list.get(0));
        GenericNode<T> mover = head;

        for (int i = 1; i < list.size(); i++) {
            GenericNode<T> child = new GenericNode<>(list.get(i));
            mover.next = child;
            mover = child;
        }

        return head;
    }

    private static <T> void printLinkedList(GenericNode<T> head) {
        GenericNode<T> mover = head;
        while (mover != null) {
            System.out.print(mover.next != null ? mover.data + " -> " : mover.data);
            mover = mover.next;
        }
    }

    public static void main(String[] args) {
        GenericArray<Integer> numbers = new GenericArray<>();
        numbers.add(1); numbers.add(2); numbers.add(3); numbers.add(4); numbers.add(5);

        GenericNode<Integer> head = convertListIntoLinkedList(numbers);
        printLinkedList(head);
    }
}
