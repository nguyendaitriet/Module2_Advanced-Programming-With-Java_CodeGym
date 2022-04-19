
public class MyLinkedList<E> {
    private Node head;
    private int numberNodes=1;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        @Override
        public String toString() {
            return "[" + data + "]";
        }
    }
    public int size() {
        return  this.numberNodes;
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numberNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numberNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numberNodes++;
    }

//                LinkedList
    public Object removeAtPosition(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        numberNodes--;
        if (index == 0) return head = temp.next;
        return temp.next = temp.next.next;
    }

    public int indexOf(Object e) {
        int index = 0;
        if (e == null) {
            for (Node x = head; x != null; x = x.next) {
                if (x.data == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (e.equals(x.data))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(Object e) {
        return indexOf(e) >= 0;
    }

    public boolean remove(Object e) {
        if (contains(e)) {
            removeAtPosition(indexOf(e));
            return true;
        }
        return false;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        String result = "[";
        do {
            result += temp.next == null ? temp.data : temp.data + ", ";
            temp = temp.next;
        } while (temp != null);
        result += "]";
        System.out.println(result);
    }


}
