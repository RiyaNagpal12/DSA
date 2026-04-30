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
