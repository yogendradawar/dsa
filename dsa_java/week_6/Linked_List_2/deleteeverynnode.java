package dsa.dsa_java.week_6.Linked_List_2;

import java.util.Scanner;

public class deleteeverynnode {
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {

        if(M == 0 || head == null){
            return null;
        }

        if(N == 0){
            return head;
        }

        Node<Integer>current = head ;
        Node<Integer>temp = null;
        int cnt = 0;

        while(current != null){
            int take = 0;
            int skip = 0;
            while( take < M && current != null ){
                if(temp == null){
                    temp = current;
                }
                else{
                    temp.next = current;
                    temp = current;
                }
                current = current.next;
                take++;
            }

            while(skip  < N && current != null){
                current = current.next;
                skip++;
            }
        }

        if(temp != null){
            temp.next = null;
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
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Node<Integer> ans = skipMdeleteN(head,m,n);
        print(ans);
    }
}
