package dsa.dsa_java.week_8.Binary_Tree2;

import java.util.Scanner;

import dsa.dsa_java.week_7.Queues.QueueEmptyExceptions;

public class rootToLeafPathsSumToK {

    
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

    public static void helperFunction(BinaryTreeNode<Integer>root, int k , String output , int sum){
        if(root == null){
            return ;
        }

        if(root.left == null && root.right == null){
            if(sum+root.data == k){
                System.out.println(output + root.data);
            }
            return;
        }
        helperFunction(root.left, k, output+root.data+" ", sum+root.data);
        helperFunction(root.right, k, output+root.data+" ", sum+root.data);
    }
    public static void findthepath(BinaryTreeNode<Integer>root,int k){
        helperFunction(root,k,"",0);
    }

    public static void main(String[] args) throws QueueEmptyExceptions {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println("Enter the k Value: ");
        int k = sc.nextInt();
        findthepath(root, k);
    }
}

