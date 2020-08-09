package com.sergey.kataev;

import java.lang.reflect.Array;
import java.util.Iterator;

public class ArrayIterator implements Iterable {
    private String[] array;

    public ArrayIterator(String[] array) {
        this.array = array;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int current;

            @Override
            public boolean hasNext() {
                return (current + 1) <= array.length;
            }

            @Override
            public Object next() {
                Object object = array[current];
                current += 1;
                return object;
            }
        };
    }
}
