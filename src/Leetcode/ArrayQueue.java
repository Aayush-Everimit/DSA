import java.util.NoSuchElementException;

public class ArrayQueue
{
    private int[] queue;
    private int front, rear, size, capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }
    public int size()
    {
        return size;
    }
    public int getCapacity()
    {
        return capacity;
    }
    public boolean isEmpty()
    {
        return rear<front || rear==-1;
    }
    public boolean isFull()
    {
        return rear==capacity-1;
    }

    public ArrayQueue() {
      this(5);
    }
    public void enqueue(int element)
    {
        if(!isFull())
        {
            queue[++rear]=element;
            System.out.println("enqueued: "+element);
            size++;
        }
        else{
            System.out.println("Queue is full");
        }

    }
    public int peek()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("Queue is empty");
        }
        else{
        return queue[front];
        }
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("Queue is empty");
        }
        else{
            size--;
            return queue[front++];
        }
    }
}
