package dsa.dsa_java.week_7.Queues;

import java.util.Scanner;

public class QueueUse {
    public static void main(String[] args) throws QueueEmptyExceptions, QueueFullExceptions {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Queue Size:" + " ");
        int size = sc.nextInt();
        QueueUsingArrays queue = new QueueUsingArrays(size);
        int options;
        do {
            System.out.println("1. Get the size , 2. isEmpty 3. front value 4. insert 5. delete 6.EXIT");

            options = sc.nextInt();

            switch (options) {
                case 1:
                    System.out.println("size: " + queue.size());
                    break;
                case 2:
                    System.out.println(queue.isEmpty());
                    break;
                case 3:
                    System.out.println("Front: " + queue.front());
                    break;
                case 4:
                    if (queue.size() != size) {
                        System.out.print("Enter the new element to insert: ");
                        int element = sc.nextInt();
                        queue.enqueue(element);
                        System.out.println("Element inserted successfully.");
                    } else {
                        System.out.println("Queue is full. Cannot insert more elements.");
                    }
                    break;
                case 5:
                    if (!queue.isEmpty()) {
                        System.out.println("Dequeued element: " + queue.dequeue());
                    } else {
                        System.out.println("Queue is empty. Cannot dequeue.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Statement");
                    break;
            }
        } while (options != 6);

        // Print remaining elements in the queue
        System.out.print("Remaining elements in the queue: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");

        }
    }
}
