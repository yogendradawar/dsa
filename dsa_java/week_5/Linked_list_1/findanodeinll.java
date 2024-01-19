import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

public class findanodeinll {

    public static Node<Integer> takeInput (){
        Node<Integer>head= null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
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

    public static int findNode(Node<Integer> head , int n){

        Node<Integer> temp = head;
        int pos = 0;
        while(temp != null){
            // if(temp.data == n){
            //     return pos;
            // }
            // else{
            //     temp = temp.next;
            //     pos++;
            // }

            if(head.data.equals(n)){
                return pos;
            }

            temp = temp.next;
            pos++;
        }
        return -1;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

       Node<Integer> head = takeInput();
       int pos = sc.nextInt();
       int ans = findNode(head, pos);
       System.out.println(ans); 
    }
}
