/*
/*
 * Stack Implementation using Array in Java
 *
 * This program demonstrates a basic implementation of a Stack data structure
 * using an array. A stack follows the LIFO (Last In First Out) principle,
 * where the last element inserted is the first one to be removed.
 *
 * Features:
 * - Push operation (insert element into stack)
 * - Pop operation (remove top element)
 * - Peek operation (view top element without removing)
 * - Display operation (print stack elements)
 *
 * Key Concepts:
 * - 'top' variable is used to track the index of the top element
 * - Stack Overflow occurs when the stack is full
 * - Stack Underflow occurs when the stack is empty
 *
 * Time Complexity:
 * - Push: O(1)
 * - Pop: O(1)
 * - Peek: O(1)
 *
 * This implementation is suitable for learning basic stack operations
 * and is commonly asked in DSA exams and interviews.
 */


class StackArray {
    int maxSize;
    int[] stack;
    int top;

    // Constructor
    StackArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    // Push operation
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed");
        }
    }

    // Pop operation
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Peek operation
    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    // Display
    void display() {
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        System.out.println("Top: " + s.peek());
    }
}
