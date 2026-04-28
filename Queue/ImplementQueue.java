
/* /*
 * Queue implementation using array (FIFO principle).
 * Supports enqueue, dequeue, peek, and display operations.
 * Uses front and rear pointers to manage elements.
 * Handles overflow (full queue) and underflow (empty queue).
 * Time Complexity: O(1) for enqueue and dequeue.
 */

class QueueArray {
    int front, rear, maxSize;
    int[] queue;

    // Constructor
    QueueArray(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
    }

    // Enqueue (Insert)
    void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
            System.out.println(value + " inserted");
        }
    }

    // Dequeue (Remove)
    int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            return queue[front++];
        }
    }

    // Peek
    int peek() {
        if (front > rear) {
            System.out.println("Queue Empty");
            return -1;
        }
        return queue[front];
    }

    // Display
    void display() {
        if (front > rear) {
            System.out.println("Queue Empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Front: " + q.peek());
    }
}
