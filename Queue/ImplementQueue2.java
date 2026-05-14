//Implementation if queue using Linked List 
class QueueLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null, rear = null;

    // Enqueue
    void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " inserted");
    }

    // Dequeue
    int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    // Peek
    int peek() {
        if (front == null) {
            System.out.println("Queue Empty");
            return -1;
        }
        return front.data;
    }

    // Display
    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(5);
        q.enqueue(15);
        q.enqueue(25);
        q.display();
        System.out.println("Removed: " + q.dequeue());
    }
}
