package Day2;

import java.util.Arrays;

public class QueueSDA <E> {

    private E[] queue;
    private int head;
    private int tail;
    private int size;
    private final int capacity;

    public QueueSDA(int capacity) {
        this.capacity = capacity;
        this.queue = (E[]) new Object[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }


    public boolean push(E e) {
        if (!isFull()) {
            this.queue[this.head] = e;
            this.head = (this.head + 1) % this.capacity;
            this.size++;

            return true;
        } else {
            throw new QueueIsFullException();
        }
    }


    public E pop() {
        if (isEmpty()) {
            throw new NoItemsInQueueException();

        } else {
            E returnObject = this.queue[this.tail];
            this.queue[this.tail] = null;
            this.tail = (this.tail + 1) % this.capacity;
            this.size--;

            return returnObject;
        }
    }


    public E peek() {
        if (!isEmpty()) {
            return this.queue[this.tail];
        } else {
            return null;
        }
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String print() {
        String elements = "[ ";
        for (int i = tail; i < this.size; i++) {
            elements += this.queue[i];
            if(i % 1 == this.size){

            }
        } elements += " ]";
        return String.format("Size: %d, elements: %s",this.size, elements);
    }
}
