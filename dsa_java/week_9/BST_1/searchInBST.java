package dsa.dsa_java.week_9.BST_1;

import java.util.Scanner;
import dsa.dsa_java.week_7.Queues.QueueEmptyExceptions;
import dsa.dsa_java.week_7.Queues.QueueUsingLL;

/**
 * searchInBST
 */
public class searchInBST {
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

    public static boolean bstSearch(BinaryTreeNode<Integer>root,int  k){
        if(root == null){
            return false;
        }

        if(root.data == k){
            return true;
        }

        if(k > root.data){
            return bstSearch(root.right, k);
        }
        else{
            return bstSearch(root.left, k);
        }
    } 
    public static void main(String[] args) throws QueueEmptyExceptions {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput();
        System.out.println("Enter the k value");
        int k = sc.nextInt();
        System.out.print("Value of : "+ k + " is "+ bstSearch(root,k));
    }
}