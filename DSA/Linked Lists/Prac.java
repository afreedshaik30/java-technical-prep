class Dll_insert {
    Node HEAD;

    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);

        if (HEAD == null) {
            HEAD = newNode;
            return;
        }

        newNode.next = HEAD;
        HEAD.prev = newNode;
        HEAD = newNode;
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

    public void insertByIndex(int index, int data) {
        if (index < 0) {
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = HEAD;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException();
        }

        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
    }

    public void showDLL() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.data + " <---> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}

public class Prac {
    public static void main(String[] args) {

        Dll_insert dll_insert = new Dll_insert();
        dll_insert.insertAtEnd(10);
        dll_insert.insertAtEnd(20);
        dll_insert.insertAtStart(5);

        dll_insert.insertByIndex(1, 15);

        dll_insert.showDLL();
    }
}

/*
 * class DLList {
 * 
 * Node HEAD;
 * 
 * static class Node {
 * Node prev;
 * int data;
 * Node next;
 * 
 * Node(int data) {
 * this.data = data;
 * }
 * }
 * 
 * public void createList() {
 * Node n1 = new Node(11);
 * Node n2 = new Node(22);
 * Node n3 = new Node(33);
 * Node n4 = new Node(44);
 * 
 * HEAD = n1;
 * n1.next = n2;
 * 
 * n2.prev = n1;
 * n2.next = n3;
 * 
 * n3.prev = n2;
 * n3.next = n4;
 * 
 * n4.prev = n3;
 * }
 * 
 * public void traverseForward() {
 * Node current = HEAD;
 * while (current != null) {
 * System.out.print(current.data + " -> ");
 * current = current.next;
 * }
 * System.out.println("NULL");
 * }
 * 
 * public void traverseBackward() {
 * Node current = HEAD;
 * while (current.next != null) {
 * current = current.next;
 * }
 * 
 * while (current != null) {
 * System.out.print(current.data + " <- ");
 * current = current.prev;
 * }
 * System.out.println("NULL");
 * }
 * }
 * 
 * public class Prac {
 * public static void main(String[] args) {
 * DLList list = new DLList();
 * 
 * list.createList();
 * list.traverseForward();
 * list.traverseBackward();
 * }
 * }
 */

/*
 * class SLL {
 * Node HEAD;
 * 
 * static class Node {
 * int data;
 * Node next;
 * 
 * Node(int data) {
 * this.data = data;
 * }
 * }
 * 
 * // insertion
 * public void insertAtStart(int data) {
 * Node newNode = new Node(data);
 * newNode.next = HEAD;
 * HEAD = newNode;
 * }
 * 
 * public void insertAtEnd(int data) {
 * Node newNode = new Node(data);
 * if (HEAD == null) {
 * HEAD = newNode;
 * return;
 * }
 * Node current = HEAD;
 * while (current.next != null) { // To last node
 * current = current.next;
 * }
 * current.next = newNode;
 * }
 * 
 * public void insertByIndex(int index, int data) {
 * if (index < 0) {
 * System.out.println("Invalid Index");
 * return;
 * }
 * 
 * if (index == 0) {
 * insertAtStart(data);
 * return;
 * }
 * 
 * Node newNode = new Node(data);
 * Node current = HEAD;
 * for (int i = 0; current != null && i < index - 1; i++) {
 * current = current.next;
 * }
 * 
 * if (current == null) {
 * throw new IndexOutOfBoundsException();
 * }
 * 
 * newNode.next = current.next;
 * current.next = newNode;
 * }
 * 
 * // traverse + count
 * public void display() {
 * int count = 0;
 * Node current = HEAD;
 * while (current != null) {
 * count++;
 * System.out.print(current.data + " -> ");
 * current = current.next;
 * }
 * System.out.println("NULL");
 * 
 * System.out.println("count of Node : " + count);
 * }
 * 
 * // deletion
 * public void deleteAtStart() {
 * if (HEAD != null) {
 * HEAD = HEAD.next;
 * return;
 * }
 * }
 * 
 * public void deleteAtEnd() {
 * if (HEAD == null || HEAD.next == null) {
 * HEAD = null;
 * return;
 * }
 * 
 * Node current = HEAD;
 * while (current.next.next != null) {
 * current = current.next;
 * }
 * current.next = null;
 * }
 * 
 * public void deleteByIndex(int index) {
 * if (index < 0) {
 * System.out.println("Invalid Index");
 * return;
 * }
 * 
 * if (index == 0) {
 * deleteAtStart();
 * return;
 * }
 * 
 * Node current = HEAD;
 * for (int i = 0; current != null && i < index - 1; i++) {
 * current = current.next;
 * }
 * 
 * if (current == null || current.next == null) {
 * throw new IndexOutOfBoundsException();
 * }
 * 
 * current.next = current.next.next;
 * }
 * }
 * 
 * public class Prac {
 * public static void main(String[] args) {
 * SLL list = new SLL();
 * 
 * // list.display();
 * 
 * list.insertAtEnd(10);
 * list.insertAtEnd(20);
 * // list.display();
 * 
 * list.insertAtStart(5);
 * // list.display();
 * 
 * list.insertByIndex(2, 15);
 * list.display(); // 5 -> 10 -> 15 -> 20 -> NULL
 * 
 * list.deleteAtStart();
 * list.display(); // 10 -> 15 -> 20 -> NULL
 * 
 * list.deleteByIndex(1);
 * list.display(); // 10 -> 20 -> NULL
 * 
 * list.deleteAtEnd();
 * list.display(); // 10 -> NULL
 * 
 * }
 * }
 */