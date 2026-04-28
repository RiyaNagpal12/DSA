/*
 * Stack Implementation using Linked List in Java
 *
 * This program implements a Stack data structure using a singly linked list.
 * A stack follows the LIFO (Last In First Out) principle, where insertion
 * and deletion happen only at one end called the "top".
 *
 * Features:
 * - Push operation (adds element at the top)
 * - Pop operation (removes top element)
 * - Peek operation (returns top element without removing)
 * - Display operation (prints all stack elements)
 *
 * Key Concepts:
 * - Each node contains data and a reference to the next node
 * - 'top' points to the first node of the linked list
 * - No fixed size → dynamic memory allocation
 * - Stack Underflow occurs when trying to pop from an empty stack
 *
 * Advantages over Array Implementation:
 * - No size limitation (dynamic growth)
 * - Efficient memory utilization
 *
 * Time Complexity:
 * - Push: O(1)
 * - Pop: O(1)
 * - Peek: O(1)
 *
 * This implementation is useful for understanding dynamic stack behavior
 * and is commonly asked in coding interviews and exams.
 */



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
