package dsa.dsa_java.week_6.Linked_List_2;

import java.util.Scanner;
public class evenafteroddll {
    public static Node<Integer> evenAfterOdd(Node<Integer>head){
        Node<Integer> odd =null, even = null, oddHead = null, evenHead = null;

        while(head != null){
            if(head.data % 2 == 0){
                if(even == null){
                    evenHead = head;
                    even = head;
                }
                else{
                    even.next = head;
                    even = head;
                }
            }
            else{
                if(odd == null){
                    oddHead = head;
                    odd = head;
                }
                else{
                    odd.next = head;
                    odd = head;
                }
            }
            head = head.next;
        }

        if(oddHead != null){
            odd.next = evenHead;
        }
        else{
            return evenHead;
        }

        if(even != null){
            even.next = null;
        }

        return oddHead;
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
        Node<Integer> ans = evenAfterOdd(head);
        print(ans);
    }
}
