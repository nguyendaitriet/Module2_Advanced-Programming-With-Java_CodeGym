package vn;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int CAPACITY = 5;
    private Object[] element;

    public MyList() {
        element = new Object[CAPACITY];
    }

    public void doubleCapacity() {
        element = Arrays.copyOf(element, CAPACITY * 2);
    }

    public void addElementFromFirst(E... e) {
        if (size < e.length) {
            doubleCapacity();
        }
        for (E myE : e) {
            element[size++] = myE;
        }
    }

    public E getElementByIndex(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) element[i];
    }

    @Override
    public String toString() {
        return Arrays.toString(element);
    }
}
