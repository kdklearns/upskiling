package org.kdklearns.collections_framework.linked_list;

public class GenericNode <T> {

    public T data;
    public GenericNode<T> next;

    public GenericNode(T data) {
        this.data = data;
        next = null;
    }
}
