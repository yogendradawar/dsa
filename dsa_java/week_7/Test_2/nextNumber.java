package dsa.dsa_java.week_7.Test_2;

import java.util.Scanner;
class LinkedListNode<T>{
    T data;
    LinkedListNode<T> next;

    LinkedListNode(T data){
        this.data = data;
    }
}


public class nextNumber {
     public static LinkedListNode<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        LinkedListNode<Integer> head= null, tail = null;
        int data =sc.nextInt();

        while(data != -1){
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
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

     public static void print (LinkedListNode<Integer> head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
     }

     public static LinkedListNode<Integer> reverse (LinkedListNode<Integer>head){

		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> current = head;

		while(current != null){
			LinkedListNode<Integer> temp = current.next;
			current.next = prev;
			prev = current;
			current  = temp;
		}

		return prev;
	}

	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {

			head = reverse(head);
			LinkedListNode<Integer> ptr = head;
			LinkedListNode<Integer> prv = null;
			int carry = 1,num;
			while(ptr!=null){
				num = ((ptr.data) + carry) % 10;
				carry = ((ptr.data) + carry ) / 10;   
				ptr.data = num;
				prv = ptr;
				ptr = ptr.next;
			}

			if(carry == 1 ){
				LinkedListNode<Integer> tail = new LinkedListNode<>(carry);
				prv.next = tail;
			}

			return reverse(head);
	}


    public static void main(String[] args) {
        
        LinkedListNode<Integer> head = takeInput();
		nextLargeNumber(head);
		print(head);
    }
    
}
