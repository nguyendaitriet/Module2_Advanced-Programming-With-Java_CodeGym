import java.util.ArrayList;

public class MyList<E> {
    private final ArrayList<E> newList;

    public MyList() {
        newList = new ArrayList<>();
    }

    public void addElementAtPosition(int index, E... element) {
        for (E e : element) {
            newList.add(index++, e);
        }
    }

    public E removeElementAtPosition(int index) {
        return newList.remove(index);
    }

    public int getSize() {
        return newList.size();
    }

    public boolean contains(E element) {
        return newList.contains(element);
    }

    public int getIndexOf(E element) {
        return newList.indexOf(element);
    }

    public E getElementAtIndex(int index) {
        return newList.get(index);
    }

    public void clearAllElements() {
        newList.removeAll(newList);
    }

    @Override
    public String toString() {
        return newList.toString();
    }
}
