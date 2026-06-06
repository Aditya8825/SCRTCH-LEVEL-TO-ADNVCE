public class StackArray {
    int[] stack;
    int top;
    int capacity;

    // Constructor
    StackArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    // Push element
    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    // Pop element
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek top element
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    // Check if empty
    boolean isEmpty() {
        return top == -1;
    }

    // Size of stack
    int size() {
        return top + 1;
    }

    // Display stack
    void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray s = new StackArray(5);

        // Push elements
        s.push(10);
        s.push(20);
        s.push(30);

        // Print stack
        s.display();

        // Peek top element
        System.out.println("Top element: " + s.peek());

        // Pop element
        System.out.println("Popped: " + s.pop());

        // Stack after pop
        s.display();

        // Check empty
        System.out.println("Is stack empty? " + s.isEmpty());

        // Size of stack
        System.out.println("Size: " + s.size());
    }
}