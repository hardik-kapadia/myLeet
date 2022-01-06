class MyCircularQueue {

    private int[] queue;
    private int first;
    private int last;
    private int size;

    public MyCircularQueue(int k) {

        this.size = k;
        this.queue = new int[k];
        this.last = -1;
        this.first = -1;

    }

    public boolean enQueue(int value) {

        if (isFull())
            return false;

        if (isEmpty())
            this.first = 0;

        last = (last + 1) % size;

        this.queue[last] = value;

        return true;

    }

    public boolean deQueue() {
        if (isEmpty())
            return false;

        if (first == last) {
            first = -1;
            last = -1;
            return true;
        }

        queue[first] = -1;
        first = (first + 1) % size;

        return true;
    }

    public int Front() {
        if (!isEmpty())
            return this.queue[first];

        return -1;
    }

    public int Rear() {
        if (!isEmpty())
            return this.queue[last];

        return -1;
    }

    public boolean isEmpty() {
        return (this.last == -1 || this.first == -1);
    }

    public boolean isFull() {
        if (this.last == -1 || this.first == -1)
            return false;

        return (this.last + 1) % size == first;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */