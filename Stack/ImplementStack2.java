class StackLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    // Push
    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed");
    }

    // Pop
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Peek
    int peek() {
        if (top == null) {
            System.out.println("Stack Empty");
            return -1;
        }
        return top.data;
    }

    // Display
    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(5);
        s.push(15);
        s.push(25);
        s.display();
        System.out.println("Popped: " + s.pop());
    }
}
