package org.kdklearns.collections_framework.linked_list;

public class Node {

    public int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}