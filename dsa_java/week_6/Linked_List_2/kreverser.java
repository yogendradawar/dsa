package dsa.dsa_java.week_6.Linked_List_2;

import java.util.Scanner;

public class kreverser {
    public static Node<Integer> kReverse(Node<Integer> head, int k){
        while(k ==0 || k ==1){
            return head;
        }
        int cnt = 0;
        Node<Integer>current = head , prev = null, next =null;

        while(cnt < k && current != null ){
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
           cnt++;
        }

        if(next != null){
            head.next = kReverse(next, k);
        }

        return prev;
    }

    public static Node<Integer> takeinput(){
        Node<Integer> head = null , tail = null;
        Scanner sc = new Scanner (System.in);
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail  = newNode;

            }
            data = sc.nextInt();
        }
        return head;
    }


    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        Scanner sc  = new Scanner(System.in);
        int k = sc.nextInt();
        Node<Integer> ans = kReverse(head, k);
        print(ans);
    }
}
