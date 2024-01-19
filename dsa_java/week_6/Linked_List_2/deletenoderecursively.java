package dsa.dsa_java.week_6.Linked_List_2;

import java.util.Scanner;
// DELTE NODE RECURSIVELY 

// Problem statement

// Given a singly linked list of integers and position 'i', delete the node present at the 'i-th' position in the linked list recursively.

//  Note :

// Assume that the Indexing for the linked list always starts from 0.

// No need to print the list, it has already been taken care. Only return the new head to the list.


// Constraints :

// 1 <= t <= 10^2
// 0 <= M <= 10^5
// Where M is the size of the singly linked list.
// 0 <= i < M
// Time Limit:  2 sec

// Sample Input 1 :
// 1
// 3 4 5 2 6 1 9 -1
// 3
// Sample Output 1 :
// 3 4 5 6 1 9

// Sample Input 2 :
// 2
// 30 -1
// 0
// 10 20 30 50 60 -1
// 4
// Sample Output 2 :
// 10 20 30 50 





public class deletenoderecursively {
    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        if(pos == 0 && head!= null){
            return head.next;
        }

        if(head == null && pos<= 0){
            return head;
        }

        head.next = deleteNodeRec(head.next, pos-1);
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
    
          System.out.print(head.data+" ");
          print(head.next);
          
        }

    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        Scanner sc = new Scanner (System.in);
        int pos = sc.nextInt();
        Node<Integer> ans = deleteNodeRec(head,pos);
        print(ans);
    }
}
