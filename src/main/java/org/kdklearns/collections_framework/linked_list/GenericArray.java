package org.kdklearns.collections_framework.linked_list;

import java.util.Iterator;

public class GenericArray<T> implements Iterable{

    private final T[] items;
    private int length;

    public GenericArray() {
        items = (T[]) new Object[100];
        length = 0;
    }

    public void add(T data) {
        items[length ++] = data;
    }

    public T get(int index) {
        if (index >= length) {
            throw new RuntimeException("Index out of Bounds");
        }
        return items[index];
    }

    public int size() {
        return length;
    }

    @Override
    public Iterator iterator() {
        return new GenericIterator(this);
    }

    private class GenericIterator implements Iterator {

        private final GenericArray<T> list;
        private int index;

        public GenericIterator(GenericArray<T> list) {
            this.list = list;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < list.length;
        }

        @Override
        public T next() {
            return list.items[index ++];
        }
    }
}
