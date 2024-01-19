package dsa.dsa_java.week_6.Linked_List_2;

import java.util.Scanner;

public class swaptwonodesofll {

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j){
        if(i == j){
            return head;
        }
        Node<Integer>current = head , prev = null , prev1 = null , prev2 = null , curr1 = null , curr2 =null;
        int cnt  = 0 ;
        while(current != null){
            if(cnt == i){
                prev1 = prev;
                curr1 = current;
            }
            else if (cnt == j){
                prev2 = prev;
                curr2 = current;
            }
            prev = current;
            current = current.next;
            cnt++;

             if(curr1 != null && curr2 != null){
                break;
             }
        }

        if(prev1 != null){
            prev1.next = curr2;  
        }
        else{
            head = curr2;
        }

        if(prev2 != null){
            prev2.next = curr1;
        }
        else{
            head  = curr1;
        }

        Node<Integer> temp = curr2.next;
        curr2.next = curr1.next;
        curr1.next = temp;

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
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        Scanner sc  = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        Node<Integer> ans = swapNodes(head, i , j);
        print(ans);
    }
}
