package dsa.dsa_java.week_6.Stacks;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }  
}
