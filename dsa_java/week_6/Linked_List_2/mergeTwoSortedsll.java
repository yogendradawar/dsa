package dsa.dsa_java.week_6.Linked_List_2;

import java.util.*;
public class mergeTwoSortedsll {
    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        Node<Integer>tail1 = head1 , tail2 = head2 , head = null , tail = null;

        if(tail1.data <= tail2.data){
            head = tail1;
            tail = tail1;
            tail1= tail1.next;
        }
        else{
            head = tail2;
            tail = tail2;
            tail2 = tail2.next;
        }

        while(tail1 != null && tail2 != null){
            if(tail1.data <= tail2.data){
                tail.next = tail1;
                tail = tail1;
                tail1= tail1.next;
            }
            else{
                tail.next = tail2;
                tail = tail2;
                tail2 = tail2.next;
            }
        }

        if(tail1 != null){
            tail.next = tail1;
        }

        else{
            tail.next = tail2;
        }

        return head;
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
        Node<Integer> head1 = takeinput();
        Node<Integer> head2 = takeinput();
        Node<Integer> ans = mergeTwoSorteds(head1,head2);
        print(ans);
    }
}
