import java.util.Scanner;
class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data; 
        next = null;
    }
}
public class palindromell {

    public static Node<Integer> getMid(Node<Integer>head){
        Node<Integer>slow = head;
        Node<Integer> faster = head.next;

        while(faster.next != null && faster.next.next != null){
            slow = slow.next;
            faster = faster.next.next;
        }
        return slow;
    }

    public static Node<Integer> reverse(Node<Integer>head){
        Node<Integer>next = head , prev = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static boolean isPalindrome(Node<Integer> head){
        if(head == null){
            return true;
        }
        
        Node<Integer> midpoint = getMid(head);
        Node<Integer> reverseHead = reverse(midpoint.next);

        while(head!= null && reverseHead != null){

            if(head.data != reverseHead.data){
                return false;
            }
            else{
                head = head.next;
                reverseHead = reverseHead.next;
            }
        }
        return true;
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


    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        System.out.println(isPalindrome(head));
    }
}
