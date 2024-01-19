package dsa.dsa_java.week_6.Linked_List_2;

// Problem statement

// Given a singly linked list of integers, reverse it using recursion and return the head to the modified list. You have to do this in O(N) time complexity where N is the size of the linked list.

//  Note :
// No need to print the list, it has already been taken care. Only return the new head to the list.

// Sample Input 1 :
// 1
// 1 2 3 4 5 6 7 8 -1
// Sample Output 1 :
// 8 7 6 5 4 3 2 1
// Sample Input 2 :
// 2
// 10 -1
// 10 20 30 40 50 -1
// Sample Output 2 :
// 10 
// 50 40 30 20 10 
import java.util.Scanner;
public class reversellrecursive {
    public static Node<Integer> reverseRec(Node<Integer> head){

        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> newNode = reverseRec(head.next);
        Node<Integer>temp = newNode;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;

        return newNode;
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
    
          System.out.print(head.data+" ");
          print(head.next);
          
        }

    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        Node<Integer> ans = reverseRec(head);
        print(ans);
    }
}
