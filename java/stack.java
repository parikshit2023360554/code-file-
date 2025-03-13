class CustomStack {
    private int[] arr;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1; 
        }
        return arr[top--];
    }

 
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }


    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStack();
        stack.pop();
        System.out.println("\nAfter popping out");
        stack.printStack();
    }
}
