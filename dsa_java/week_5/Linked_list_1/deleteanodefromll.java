import java.util.Scanner;

class Node<T>{
    T data;
    Node<T>next;

    Node(T data){
        this.data = data;
        next = null;
    }
}



public class deleteanodefromll {

    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
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

    public static void print(Node<Integer>head){
        Node<Integer>temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    public static Node<Integer> delete(Node<Integer> head, int pos){

        // MY APPROACH TO SOLVE THESE PROMBLE

            // if(pos == 0 && head.next != null){
            //     return head = head.next;
            // }
            // Node<Integer>temp = head;
            // int i = 0;
            // while(temp != null && i < pos-1 ){
            //         temp = temp.next;
            //         i++;
            // }

            // if(temp.next.next != null){
            //         temp.next = temp.next.next;
            // }
            // else{
            //     temp.next = null;
            // }

            // return head;


         // SOLUTION
         if(head == null){
            return head;
         }

        if(pos == 0){
            return head.next;
        }

        Node<Integer> temp = head , prev = head;
        int cnt = 0;
        while(temp!= null){
            if(cnt == pos){
                prev.next = temp.next;
                break;
            }
            else{
                prev = temp;
                temp = temp.next;
                cnt++;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        Node<Integer> newhead = delete(head, index);
        print(newhead);
    }
}
