package dsa.dsa_java.week_6.Linked_List_2;

import java.util.Scanner;

/**
 * findanodeinllusingrecur
 */

public class findanodeinllusingrecur {

    // I HAVE SOLVE THESE PROBLEM BY TAKING ANOTHER FUNUCTION TO FIND THE RECURSIVE INDEX   
    public static int findout(Node<Integer>head , int n , int pos){
        if(head == null){
            return -1;
        }

        if(head.data.equals(n)){
            return pos;
        }

        return findout(head.next, n, pos+1);

    }
    public static int recursive (Node<Integer>head , int n){
        //MY APPROACH TO SOLVE THESE PROBLEM

        return findout(head , n , 0);

        //SEEN SOLUTION 
        // if(head == null){
        //     return -1;
        // }

        // if(head.data.equals(n)){
        //     return 0;
        // }

        // int smallAns = recursive(head.next, n);

        // if(smallAns == -1){
        //     return -1;
        // }
        
        // return smallAns + 1;
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
    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        Scanner sc = new Scanner(System.in);
        int value  = sc.nextInt();
        System.out.println(recursive(head, value));
    }
}