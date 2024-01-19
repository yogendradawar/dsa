import java.util.Scanner;
// node class
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
        next = null;
    }
}

public class printithnode {
    // input function
    public static Node<Integer> takeInput(){

        Scanner sc  = new Scanner(System.in);
        Node<Integer> head = null , tail = null;
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

    // method of finding ith node value
    public static void printithNode(Node<Integer> head, int i){
        Node<Integer> temp = head;
        int position  = 0;
        while(temp != null && position < i){
            temp = temp.next;
            position++;
        }

        if(temp != null){
            System.out.print(temp.data);
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        printithNode(head, index);
    }
}
