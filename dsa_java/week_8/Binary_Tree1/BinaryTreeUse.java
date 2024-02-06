package dsa.dsa_java.week_8.Binary_Tree1;

import java.util.Scanner;

import dsa.dsa_java.week_7.Queues.QueueEmptyExceptions;
import dsa.dsa_java.week_7.Queues.QueueUsingLL;

public class BinaryTreeUse  {

    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
            System.out.println("Enter root data");
            int rootData = sc.nextInt();

            if(rootData == -1){
                return null;
            }

            BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
            root.left = takeInput(sc);
            root.right = takeInput(sc);
            return root;
    }

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

    public static void print(BinaryTreeNode<Integer> root){
        if (root == null) {
            return ;
        }

        String toBePrinted = root.data + " ";
        if(root.left != null){
            toBePrinted += "L:" + root.left.data +  ",";
        }

        if(root.right != null){
            toBePrinted += "R:" + root.right.data ;
        }

        System.out.println(toBePrinted);
        print(root.left);
        print(root.right);
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

    public static int sumOfNodes(BinaryTreeNode<Integer> root){

        if(root == null){
            return 0;
        }

       int leftSum = sumOfNodes(root.left);
       int rightSum = sumOfNodes(root.right);

       return leftSum + rightSum + root.data;
    }

    public static void preOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
         System.out.print(root.data + " ");
         preOrder(root.left);
         preOrder(root.right);
    }

    public static void postOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static int countNodesGreaterThanX(BinaryTreeNode<Integer>root, int X){
        if(root == null){
            return 0;
        }

        if(root.data > X){
            return 1 + countNodesGreaterThanX(root.left, X) + countNodesGreaterThanX(root.right, X);
        }
        else{
            return countNodesGreaterThanX(root.left, X)+countNodesGreaterThanX(root.right, X);
        }
    }

    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        int ans = Math.max(left, right) + 1;

        return ans;

        // return Math.max(height(root.left), height(root.right)+1);
    }

    public static void changeToDepthTreeHelper(BinaryTreeNode<Integer>root , int value){
        if(root == null){
            return;
        }

        root.data = value;
        changeToDepthTreeHelper(root.left,value+1);
        changeToDepthTreeHelper(root.right, value + 1);
    }

    public static void changeToDepthTree(BinaryTreeNode<Integer> root){
        changeToDepthTreeHelper(root,0);
    }

    public static void printNodesWithoutSibling(BinaryTreeNode<Integer>root){
        if(root == null){
            return;
        }

        if(root.left != null && root.right == null){
            System.out.print(root.left + " ");
        }
        else if (root.right != null && root.left == null){
            System.out.print(root.right +" ");
        }

        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }

    public static BinaryTreeNode<Integer> removeLeafNode(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        if(root.left == null && root.right == null){
            return null;
        }

        root.left = removeLeafNode(root.left);
        root.right = removeLeafNode(root.right);

        return root;
    }

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
        return;
    }

    //bad time complexity Worst case:- O(n2), avg case:- O(nlogn)
    public static boolean isBalanced(BinaryTreeNode<Integer> root){

        if(root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1)
        return false;

        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }

    public static int isBalancedOptimized(BinaryTreeNode<Integer> root){
        if(root == null)return 0;

        int leftHeight = isBalancedOptimized(root.left);
        if(leftHeight == -1){
            return -1;
        }

        int rightHeight = isBalancedOptimized(root.right);
        if(rightHeight == -1){
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1 ;

    }

     //time complexity Worst case:- O(n)
    public static boolean isBalancedImproved(BinaryTreeNode<Integer>root){
        return isBalancedOptimized(root) != -1;
        // if(num == -1){
        //     return false;
        // }
        // return true;
    }

    public static Pair<Integer,Integer> heightDiameter (BinaryTreeNode<Integer> root){

        if(root == null){
            Pair<Integer,Integer> output = new Pair<>();
            output.first = 0;
            output.second = 0;
            return output;
        }

        Pair<Integer,Integer> lo = heightDiameter(root.left);
        Pair<Integer,Integer> ro = heightDiameter(root.right);

        int height = 1 + Math.max(lo.first, ro.first);
        int option1 = lo.first + ro.first;
        int option2 = lo.second;
        int option3 = ro.second;
        int diameter = Math.max(option1, Math.max(option2, option3));
        Pair<Integer,Integer> output = new Pair<>();
        output.first = height;
        output.second = diameter;
        return output;

    }
   public static void main(String[] args) throws QueueEmptyExceptions {

     // BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
    // BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
    // BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);

    // root.left = node1;
    // root.right = node2;

    Scanner sc = new Scanner(System.in);
    // BinaryTreeNode<Integer> root = takeInput(sc);
    BinaryTreeNode<Integer> root = takeInputLevelWise();
    // print(root);

    // System.out.println("OUTPUT: ");
    // printLevelWise(root);

    // System.out.println("Sum of Nodes : "+sumOfNodes(root));

    // System.out.print("Pre Order : " );
    // preOrder(root);
    // System.out.println();

    // System.out.print("Post Order: ");
    // postOrder(root);
    // System.out.println();

    // System.out.println("Enter the value of X :");
    // int x = sc.nextInt();
    // System.out.println("Greater Than X nodes are: " + countNodesGreaterThanX(root,x) );

    // System.out.println("Height of BT: " + height(root));
    // changeToDepthTree(root);

    // printLevelWise(root);
    // printNodesWithoutSibling(root);

    // System.out.println("Removed Leaf Nodes - ");
    // removeLeafNode(root);
    // printLevelWise(root);

    // System.out.println("Mirror image: ");
    // mirrorBinaryTree(root);

    //bad time complexity Worst case:- O(n2), avg case:- O(nlogn)
    // System.out.println("is balanced : " + isBalanced(root));

    // System.out.println("is balanced : " + isBalancedImproved(root));

    System.out.println("Height: " + heightDiameter(root).first);
    System.out.print("Diameter: " + heightDiameter(root).second);
   }

}
