package dsa.dsa_java.week_7.Test_2;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Dequeue {
    private Node front;
    private Node rear;
    private int size;
    private int capacity;

    public Dequeue(int capacity) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.capacity = capacity;
    }

    public void insertFront(int element) {
        if (size == capacity) {
            System.out.println("-1");
            return;
        }

        Node newNode = new Node(element);

        if (size == 0) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
        size++;
    }

    public void insertRear(int element) {
        if (size == capacity) {
            System.out.println("-1");
            return;
        }

        Node newNode = new Node(element);
        if (size == 0) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void deleteFront() {
        if (size == 0) {
            return ;
        }

        int element = front.data;
        if (size == 1) {
            rear = null;
            front = null;
        } else {
            front = front.next;
        }
        size--;
    }

    public void deleteRear() {
        if (size == 0) {
            return ;
        }

        int temp = rear.data;
        if (size == 1) {
            front = rear = null;
        } else {
            Node current = front;
            while (current.next != rear) {
                current = current.next;
            }
            rear = current;
            rear.next = null;
        }
        size--;
    }

    public int getFront() {
        if (size == 0) {
            return -1;
        }
        return front.data;
    }

    public int getRear() {
        if (size == 0) {
            return -1;
        }
        return rear.data;
    }
}
