package dsa.dsa_java.week_7.Queues;

import java.util.Scanner;
import java.util.Stack;

public class reverseTheFirstKElementsInTheQueue {

     public static QueueUsingLL<Integer>takeInput(){
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        QueueUsingLL<Integer>queue = new QueueUsingLL<>();

        for(int i = 0 ; i < n ; i++){
            int data = sc.nextInt();
            queue.enqueue(data);
        }

        return queue;
    }


    public static QueueUsingLL<Integer> reverseKElements(QueueUsingLL<Integer> input, int k) throws QueueEmptyExceptions {
		//Your code goes here
		Stack<Integer> stack = new Stack<>();

		for(int i = 0 ; i < k ; i++){
			stack.push(input.dequeue());
		}

		while(!stack.isEmpty()){
			input.enqueue(stack.pop());
		}

		for(int i  = 0 ; i < input.size() - k ; i++){
			input.enqueue(input.dequeue());
		}

		return input;
	}


     public static void main(String[] args) throws QueueEmptyExceptions 
    {
    	QueueUsingLL<Integer> queue = takeInput();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        reverseKElements(queue, k);

    	while (!queue.isEmpty()) 
        {
    		System.out.print(queue.dequeue() + " ");
    	}
}
}
