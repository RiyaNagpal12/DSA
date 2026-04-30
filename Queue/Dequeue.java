/* /*
 * Deque Implementation using Circular Array
 *
 * This program implements a double-ended queue (Deque) where elements
 * can be inserted and removed from both front and rear.
 *
 * Approach:
 * - A circular array is used to efficiently utilize space.
 * - Two pointers (front and rear) are maintained.
 * - Modulo (%) operation is used to wrap around the array.
 *
 * Operations Supported:
 * - addFront(): Insert element at the front
 * - addLast(): Insert element at the rear
 * - removeFront(): Delete element from the front
 * - removeEnd(): Delete element from the rear
 * - getFront() / getRear(): Peek elements
 * - display(): Print deque elements
 *
 * Key Idea:
 * - Circular indexing avoids shifting of elements and ensures O(1) operations.
 *
 * Time Complexity:
 * - All operations → O(1)
 *
 * Space Complexity:
 * - O(n)
 */

public class q26 {
    public static class deque {
        int arr[];
        int front, rear, size;

        public deque(int n) {
            size = n;
            arr = new int[n];   // FIXED
            front = rear = -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public boolean isEmpty() {
            return front == -1;
        }

        public void addFront(int data) {
            if (isFull()) {
                System.out.println("full");
                return;
            }

            if (isEmpty()) {
                front = rear = 0;
            } else {
                front = (front - 1 + size) % size;  // FIXED
            }
            arr[front] = data;
        }

        public void addLast(int data) {
            if (isFull()) {
                System.out.println("full");
                return;
            }

            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % size;  // FIXED
            }
            arr[rear] = data;
        }

        public int removeFront() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }

            int val = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return val;
        }

        public int removeEnd() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }

            int val = arr[rear];
            if (front == rear) {
                front = rear = -1;
            } else {
                rear = (rear - 1 + size) % size;  // FIXED
            }
            return val;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("empty");
                return;
            }

            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        deque dq = new deque(5);

        dq.addLast(10);
        dq.addLast(20);
        dq.addFront(5);
        dq.display();   // 5 10 20

        dq.removeFront();
        dq.display();   // 10 20
    }
}
