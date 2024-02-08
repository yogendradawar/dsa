package dsa.dsa_java.week_8.Binary_Tree2;

import java.util.Scanner;

import dsa.dsa_java.week_7.Queues.QueueEmptyExceptions;

public class level_Order_traversal {

      public static BinaryTreeNode<Integer> takeInputLevelWise() throws QueueEmptyExceptions{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Root");
        int rootData = sc.nextInt();
        
        if(rootData == -1){
            return null;
        }

        QueueUsingLL<BinaryTreeNode<Integer>> pendingQueue = new QueueUsingLL<>();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        pendingQueue.enqueue(root);

        while (!pendingQueue.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingQueue.dequeue();
            System.out.println("Enter left child of " + front.data);
            int leftChild = sc.nextInt();
            if(leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
                pendingQueue.enqueue(child);
                front.left = child;
            }

            System.out.println("Enter Right child of " + front.data);
            int rightChild = sc.nextInt();

            if(rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
                pendingQueue.enqueue(child);
                front.right = child;
            }
        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer>root) throws QueueEmptyExceptions{
        QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<>();
        queue.enqueue(root); 
        queue.enqueue(null);

        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> newNode = queue.dequeue();
            if(newNode == null){
                if(queue.isEmpty()){
                    return;
                }
                queue.enqueue(null);
                System.out.println();
            }
            else{
                System.out.print(newNode.data + " ");
                
                if(newNode.left!= null){
                    queue.enqueue(newNode.left);
                }

                if(newNode.right != null){
                    queue.enqueue(newNode.right);
                }
            }
        }
       }
    public static void main(String[] args) throws QueueEmptyExceptions {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
    }
}
