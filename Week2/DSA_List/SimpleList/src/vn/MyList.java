package vn;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private Object[] element;

    public MyList(int size) {
        this.size = size;
        element = new Object[size];
    }

    public void addElementFromFirst(E... e) {
        if (size < e.length) {
            size=e.length;
            element = Arrays.copyOf(element, size);
        }
        int i = 0;
        for (E myE : e) {
            element[i++] = myE;
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
