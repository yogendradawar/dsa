package dsa.dsa_java.week_9.BST_1;

import java.util.Scanner;

import dsa.dsa_java.week_7.Queues.QueueEmptyExceptions;
import dsa.dsa_java.week_7.Queues.QueueUsingLL;

public class element_between_k1_and_k2 {

     public static BinaryTreeNode<Integer> takeInput() throws QueueEmptyExceptions {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root");
        int rootdata = sc.nextInt();

        QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<>();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
        queue.enqueue(root);

        while (!queue.isEmpty()) {

            BinaryTreeNode<Integer> front = queue.dequeue();
            System.out.println("Enter the left child of " + front.data);

            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
                queue.enqueue(child);
                front.left = child;
            }

            System.out.println("Enter the right child of " + front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
                queue.enqueue(child);
                front.right = child;
            }
        }
        return root;
    }

    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root , int k1, int k2){
        if(root == null){
            return;
        }

        if(k1 <= root.data && k2 >= root.data){
            elementsInRangeK1K2(root.left, k1, k2);
            System.out.print(root.data + " ");
            elementsInRangeK1K2(root.right, k1, k2);
        }
        else if (k1 < root.data){
            elementsInRangeK1K2(root.left, k1, k2);
        }
        else if (k2 > root.data){
            elementsInRangeK1K2(root.right, k1, k2);
        }
    }
    public static void main(String[] args) throws QueueEmptyExceptions {
        BinaryTreeNode<Integer> root = takeInput();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the k1 value: ");
        int k1 = sc.nextInt();

        System.out.println("Enter the k2 value: ");
        int k2 = sc.nextInt();

        elementsInRangeK1K2(root, k1 , k2);
    }
}
