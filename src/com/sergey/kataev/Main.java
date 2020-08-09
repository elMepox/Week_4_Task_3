package com.sergey.kataev;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        String[] strings = {"Петя", "Аня", "Вася", "Ирина"};
        ArrayIterator arrayIterator = new ArrayIterator(strings);
        for (Object o : arrayIterator) {
            System.out.println(o);
        }
    }
}
