package dsa.dsa_java.week_9.BST_1;

import java.util.Scanner;

public class constructBST {

    public static int[] arrTakeInput(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + "th " + "index: ");
            int value = sc.nextInt();
            arr[i] = value;
        }
        return arr;
    }

    public static void print(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }

    public static BinaryTreeNode<Integer> bst(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }

        int midIndex = start + (end - start) / 2;

        BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(arr[midIndex]);
        node.left = bst(arr, start, midIndex - 1);
        node.right = bst(arr, midIndex + 1, end);

        return node;
    }

    public static BinaryTreeNode<Integer> SortedArrayToBST(int arr[], int n) {
        return bst(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in sorted order");
        System.out.println("Enter the size of Arr :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        arrTakeInput(arr, sc);

        print(SortedArrayToBST(arr, size));
    }
}
