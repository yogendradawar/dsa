package dsa.dsa_java.week_7.Queues;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        this.next = null;
    }
}
