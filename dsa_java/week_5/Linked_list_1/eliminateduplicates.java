import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

public class eliminateduplicates {

    public static Node<Integer>removeDuplicates(Node<Integer>head){
        if(head == null){
            return head;
        }
        Node<Integer>current = head;
        while(current.next != null){
            if(current.data.equals(current.next.data)){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }

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

    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);
        Node<Integer> head = takeInput();
        Node<Integer> ans = removeDuplicates(head);
        print(ans);
    }
}
