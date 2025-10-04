public class Stack_SLL {

    private Node TOP;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Stack_SLL() {
        this.TOP = null;
    }

    private boolean isEmpty() {
        return TOP == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        newNode.next = TOP; // Link newNode to the top
        TOP = newNode; // Make newNode the top

        System.out.println(data + " is pushed into STACK");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK UNDERFLOW");
            return -1;
        }

        int popped = TOP.data;
        TOP = TOP.next;
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("STACK UNDERFLOW");
            return -1;
        }

        return TOP.data;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("STACK UNDERFLOW");
            return;
        }

        System.out.println("Stack Elements --------");
        Node current = TOP;
        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_SLL stack_sll = new Stack_SLL();

        stack_sll.push(1);
        stack_sll.push(2);
        stack_sll.push(3);
        stack_sll.printStack();

        stack_sll.push(4);
        stack_sll.printStack();

        System.out.println("PEEK element : " + stack_sll.peek());

        System.out.println("Pop element : " + stack_sll.pop());
        System.out.println("Pop element : " + stack_sll.pop());
        System.out.println("Pop element : " + stack_sll.pop());
        System.out.println("Pop element : " + stack_sll.pop());
        stack_sll.pop();
    }
}
