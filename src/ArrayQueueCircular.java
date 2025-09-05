import java.util.NoSuchElementException;

public class ArrayQueueCircular
{
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueueCircular(int capacity)
    {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public boolean isFull()
    {
        return size == capacity;
    }
    public int size()
    {
        return size;
    }
    public int peek()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("Queue is empty");
        }
        else{
            return arr[front];
        }
    }
    public int getCapacity()
    {
        return capacity;
    }
    public void enqueue(int item)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        else
        {
            arr[++rear] = item;
            size++;
        }
    }

    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            throw  new NoSuchElementException("Queue is empty");
        }
        else{
            int item = arr[front];
            size--;
            front++;
            return item;
        }

    }

}
