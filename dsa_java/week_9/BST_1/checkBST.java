package dsa.dsa_java.week_9.BST_1;

import java.util.Scanner;

import dsa.dsa_java.week_7.Queues.QueueEmptyExceptions;
import dsa.dsa_java.week_7.Queues.QueueUsingLL;

class Pair<T,V>{
    public T first;
    public V second;
}

public class checkBST {

     public static BinaryTreeNode<Integer> takeInput(Scanner sc) throws QueueEmptyExceptions {
        System.out.println("Enter the root");
        int rootdata = sc.nextInt();

        if (rootdata == -1) { // Assuming -1 denotes a null node
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
        QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<>();
       
        queue.enqueue(root);

        while (!queue.isEmpty()) {

            BinaryTreeNode<Integer> front = queue.dequeue();
            System.out.println("Enter the left child of " + front.data);

            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
                queue.enqueue(child);
                front.left   = child;
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


    //1st Approach by check Function.
    public static boolean check(BinaryTreeNode<Integer> root, int min , int max){
        if(root == null)
        return true;

        if(root.data > min && root.data < max){
            boolean left = check(root.left, min, root.data -1);
            boolean right = check(root.right, root.data, max);

            return left && right;
        }
        else{
        return false;
        }
    }

    public static BinaryTreeNode<Integer> prev = null;
    public static boolean solution(BinaryTreeNode<Integer> root){
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);


        //2nd approach by inorder traversal


        // if(root != null){

        //     if(!solution(root.left))
        //     return false;

        //     if(root != null && root.data <= prev.data)
        //     return false;

        //     prev = root;

        //     return solution(root.right);
        // }

        // return true;
    }

    public static Pair<Boolean, Pair<Integer,Integer>> solution2 (BinaryTreeNode<Integer> root){

        if(root == null){
            Pair<Boolean , Pair<Integer, Integer >> output = new Pair<>();
            output.first = true;
            output.second = new Pair<>();
            output.second.first = Integer.MAX_VALUE;
            output.second.second = Integer.MIN_VALUE;

            return output;
        }

        Pair<Boolean , Pair<Integer,Integer>> leftOutput = solution2(root.left);
        Pair<Boolean, Pair<Integer, Integer>> rightOutput = solution2(root.right);

        int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
        int max = Math.max(root.data , Math.max(leftOutput.second.second, rightOutput.second.second));
        boolean isBst = (root.data > leftOutput.second.second) && (root.data <= rightOutput.second.first) && 
                        (leftOutput.first && rightOutput.first);
                        
        Pair<Boolean , Pair<Integer, Integer >> output = new Pair<>();
        output.first = isBst;
        output.second = new Pair<>();
        output.second.first = min;
        output.second.second = max;
            
        return output;
    }
    public static void main(String[] args) throws QueueEmptyExceptions {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc);
        // System.out.print(solution(root));
        System.out.println(solution2(root).first);
    }
}
