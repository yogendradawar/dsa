package dsa.dsa_java.week_7.Test_2;

import java.util.Scanner;



public class deleteAlternatesNode {

    public static Node<Integer> input() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.getData() + " ");
            head = head.next;
        }
    }

    public static void deleteAlternateNodes(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> list = input();
        deleteAlternateNodes(list);
        print(list);
    }
}
