package dsa.dsa_java.week_7.Queues;
import java.util.Queue;
import java.util.Scanner;
public class reverseQueue {

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

    public static void reverseQueue(QueueUsingLL<Integer> input) throws QueueEmptyExceptions {
		//Your code goes here
		if(input.size() <= 1){
			return;
		}

	int  front = input.dequeue();
		reverseQueue(input);

		input.enqueue(front);
	}
    public static void main(String[] args) throws QueueEmptyExceptions {
        QueueUsingLL <Integer> queue = takeInput();
        reverseQueue(queue);

        while (!queue.isEmpty()) 
            {
				System.out.print(queue.dequeue() + " ");
			}
    }
}
