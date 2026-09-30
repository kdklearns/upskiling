package org.kdklearns.collections_framework.linked_list;

public class LinkedList {

    private static Node convertArrayIntoLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            mover.next = node;
            mover = node;
        }

        // now `mover` refers to the tail of the linked list

        return head;
    }

//    private static GenericNode convertArrayIntoGenericLinkedList() {
//
//    }

    private static <T> void printLinkedList(GenericNode<T> head) {
        GenericNode<T> mover = head;
        while (mover != null) {
            System.out.print(mover.next != null ? mover.data + " -> " : mover.data);
            mover = mover.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node tail = new Node(4);

        // Manually linking the nodes
        head.next = node1;
        node1.next = node2;
        node2.next = tail;

        Node iterator = head;
        while (iterator != null) {
            System.out.println(iterator.data);
            iterator = iterator.next;
        }

        convertArrayIntoLinkedList(new int[] { 1, 2, 3, 4, 5 });

        // Using a Generic Node
        String[] family = new String[] { "R.D. Kaushik", "V.D. Kaushik", "K.D. Kaushik" };
        GenericNode<String> header = new GenericNode<>(family[0]);
        GenericNode<String> mover = header;

        for (int i = 1; i < family.length; i++) {
            GenericNode<String> child = new GenericNode<>(family[i]);
            mover.next = child;
            mover = child;
        }

        // Printing Generic Linked List
        printLinkedList(header);
    }
}
