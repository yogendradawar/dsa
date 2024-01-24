package dsa.dsa_java.week_8.Binary_Tree1;

import java.util.Scanner;
import dsa.dsa_java.week_7.Queues.QueueEmptyExceptions;
import dsa.dsa_java.week_7.Queues.QueueUsingLL;

public class TreeUse {

    public static TreeNode<Integer> takeInput(Scanner sc) {

        System.out.println("Enter next node data");
        int n = sc.nextInt();

        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter the number of Children for " + n);
        int children = sc.nextInt();
        for (int i = 0; i < children; i++) {
            TreeNode<Integer> child = takeInput(sc);
            root.children.add(child);
        }

        return root;
    }

    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root Node: ");
        int rootData = sc.nextInt();
        QueueUsingLL<TreeNode<Integer>> pendingQueue = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingQueue.enqueue(root);
        while (!pendingQueue.isEmpty()) {
            try {
                TreeNode<Integer> front = pendingQueue.dequeue();
                System.out.println("Enter num of children of " + front.data);
                int numChildren = sc.nextInt();
                for (int i = 0; i < numChildren; i++) {
                    System.out.println("Enter " + (i + 1) + "th child of " + front.data);
                    int child = sc.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                    front.children.add(childNode);
                    pendingQueue.enqueue(childNode);
                }
            } catch (QueueEmptyExceptions e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    public static void printLevelWise(TreeNode<Integer> root) {
        QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<>();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            try {
                TreeNode<Integer> front = queue.dequeue();
                System.out.print(front.data + ":");

                for (int i = 0; i < front.children.size(); i++) {
                    TreeNode<Integer> child = front.children.get(i);
                    System.out.print(child.data + ",");
                    queue.enqueue(child);
                }
                System.out.println();
            } catch (QueueEmptyExceptions e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

    public static int numNodes(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int cnt = 1;
        for (int i = 0; i < root.children.size(); i++) {
            cnt += numNodes(root.children.get(i));
        }
        return cnt;
    }

    public static int largest(TreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int ans = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int child = largest(root.children.get(i));
            if (child > ans) {
                ans = child;
            }
        }

        return ans;
    }

    public static int maxheight(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int maxheight = 0;
        for(int  i = 0 ; i < root.children.size(); i++){
            int childHeight = maxheight(root.children.get(i));
            maxheight = Math.max(maxheight, childHeight);
        }
        return maxheight + 1;
    }

    public static void printAtk(TreeNode<Integer> root , int k){
        if(k < 0){
            return ;
        }
        if (k == 0){
            System.out.println("Node :" + root.data);
        }

        for(int i = 0 ; i < root.children.size() ; i++){
            printAtk(root.children.get(i), k-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TreeNode<Integer> root = takeInput(sc);
        TreeNode<Integer> root = takeInputLevelWise();
        // print(root);
        printLevelWise(root);
        System.out.println("Number of nodes: " + numNodes(root));
        System.out.println("Largest Node: " + largest(root));
        System.out.println("Maximum height of tree: " + maxheight(root));
        printAtk(root, 2);
    }
}
