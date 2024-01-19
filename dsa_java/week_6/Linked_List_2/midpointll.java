package dsa.dsa_java.week_6.Linked_List_2;

import java.util.*;
public class midpointll {
    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if(head == null){
            return head;
        }

        Node<Integer>slow = head, fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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
    
        if(head==null){
            return ;
          }
    
          System.out.print(head.data + " ");
          print(head.next);
          
        }

    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        Node<Integer> ans = midPoint(head);
        System.out.println(ans.data);
    }
}
