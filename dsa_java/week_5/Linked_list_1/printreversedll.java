import java.util.Scanner;
class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}
public class printreversedll {

    public static Node<Integer> printReverse(Node<Integer>head){
        Node<Integer> prev= null, next = null;

        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }

    public static Node<Integer> takeInput(){
        Node<Integer> head = null , tail = null;
        Scanner sc = new Scanner (System.in);
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<Integer> (data);
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
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Node<Integer> ans = printReverse(head);
        print(ans);
        // printReverse(head);
    }
}
