public class StackArry {
    int[] arr;
    int TOP;
    int capacity;

    StackArry(int size) {
        arr = new int[size];
        capacity = size;
        TOP = -1;
    }

    private boolean isEmpty() {
        return TOP == -1;
    }

    private boolean isFull() {
        return TOP == capacity - 1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return;
        }

        System.out.println("Stack Elements : ");
        for (int i = 0; i <= TOP; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            return;
        }

        arr[++TOP] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return -1;
        }

        return arr[TOP--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return -1;
        }

        return arr[TOP];
    }

    public static void main(String[] args) {
        StackArry stack = new StackArry(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStack();

        stack.push(4);

        System.out.println("PEEK element : " + stack.peek());

        System.out.println("Pop element : " + stack.pop());
        System.out.println("Pop element : " + stack.pop());
        System.out.println("Pop element : " + stack.pop());
        stack.pop();
    }
}