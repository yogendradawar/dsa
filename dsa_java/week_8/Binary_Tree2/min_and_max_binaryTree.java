package dsa.dsa_java.week_8.Binary_Tree2;

import java.util.Scanner;

import dsa.dsa_java.week_7.Queues.QueueEmptyExceptions;

class Pair<T,U>{
    T minimum;
    U maximum;

Pair(T minimum , U maximum){
    this.minimum = minimum;
    this.maximum = maximum;
}

}

public class min_and_max_binaryTree {

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

    public static void printLevelWise(BinaryTreeNode<Integer> root) throws QueueEmptyExceptions{
        if(root == null){
            return;
        }

        QueueUsingLL<BinaryTreeNode<Integer>> pendingQueue = new QueueUsingLL<>();
        pendingQueue.enqueue(root);

        while (!pendingQueue.isEmpty()) {
            BinaryTreeNode<Integer> frontNode = pendingQueue.dequeue();
            System.out.print(frontNode.data + " : ");

            if (frontNode.left != null) {
                System.out.print("L : " + frontNode.left.data + ", ");
                pendingQueue.enqueue(frontNode.left);
            }
            else {
                System.out.print("L: null, ");
            }

            if (frontNode.right != null) {
                System.out.print("R : " + frontNode.right.data);
                pendingQueue.enqueue(frontNode.right);
            } else {
                System.out.print("R : null");
            }

            System.out.println();
        }
    }

    public static Pair<Integer,Integer> getMinAndMax(BinaryTreeNode<Integer> root){
        if(root == null){
            return new Pair(null, null);
        }

        Pair<Integer,Integer> leftNode = getMinAndMax(root.left);
        Pair<Integer,Integer> rightNode = getMinAndMax(root.right);

        int min = root.data;
        int max = root.data;

        if(leftNode.minimum != null){
            min = Math.min(min, leftNode.minimum);
        }

        if(leftNode.maximum != null){
            max = Math.max(max, leftNode.maximum);
        }

        if(rightNode.minimum != null){
            min = Math.min(min, rightNode.minimum);
        }

        if(rightNode.maximum != null){
            max = Math.max(max, rightNode.maximum);
        }

        return new Pair(min, max);
    }
    public static void main(String[] args) throws QueueEmptyExceptions {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println("Minimum:"+getMinAndMax(root).minimum + 
        " Maximum:"+getMinAndMax(root).maximum );
    }
}
