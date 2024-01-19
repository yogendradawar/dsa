package dsa.dsa_java.week_6.Linked_List_2;
import dsa.dsa_java.week_6.Linked_List_2.Node;
import java.util.Scanner;

public class bubblesortll {
    public static int length(Node<Integer>head){
        int cnt = 0;
        while(head != null){
            cnt++;
            head = head.next;
        }
        return cnt;
    }
    public static Node<Integer> bubbleSort(Node<Integer> head) {
        int length = length(head);

        for(int i = 0 ; i < length - 1; i++){
            Node<Integer> prev = null;
            Node<Integer> current = head;

            for(int j = 0 ; j < length - i - 1 ; j++){
                if(current.data <= current.next.data){
                    prev = current;
                    current = current.next;
                }
                else{
                    if(prev == null){
                        Node<Integer>fwd = current.next;
                        head = head.next;
                        current.next = fwd.next;
                        fwd.next = current;
                        prev = fwd;
                    }
                    else{
                        Node<Integer> fwd = current.next;
                        prev.next = fwd;
                        current.next = fwd.next;
                        fwd.next = current;
                        prev = fwd;
                    }
                }
            }
        }
        return  head;
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


    // public static void print(Node<Integer> head){
    //     Node<Integer> temp = head;
    //     while(temp != null){
    //         System.out.print(temp.data +" ");
    //         temp = temp.next;
    //     }
    // }
    public static void print(Node<Integer> head){
    
    if(head==null){
        return ;
      }

      System.out.print(head.data+" ");
      print(head.next);
      
    }

    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        Node<Integer> ans = bubbleSort(head);
        print(ans);
    }
    // private static void print(Node<Integer> ans) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'print'");
    // }
}
