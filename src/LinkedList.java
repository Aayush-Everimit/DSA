public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public class Node {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }


    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = tail;
            tail = newNode;
            size++;
        }
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
    public void display() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "->");
        }
        System.out.println("List is empty");
    }
}