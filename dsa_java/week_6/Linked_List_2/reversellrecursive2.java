package dsa.dsa_java.week_6.Linked_List_2;

import java.util.*;

// class Double {
//     Node<Integer> head;
//     Node<Integer> tail;
// }

public class reversellrecursive2 {
    public static Double reverseLLBetter(Node<Integer> head){

        if(head == null || head.next == null){
            Double ans = new Double();
            ans.head = head;
            ans.tail = head;
            return ans;
        }

        Double smallAns = reverseLLBetter(head.next);
        smallAns.tail.next = head;
        head.next = null;   

        Double ans = new Double();
        ans.head = smallAns.head;
        ans.tail = head;

        return ans;

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
        Double ans = reverseLLBetter(head);
        print(ans.head);
    }
}
