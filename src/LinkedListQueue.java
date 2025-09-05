import java.util.NoSuchElementException;

public class LinkedListQueue
{
    class Node
    {
        private int data;
        Node next;
        int element;

        public Node(int element)
        {
            this.element = element;
        }
    }
    private int size;
    private Node front;
    private Node rear;
    public LinkedListQueue()
    {
        size = 0;
        front = null;
        rear = null;
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size == 0|| rear == null;
    }
    public void  enqueue(int element)
    {
        Node newNode = new Node(element);
        if(isEmpty())
        {
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear=newNode;
        }
        size++;
    }
    public int peek()
    {
        return front.element;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("Queue is empty");
        }
        else
        {
            int removed =  front.element;
            front = front.next;
            if(front == null)
            {
                rear = null;
            }
            size--;
            return removed;
        }

    }
}
