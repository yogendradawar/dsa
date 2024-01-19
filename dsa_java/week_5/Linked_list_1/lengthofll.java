import java.util.Scanner;
class Node<T>{
    T data;
    Node<T> next ;
    Node(T data){
        this.data = data;
        next = null;
    }
}




class lengthofLL {


    // print fun for to print linkedlist;
    public static void print (Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }



    //take input fun for the ll list;
    public static Node<Integer> takeInput(){
        Node<Integer> head = null, tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer>newNode = new Node<Integer>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                // Node<Integer> temp = head;
                // while(temp.next != null ){
                //     temp = temp.next;
                // }
                // temp.next = newNode;
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    //Get size of linkedlist

    public static int getSize(Node<Integer> head){
        Node<Integer> temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }



    public static void main(String[] args) {
        // Node<Integer> node1 = new Node<>(10);
        // System.out.println(node1.data);
        Node<Integer> head = takeInput();
        // print(head);
        System.out.print(getSize(head));
        

    }
}
