package dsa.dsa_java.week_6.Linked_List_2;

import java.util.Scanner;

public class Node<T> {
    T data ;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}
