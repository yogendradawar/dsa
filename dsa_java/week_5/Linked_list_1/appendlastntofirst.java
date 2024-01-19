import java.util.Scanner;
class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}
public class appendlastntofirst {

    public static Node<Integer> appendLastNToFirst (Node<Integer> head , int n){

        Node<Integer> fast = head;
        Node<Integer> slow = head;
        Node<Integer> preHead = head;
        int pos = 0;
        while(pos < n){
            fast = fast.next;
            pos++;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        Node<Integer> newHead = slow.next;
        slow.next = null;
        fast.next = preHead;
        // head = newHead;
        return newHead;
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
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput();
        int index = sc.nextInt();
        Node<Integer> ans = appendLastNToFirst(head, index);
        print(ans);

    }
}
