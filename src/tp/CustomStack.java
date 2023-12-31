package tp;

public class CustomStack {
    private int capacity;
    private int[] stack;
    private int top;

    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void addElement(int element) {
        if (!isFull()) {
            stack[++top] = element;
        } else {
            System.out.println("Stack is full. Cannot add element.");
        }
    }

    public int removeElement() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty. No element to remove.");
            return -1; // Return a default value or throw an exception as needed
        }
    }

    public int lastInStack() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty.");
            return -1; // Return a default value or throw an exception as needed
        }
    }

    public boolean stackIsEmpty() {
        return top == -1;
    }

    public boolean stackIsFull() {
        return top == capacity - 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }
}
