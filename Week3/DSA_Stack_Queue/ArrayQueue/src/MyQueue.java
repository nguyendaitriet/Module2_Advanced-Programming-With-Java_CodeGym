public class MyQueue {
    private int capacity;
    private int[] queueArray;
    private int head;
    private int tail;
    private int currentSize;

    public MyQueue(int size) {
        this.capacity = size;
        this.queueArray = new int[this.capacity];
    }

    public boolean isQueueFull() {
        return this.capacity == this.currentSize;
    }

    public boolean isQueueEmpty() {
        return this.currentSize == 0;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
            return;
        }
        tail++;
        if (tail == capacity - 1) tail = 0;
        queueArray[tail] = item;
        currentSize++;
        System.out.println("Element " + item + " is pushed to Queue !");
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
            return;

        }
        head++;
        if (head == capacity - 1) {
            System.out.println("Pop operation done ! removed: " + queueArray[head - 1]);
            head = 0;
        } else {
            System.out.println("Pop operation done ! removed: " + queueArray[head - 1]);
        }
        currentSize--;

    }
}

