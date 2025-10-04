class DLL_Deletion {
    Node HEAD;

    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (HEAD == null) {
            HEAD = newNode;
            return;
        }

        Node current = HEAD;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    public void show() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.data + " <---> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public void deleteAtStart() {
        if (HEAD == null) {
            System.out.println("Empty LL");
            return;
        }

        if (HEAD.next == null) {
            HEAD = null;
            return;
        }

        HEAD = HEAD.next;
        HEAD.prev = null;
    }

    public void deleteAtEnd() {
        if (HEAD == null) {
            System.out.println("Empty LL");
            return;
        }

        if (HEAD.next == null) {
            HEAD = null;
            return;
        }

        Node current = HEAD;
        while (current.next != null) {
            current = current.next;
        }

        current.prev.next = null;
    }

    public void deleteByIndex(int index) {
        if (HEAD == null) {
            System.out.println("Empty LL");
            return;
        }

        if (index == 0) {
            deleteAtStart();
            return;
        }

        Node current = HEAD;
        for (int i = 0; current != null && i < index; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException();
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

    }
}

public class P23_DLL_Deletion {
    public static void main(String[] args) {
        DLL_Deletion dll = new DLL_Deletion();
        dll.insertAtEnd(5);
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        // dll.show(); // 5 <---> 10 <---> 20 <---> NULL

        dll.deleteAtStart();
        // dll.show(); // 10 <---> 20 <---> NULL

        dll.insertAtEnd(30);
        // dll.show(); // 10 <---> 20 <---> 30 <---> NULL

        dll.deleteAtEnd();
        // dll.show(); // 10 <---> 20 <---> NULL

        dll.insertAtEnd(40);
        dll.show(); // 10 <---> 20 <---> 40 <---> NULL

        dll.deleteByIndex(1);
        dll.show(); // 10 <---> 40 <---> NULL
    }

}
