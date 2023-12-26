class Stack2 {
    private static final int MAX_SIZE = 5; // Define maximum size of the stack
    private int[] stackArray = new int[MAX_SIZE];
    private int top = -1;

    // Push item onto the stack
    void push(int item) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = item;
        }
    }

    // Pop item from the stack
    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return -1; // Return a sentinel value to indicate underflow
        } else {
            return stackArray[top--];
        }
    }

    public static void main(String args[]) {
        Stack2 myStack = new Stack2();

        // Example usage
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("Popped item: " + myStack.pop());
        System.out.println("Popped item: " + myStack.pop());
        System.out.println("Popped item: " + myStack.pop());
        System.out.println("Popped item: " + myStack.pop()); // This will print "Stack underflow"
    }
}
