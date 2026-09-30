package org.kdklearns.collections_framework;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {

    private final T[] items;
    private int size;

    public GenericList() {
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator iterator() {
        return new GenericListIterator(this);
    }

    private class GenericListIterator implements Iterator<T> {

        private final GenericList<T> list;
        private int index;

        public GenericListIterator(GenericList<T> list) {
            this.list = list;
            index = 0;
        }

        @Override
        public boolean hasNext() {
//            System.out.println("hasNext called");
            return index < list.size;
        }

        @Override
        public T next() {
//            System.out.println("Next called");
            return list.items[index ++];
        }
    }
}
