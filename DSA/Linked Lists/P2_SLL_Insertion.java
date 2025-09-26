public class P2_SLL_Insertion {

    // Head of the linked list
    private Node HEAD;

    // Node class representing each element in the list
    static class Node {
        int data; // data stored in the node
        Node next; // reference to the next node

        Node(int data) {
            this.data = data;
            this.next = null; // initially next is null
        }
    }

    // 1. Insert a new node at the start of the list
    public void insertAtStart(int value) {
        Node newNode = new Node(value); // create new node
        newNode.next = HEAD; // link new node to current head
        HEAD = newNode; // update head to new node
    }

    // 2. Insert a new node at the end of the list
    public void insertAtEnd(int value) {
        Node newNode = new Node(value); // create new node

        if (HEAD == null) { // if list is empty
            HEAD = newNode; // new node becomes head
            return;
        }

        Node current = HEAD; // start from head
        while (current.next != null) { // traverse to last node
            current = current.next;
        }
        current.next = newNode; // link last node to new node
    }

    // 3. Insert a new node at a specific index
    public void insertByIndex(int index, int value) {
        if (index < 0) { // invalid index
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) { // same as insertAtStart
            insertAtStart(value);
            return;
        }

        Node newNode = new Node(value); // create new node
        Node current = HEAD;
        int count = 0;

        // traverse to node just before the desired index
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) { // index out of bounds
            System.out.println("index out of range or bound");
            return;
        }

        // insert node at the index
        newNode.next = current.next;
        current.next = newNode;
    }

    // Display the linked list
    public void display() {
        Node current = HEAD; // start from head
        while (current != null) { // loop through list
            System.out.print(current.data + " -> "); // print node data
            current = current.next; // move to next node
        }
        System.out.println("NULL"); // end of list
    }

    public static void main(String[] args) {

        P2_SLL_Insertion list = new P2_SLL_Insertion();

        // Step 1: Insert at end: 10, 20, 30
        list.insertAtEnd(10); // List: 10 -> NULL
        list.insertAtEnd(20); // List: 10 -> 20 -> NULL
        list.insertAtEnd(30); // List: 10 -> 20 -> 30 -> NULL
        list.display(); // Output: 10 -> 20 -> 30 -> NULL

        // Step 2: Insert at start: 5
        list.insertAtStart(5); // List: 5 -> 10 -> 20 -> 30 -> NULL
        list.display(); // Output: 5 -> 10 -> 20 -> 30 -> NULL

        // Step 3: Insert by index: 15 at index 2
        // Indexing: 0 -> 5, 1 -> 10, 2 -> (new node 15)
        list.insertByIndex(2, 15); // List: 5 -> 10 -> 15 -> 20 -> 30 -> NULL
        list.display(); // Output: 5 -> 10 -> 15 -> 20 -> 30 -> NULL
    }
}

/*
 * Traversal -> O(n) -> Must visit each node once
 * 
 * Insertion at Start -> O(1) -> Just change HEAD pointer
 * Insertion at End -> O(n) -> Need to traverse to Last Node
 * Insertion at Middle/Index -> O(n) -> Need to reach the given index before inserting
 */