import java.util.Scanner;
class Node<T>{
    T data;
    Node<T> next ;
    
    Node(T data){
        this.data = data;
        this.next = null;
    }
}
public class insertlinkinll {

    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner (System.in);
        Node<Integer> head = null, tail = null;

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


    public static Node<Integer> insert(Node<Integer> head , int data, int pos){
        Node<Integer> newNode = new Node<Integer>(data);
        if(pos == 0){
            newNode.next = head;
            return newNode;
        }

        int i = 0 ;
        Node<Integer> temp = head;
        while(i < pos -1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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
        
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int value = sc.nextInt();

        Node<Integer> newhead = insert(head, value, index);
        print(newhead);
    }
}
