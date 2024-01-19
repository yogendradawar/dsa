package dsa.dsa_java.week_6.Linked_List_2;

import java.util.*;

public class reversellrecursive3 {
    public static Node<Integer> reverseLLBetter(Node<Integer> head){

        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> reverseTail = head.next;
        Node<Integer> smallHead = reverseLLBetter(head.next);
        reverseTail.next = head;
        head.next= null;

        return smallHead;
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
        Node<Integer> ans = reverseLLBetter(head);
        print(ans);
    }
}
