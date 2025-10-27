import java.util.Queue;

public class Main
{
    public static void main(String[] args)
    {
        int capacity = 5;
        ArrayQueueCircular q = new ArrayQueueCircular(8);
        int data[] = {10,20,30,40,50,60,70,20};

        for(int i=0;i<data.length;i++)
        {
            q.enqueue(data[i]);
        }

        System.out.println("First value stored : "+q.peek());
//        q.display();
        System.out.println("Size : "+q.size());
        System.out.println("Element removed : "+q.dequeue());
        System.out.println("After dequeue : "+q.peek());
//        q.display();
        System.out.println("Size : "+q.size());

    }
}