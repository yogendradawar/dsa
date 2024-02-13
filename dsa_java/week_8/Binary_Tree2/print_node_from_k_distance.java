package dsa.dsa_java.week_8.Binary_Tree2;

import java.util.Scanner;

import dsa.dsa_java.week_7.Queues.QueueEmptyExceptions;

public class print_node_from_k_distance {
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

    public static void nodesdepth (BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return;
        }

        if(k == 0){
            System.out.println(root.data);
            return;
        }

        nodesdepth(root.left, k-1);
        nodesdepth(root.right, k-1);
    }

    public static int nodesADK(BinaryTreeNode<Integer>root,int node,int k){
        if(root == null){
            return -1;
        }

        if(root.data == node){
            nodesdepth(root,k);
            return 0;
        }
        

        int leftNode = nodesADK(root.left, node, k);
        
        if(leftNode !=  -1){
            if(leftNode +1 == k){
                System.out.println(root.data);
            }
            else{
                nodesdepth(root.right,k - leftNode -2);
            }

            return 1 + leftNode;
        }

        int rightNode = nodesADK(root.right, node , k);

        if(rightNode !=  -1){
            if(rightNode +1 == k){
                System.out.println(root.data);
            }
            else{
                nodesdepth(root.left,k - leftNode -2);
            }

            return 1 + rightNode;
        }

        return -1;
    }

    public static void nodesAtDistanceK(BinaryTreeNode<Integer>root, int node, int k){
        nodesADK(root,node,k);
    }
    public static void main(String[] args) throws QueueEmptyExceptions {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target Node: ");
        int node = sc.nextInt();

        System.out.println("Enter the kth distance ");
        int k = sc.nextInt();
        nodesAtDistanceK(root,node,k);
    }
}
