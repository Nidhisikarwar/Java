class StackArrayy {
    public static final int MAX_SIZE = 5; // Define maximum size of the stack
    public int[] stackArray = new int[MAX_SIZE];
    public int top = -1;

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
        StackArrayy myStack = new StackArrayy();

        
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("Popped item: " + myStack.pop());
        System.out.println("Popped item: " + myStack.pop());
        System.out.println("Popped item: " + myStack.pop());
        System.out.println("Popped item: " + myStack.pop()); // This will print "Stack underflow"
    }
}
